import os
import shutil
import time
import csv
import threading
import subprocess
from nimrod.tools.randoop import Randoop
from nimrod.tools.mujava import MuJava
from nimrod.mutant import Mutant
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit, JUnitResult, Coverage
from nimrod.tools.evosuite import Evosuite
from nimrod.utils import package_to_dir
from nimrod.project_info import commit, git_project, merge_scenario, report_directory
from collections import namedtuple
from nimrod.project_info.git_project import GitProject
import shutil
from nimrod.tools.java import Java
from nimrod.tools.maven import Maven
from nimrod.tests.utils import get_config
from nimrod.project_info.merge_scenario import MergeScenario
NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout', 'test_tool', 'is_equal_coverage'])
class evotest:


    def __init__(self):
        self.dRegCp = None #base
        self.classes_dir = None #left
        self.mergeDir = None #merge

        self.config = get_config()
        self.evosuite_diff_params = None
        self.suite_evosuite_diff =None

        self.sut_class = None
        self.java = Java(self.config['java_home'])
        self.maven = Maven(self.java, self.config['maven_home'])
        self.tests_dst = self.config["tests_dst"]
        self.project = GitProject(self.config["repo_dir"])
        self.projects_folder = self.config["projects_folder"]
        self.path_hash_csv = self.config["path_hash_csv"]
        self.path_output_csv = self.config["path_output_csv"]

    def gen_evosuite_diff(self, scenario):
        evosuite = Evosuite(
            java=self.java,
            classpath=self.classes_dir,
            sut_class=self.sut_class,
            params=self.evosuite_diff_params,
            tests_src=self.tests_dst + '/' + self.project.get_project_name() + '/' + scenario.get_merge_hash()
        )
        self.suite_evosuite_diff = evosuite.generate_differential(self.dRegCp)
        return self.suite_evosuite_diff

    def try_evosuite_diff(self, classes_dir, sut_class, mutant_dir):
        junit = JUnit(java=self.java, classpath=classes_dir)
        res = junit.run_with_mutant(self.suite_evosuite_diff, sut_class, mutant_dir)
        return res

    def analyze_commits(self, scenario):

        data = [(scenario.get_base_hash(), "base"), (scenario.get_left_hash(), "left"), (scenario.get_right_hash(), "right"), (scenario.get_merge_hash(), "merge")]
        self.sut_class = scenario.get_sut_class()
        for hash in data:
            self.project.checkout_on_commit(hash[0])
            a = self.maven.compile(self.project.get_path_local_project(), 120, clean=True, install=True)
            print(a)
            self.maven.save_dependencies(self.project.get_path_local_project())
            dst = self.projects_folder + self.project.get_project_name() + "/" + data[3][0] + "/"+ hash[1]
            if os.path.exists(dst):
                shutil.rmtree(dst)

            shutil.copytree(self.project.get_path_local_project(), dst)


    def generateDependenciesPath(self,scenario, commit_type):
        project_folder = self.projects_folder + self.project.get_project_name() + "/" +scenario.get_merge_hash() + "/"

        dependencies = [(x[0], x[2]) for x in os.walk(project_folder + commit_type+"/target/dependency/")]
        depPath = dependencies[0][0]
        finalPath=""
        print(depPath)
        for dependency in dependencies[0][1]:
            finalPath = finalPath + depPath + dependency + ":"

        finalPath = depPath + ":"+ finalPath +project_folder + commit_type + "/target/classes/"

        return finalPath

    def writeOutputCsv(self, outputBase, outputLeft, outputMerge, scenario):

        output=[scenario.get_merge_hash(), "False"]
        if outputBase[1] and not outputLeft[1] and outputMerge[1]:
            output = [scenario.get_merge_hash(), "True"]

        with open(self.path_output_csv, 'a') as fd:
            writer = csv.writer(fd)
            writer.writerow(output)




if __name__ == '__main__':

    evo = evotest()

    merge = MergeScenario(evo.project.get_path_local_project, evo.path_hash_csv)
    merge_scenarios = merge.get_merge_scenarios()
    for scenario in merge_scenarios:
        evo.analyze_commits(scenario)

        evo.dRegCp = evo.generateDependenciesPath(scenario, "base")
        evo.classes_dir = evo.generateDependenciesPath(scenario, "left")
        evo.mergeDir = evo.generateDependenciesPath(scenario, "merge")

        #thread_evosuite_diff = threading.Thread(target=evo.gen_evosuite_diff)
        print("waiting analisys finish")
        evo.gen_evosuite_diff(scenario)
        #thread_evosuite_diff.start()
        #thread_evosuite_diff.join()
        print("ended")

        time.sleep(5)
        test_result = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.dRegCp)#fail on base
        #time.sleep(4)
        test_result2 = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.classes_dir)#pass on left
        #time.sleep(4)

        test_result3 = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.mergeDir)#fail on merge



    #test_result = evo.try_evosuite_diff(evo.dRegCp, evo.sut_class, evo.classes_dir) #ok

    #test_result = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.classes_dir) #ok

    #test_result = evo.try_evosuite_diff(evo.dRegCp, evo.sut_class, evo.dRegCp) #notok ----

    #test_result = evo.try_evosuite_diff(evo.mergeDir, evo.sut_class, evo.mergeDir) #ok

    #test_result = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.mergeDir)#ok

    #test_result = evo.try_evosuite_diff(evo.dRegCp, evo.sut_class, evo.mergeDir)#ok

    #test_result = evo.try_evosuite_diff(evo.mergeDir, evo.sut_class, evo.dRegCp)#notok ----

    #test_result = evo.try_evosuite_diff(evo.mergeDir, evo.sut_class, evo.classes_dir)#ok



        print(test_result)
        print(test_result2)
        print(test_result3)
        evo.writeOutputCsv(test_result, test_result2, test_result3, scenario)



