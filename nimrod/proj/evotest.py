import os
import shutil
import time
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
        self.dRegCp = '/home/jprm/Documents/IC/example-project-evosuite/base/target/dependency/:/home/jprm/Documents/IC/example-project-evosuite/base/target/dependency/apiguardian-api-1.0.0.jar:/home/jprm/Documents/IC/example-project-evosuite/base/target/dependency/commons-lang3-3.0.jar:/home/jprm/Documents/IC/example-project-evosuite/base/target/dependency/hamcrest-core-1.3.jar:/home/jprm/Documents/IC/example-project-evosuite/base/target/dependency/junit-4.13-beta-1.jar:/home/jprm/Documents/IC/example-project-evosuite/base/target/dependency/junit-jupiter-api-5.0.3.jar:/home/jprm/Documents/IC/example-project-evosuite/base/target/dependency/junit-platform-commons-1.0.3.jar:/home/jprm/Documents/IC/example-project-evosuite/base/target/dependency/opentest4j-1.0.0.jar:/home/jprm/Documents/IC/example-project-evosuite/base/target/classes/'
        self.classes_dir = '/home/jprm/Documents/IC/example-project-evosuite/left/target/dependency/:/home/jprm/Documents/IC/example-project-evosuite/left/target/dependency/apiguardian-api-1.0.0.jar:/home/jprm/Documents/IC/example-project-evosuite/left/target/dependency/commons-lang3-3.0.jar:/home/jprm/Documents/IC/example-project-evosuite/left/target/dependency/hamcrest-core-1.3.jar:/home/jprm/Documents/IC/example-project-evosuite/left/target/dependency/junit-4.13-beta-1.jar:/home/jprm/Documents/IC/example-project-evosuite/left/target/dependency/junit-jupiter-api-5.0.3.jar:/home/jprm/Documents/IC/example-project-evosuite/left/target/dependency/junit-platform-commons-1.0.3.jar:/home/jprm/Documents/IC/example-project-evosuite/left/target/dependency/opentest4j-1.0.0.jar:/home/jprm/Documents/IC/example-project-evosuite/left/target/classes/'
        self.mergeDir = '/home/jprm/Documents/IC/example-project-evosuite/merge/target/dependency/:/home/jprm/Documents/IC/example-project-evosuite/merge/target/dependency/apiguardian-api-1.0.0.jar:/home/jprm/Documents/IC/example-project-evosuite/merge/target/dependency/commons-lang3-3.0.jar:/home/jprm/Documents/IC/example-project-evosuite/merge/target/dependency/hamcrest-core-1.3.jar:/home/jprm/Documents/IC/example-project-evosuite/merge/target/dependency/junit-4.13-beta-1.jar:/home/jprm/Documents/IC/example-project-evosuite/merge/target/dependency/junit-jupiter-api-5.0.3.jar:/home/jprm/Documents/IC/example-project-evosuite/merge/target/dependency/junit-platform-commons-1.0.3.jar:/home/jprm/Documents/IC/example-project-evosuite/merge/target/dependency/opentest4j-1.0.0.jar:/home/jprm/Documents/IC/example-project-evosuite/merge/target/classes/'

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

    def gen_evosuite_diff(self):
        evosuite = Evosuite(
            java=self.java,
            classpath=self.classes_dir,
            sut_class=self.sut_class,
            params=self.evosuite_diff_params,
            tests_src=self.tests_dst
        )
        self.suite_evosuite_diff = evosuite.generate_differential(self.dRegCp)
        return self.suite_evosuite_diff


    def try_evosuite_diff(self, classes_dir, sut_class, mutant_dir):
        junit = JUnit(java=self.java, classpath=classes_dir)
        return junit.run_with_mutant(self.suite_evosuite_diff, sut_class, mutant_dir)


    def create_nimrod_result(test_result, differential, test_tool, is_equal_coverage=False):
        return NimrodResult(
            test_result.fail_tests == 0 and not test_result.timeout,
            test_result.fail_tests > 0 or test_result.timeout,
            test_result.coverage, differential, test_result.timeout, test_tool, is_equal_coverage)


    def analyze_commits(self, commit):

        data = [(commit.get_base_hash(), "base"), (commit.get_left_hash(), "left"), (commit.get_right_hash(), "right"), (commit.get_merge_hash(),"merge")]
        self.sut_class = commit.get_sut_class()
        for hash in data:
            self.project.checkout_on_commit(hash[0])
            a =self.maven.compile(self.project.get_path_local_project(), 120, clean=True, install=True)
            print(a)
            self.maven.save_dependencies(self.project.get_path_local_project())
            dst = self.projects_folder + self.project.get_project_name() + "/" + hash[1]
            if os.path.exists(dst):
                shutil.rmtree(dst)

            shutil.copytree(self.project.get_path_local_project(), dst)


    def generateDependenciesPath(self,commit_type):
        project_folder = self.projects_folder + self.project.get_project_name() + "/"

        dependencies = [(x[0], x[2]) for x in os.walk(project_folder+ commit_type+"/target/dependency/")]
        depPath = dependencies[0][0]
        finalPath=""
        print(depPath)
        for dependency in dependencies[0][1]:
            finalPath = finalPath + depPath + dependency + ":"

        finalPath = depPath + ":"+ finalPath +project_folder + commit_type + "/target/classes/"

        return finalPath


if __name__ == '__main__':

    evo = evotest()

    merge = MergeScenario(evo.project.get_path_local_project, evo.path_hash_csv)
    merge_scenarios = merge.get_merge_scenarios()
    for scenario in merge_scenarios:
        evo.analyze_commits(scenario)
        #print(scenario.get_sut_class())

    evo.dRegCp = evo.generateDependenciesPath("base")
    evo.classes_dir = evo.generateDependenciesPath("left")
    evo.mergeDir = evo.generateDependenciesPath("merge")

    thread_evosuite_diff = threading.Thread(target=evo.gen_evosuite_diff)
    print("waiting analisys finish")
    thread_evosuite_diff.start()
    thread_evosuite_diff.join()
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



'''
    evo = evotest()/
    mvn = evo.maven
    project = GitProject("/home/jprm/Documents/IC/ex/example-project-evosuite")

    projects_folder = "/home/jprm/Documents/IC/ex/Projects/"

    hash_type = "base"
    project.checkout_on_commit("78d4c577691721383765e82f2e2397a189a7f041")

    res = mvn.clean(project.get_path_local_project(), 60)
    res2= mvn.save_dependencies(project.get_path_local_project())
    print(res2)

    dst = projects_folder +project.get_project_name()+"/"+hash_type;
    if os.path.exists(dst):
        shutil.rmtree(dst)

    base_dir = shutil.copytree(project.get_path_local_project(), dst)
    print(base_dir)

    project.checkout_on_commit("c8f232ee75c4ec2928953d19c3479dbb5a4ba12b")
    hash_type = "left"

    res = mvn.clean(project.get_path_local_project(), 60)
    res2= mvn.save_dependencies(project.get_path_local_project())
    print(res2)

    dst = projects_folder +project.get_project_name()+"/"+hash_type;
    if os.path.exists(dst):
        shutil.rmtree(dst)
    left_dir = shutil.copytree(project.get_path_local_project(), dst)

    project.checkout_on_commit("f89d96f9e05a663908f4bdd1c408e2d20be9ed0f")

    hash_type = "merge"

    res = mvn.clean(project.get_path_local_project(), 60)
    res2= mvn.save_dependencies(project.get_path_local_project())
    print(res2)

    dst = projects_folder +project.get_project_name()+"/"+hash_type;
    if os.path.exists(dst):
        shutil.rmtree(dst)
    merge_dir = shutil.copytree(project.get_path_local_project(), dst)



    #if test_result.fail_tests > 0 or test_result.timeout:
    #    results = evo.create_nimrod_result(test_result, True, 'evosuite')



    test_result = evo.try_evosuite_diff(evo.classes_dir, evo.tests_src,evo.sut_class)

    if test_result.fail_tests > 0 or test_result.timeout:
        results[mutant.mid] = self.create_nimrod_result(test_result,
                                                        True, 'evosuite')
'''