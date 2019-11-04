import os
import shutil
import time
import re
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
from tempfile import mkstemp
import fileinput

from shutil import move

from os import fdopen, remove
NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout', 'test_tool', 'is_equal_coverage'])


class evotest:

    def __init__(self, path_local_project, path_local_module_analysis):

        self.config = get_config()
        self.dRegCp = None  # base
        self.classes_dir = None  # left
        self.mergeDir = None  # merge

        self.evosuite_diff_params = None
        self.suite_evosuite_diff = None

        self.suite_evosuite = None
        self.evosuite_params = None

        self.suite_randoop = None
        self.randoop_params = None

        self.sut_class = None

        self.java = Java(self.config['java_home'])
        self.maven = Maven(self.java, self.config['maven_home'])
        self.tests_dst = self.config["tests_dst"]
        self.project = GitProject(path_local_project, path_local_module_analysis)
        self.projects_folder = self.config["projects_folder"]
        self.path_hash_csv = self.config["path_hash_csv"]
        self.path_output_csv = self.config["path_output_csv"]

    def set_git_project(self, path):
        self.project = GitProject(path)

    def gen_evosuite_diff(self, scenario):

        evosuite = Evosuite(
            java=self.java,
            classpath=self.classes_dir,
            sut_class=self.sut_class,
            params=self.evosuite_diff_params,
            tests_src=self.tests_dst + '/' + self.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash()
        )
        self.suite_evosuite_diff = evosuite.generate_differential(self.dRegCp)
        return self.suite_evosuite_diff

    def gen_evosuite(self, scenario):
        evosuite = Evosuite(
            java=self.java,
            classpath=self.classes_dir,
            tests_src=self.tests_dst + '/' + self.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash(),
            sut_class=self.sut_class,
            params=self.evosuite_params
        )
        # suite = evosuite.generate()
        safira = Safira(java=self.java, classes_dir=self.classes_dir, mutant_dir=self.dRegCp)
        self.suite_evosuite = evosuite.generate_with_impact_analysis(safira)
        if "Simulator" in self.sut_class:
            import distutils.dir_util
            distutils.dir_util.copy_tree("./config/", evosuite.suite_dir + "/config/")

        return self.suite_evosuite

    def gen_randoop(self, scenario):
        randoop = Randoop(
            java=self.java,
            classpath=self.classes_dir,
            tests_src=self.tests_dst + '/' + self.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash(),
            sut_class=self.sut_class,
            params=self.randoop_params
        )
        safira = Safira(java=self.java, classes_dir=self.classes_dir, mutant_dir=self.dRegCp)
        if "Bisect" in self.sut_class:
            self.suite_randoop = randoop.generate()
        else:
            self.suite_randoop = randoop.generate_with_impact_analysis(safira)
            if "Simulator" in self.sut_class:
                import distutils.dir_util
                distutils.dir_util.copy_tree("./config/", randoop.suite_dir + "/config/")
        return self.suite_randoop

    def try_evosuite(self, classes_dir, sut_class, mutant_dir):
        junit = JUnit(java=self.java, classpath=classes_dir)
        return (junit.run_with_mutant(self.suite_evosuite, sut_class, mutant_dir)
                if self.suite_evosuite else None)

    def try_evosuite_diff(self, classes_dir, sut_class, mutant_dir):

        junit = JUnit(java=self.java, classpath=classes_dir)
        res = junit.run_with_mutant(self.suite_evosuite_diff, sut_class, mutant_dir)
        return res

    def try_randoop(self, classes_dir, sut_class, mutant_dir):
        junit = JUnit(java=self.java, classpath=classes_dir)
        return (junit.run_with_mutant(self.suite_randoop, sut_class, mutant_dir)
                if self.suite_randoop else None)

    def compile_commits(self, scenario):
        java_file = self.find_java_files(self.project.get_path_local_project(), scenario.merge_scenario.get_sut_class())
        data = [(scenario.merge_scenario.get_base_hash(), "base"), (scenario.merge_scenario.get_left_hash(), "left"),
                (scenario.merge_scenario.get_right_hash(), "right"), (scenario.merge_scenario.get_merge_hash(), "merge")]
        self.sut_class = scenario.merge_scenario.get_sut_class()
        for hash in data:
            self.project.checkout_on_commit(".")
            self.project.checkout_on_commit(hash[0])
            self.project.checkout_on_commit(".")
            self.set_method_public(java_file)
            #self.add_default_constructor(java_file)

            self.maven.compile(self.project.get_path_local_project(), 120, clean=True, install=True)
            self.maven.save_dependencies(self.project.get_path_local_project())
            dst = self.projects_folder + self.project.get_project_name() + "/" + data[3][0] + "/" + hash[1]
            if os.path.exists(dst):
                shutil.rmtree(dst)

            shutil.copytree(self.project.get_path_local_module_analysis(), dst)

    def generate_dependencies_path(self, scenario, commit_type):

        project_folder = self.projects_folder + self.project.get_project_name() + "/" + scenario.merge_scenario.get_merge_hash() + "/"
        dependencies = [(x[0], x[2]) for x in os.walk(project_folder + commit_type + "/target/dependency/")]
        dep_path = dependencies[0][0]
        final_path = ""
        print(dep_path)
        for dependency in dependencies[0][1]:
            final_path = final_path + dep_path + dependency + ":"

        final_path = dep_path + ":" + final_path + project_folder + commit_type + "/target/classes/"

        return final_path

    def write_output_csv(self, output_base, output_left, output_merge, scenario):

        output = [self.project.get_project_name(), scenario.merge_scenario.get_merge_hash(), "False"]
        if output_base[1] and not output_left[1] and output_merge[1]:
            output = [self.project.get_project_name(), scenario.merge_scenario.get_merge_hash(), "True"]

        with open(self.path_output_csv, 'a') as fd:
            writer = csv.writer(fd)
            writer.writerow(output)

    def write_output_results(self, scenario, result_evosuite, result_evosuite_diff, result_randoop):

        output = [self.project.get_project_name(), scenario.merge_scenario.get_merge_hash(), result_evosuite, result_evosuite_diff, result_randoop]

        with open(self.path_output_csv, 'a') as fd:
            writer = csv.writer(fd)
            writer.writerow(output)

    def write_each_result(self, output):
        with open(self.path_output_csv, 'a') as fd:
            writer = csv.writer(fd)
            writer.writerow(output)

    def write_output_results_new(self, scenario, tool, which_parent, base_parent, parent_merge, base_parent_merge):
        if (os.path.isfile(self.path_output_csv) == False):
            output = ["project_name", "merge_scenario", "tool", "evaluated_parent", "commit_pair", "criteria_validation", "failed_tests"]
            with open('persons.csv', 'wb') as csvfile:
                filewriter = csv.writer(csvfile, delimiter=',',
                                        quotechar='|', quoting=csv.QUOTE_MINIMAL)
                filewriter.writerow(output) #
                                            #self.write_each_result(output)
        output_base_parent = [self.project.get_project_name(), scenario.merge_scenario.get_merge_hash(), tool, which_parent, "base-parent", base_parent[0], base_parent[1]]
        output_parent_merge = [self.project.get_project_name(), scenario.merge_scenario.get_merge_hash(), tool, which_parent, "parent-merge", parent_merge[0], parent_merge[1]]
        output_base_merge = [self.project.get_project_name(), scenario.merge_scenario.get_merge_hash(), tool, which_parent, "base-merge", base_parent_merge[0], base_parent_merge[1]]

        self.write_each_result(output_base_parent)
        self.write_each_result(output_parent_merge)
        self.write_each_result(output_base_merge)

    def write_output_csv_intersec(self, output_base, output_left, output_merge, scenario, case):

        output = [self.project.get_project_name(), case, scenario.merge_scenario.get_merge_hash(), "False"]
        if len(output_base[2].intersection(output_merge[2])) > 0 and not output_left[1]:
            output = [self.project.get_project_name(), scenario.merge_scenario.get_merge_hash(), "True"]

        with open(self.path_output_csv, 'a') as fd:
            writer = csv.writer(fd)
            writer.writerow(output)

    @staticmethod
    def set_method_public(file):

        for line in fileinput.input(file, inplace=1):
            if re.search(r'(protected|static|\s) +[\w\<\>\[\]]+\s+(\w+) *\([^\)]*\) *(\{?|[^;])', line):
                print(line.replace("protected", "public").rstrip())
            elif re.search(r'(private|static|\s) +[\w\<\>\[\]]+\s+(\w+) *\([^\)]*\) *(\{?|[^;])', line):
                print(line.replace("private", "public").rstrip())
            else:
                print(line.rstrip())

    @staticmethod
    def add_default_constructor(file):
        for line in fileinput.input(file, inplace=1):
            if re.search("(((|public|final|abstract|private|static|protected)(\\s+))?(class)(\\s+)(\\w+)(<.*>)?(\\s+extends\\s+\\w+)?(<.*>)?(\\s+implements\\s+)?(.*)?(<.*>)?(\\s*))\\{$", line):
                print(line.rstrip()+"\npublic Ball(){}\n") #ajust this later

            elif re.search(".*?private final.*", line):
                print(line.replace("private final", "private").rstrip())
            else:
                print(line.rstrip())

    @staticmethod
    def find_java_files(dir_path, sut_class):
        #dir_path = self.project.get_path_local_project()
        #dir_path = os.path.dirname(os.path.realpath(__file__))
        class_name = sut_class.split('.')[-1]
        for root, dirs, files in os.walk(dir_path):
            for file in files:
                if file.endswith('.java') and ("Test" not in str(file)) and (class_name in file):
                    return root + '/' + str(file)

    def exec_randoop(self, evo,scenario):
        cases = ["left", "right"]
        conflictLeft = []
        conflictRight = []
        for case in cases:
            evo.dRegCp = evo.generate_dependencies_path(scenario, "base")
            evo.classes_dir = evo.generate_dependencies_path(scenario, case)
            evo.mergeDir = evo.generate_dependencies_path(scenario, "merge")

            evo.gen_randoop(scenario)

            test_result_base = evo.try_randoop(evo.classes_dir, evo.sut_class, evo.dRegCp)
            test_result_parent = evo.try_randoop(evo.classes_dir, evo.sut_class, evo.classes_dir)
            test_result_merge = evo.try_randoop(evo.classes_dir, evo.sut_class, evo.mergeDir)
            print(test_result_base)
            print(test_result_parent)
            print(test_result_merge)

            if case == "left":
                if len(test_result_base[2].intersection(test_result_parent[2])) < len(test_result_base[2]):
                    conflictLeft.append(True)
                else:
                    conflictLeft.append(False)

                if len(test_result_merge[2].intersection(test_result_parent[2])) < len(test_result_merge[2]):
                    conflictLeft.append(True)
                else:
                    conflictLeft.append(False)

                if len(test_result_base[2].intersection(test_result_merge[2])) > 0 and not test_result_parent[1]:
                    conflictLeft.append(True)
                else:
                    conflictLeft.append(False)
            else:
                if len(test_result_base[2].intersection(test_result_parent[2])) < len(test_result_base[2]):
                    conflictRight.append(True)
                else:
                    conflictRight.append(False)

                if len(test_result_merge[2].intersection(test_result_parent[2])) < len(test_result_merge[2]):
                    conflictRight.append(True)
                else:
                    conflictRight.append(False)

                if len(test_result_base[2].intersection(test_result_merge[2])) > 0 and not test_result_parent[1]:
                    conflictRight.append(True)
                else:
                    conflictRight.append(False)

        return conflictLeft, conflictRight

    def exec_evosuite(self, evo,scenario):
        cases = ["left", "right"]
        conflictLeft = []
        conflictRight = []
        for case in cases:
            evo.dRegCp = evo.generate_dependencies_path(scenario, "base")
            evo.classes_dir = evo.generate_dependencies_path(scenario, case)
            evo.mergeDir = evo.generate_dependencies_path(scenario, "merge")

            evo.gen_evosuite(scenario)
            test_result_base = evo.try_evosuite(evo.classes_dir, evo.sut_class, evo.dRegCp)  # fail on base - passing tests 0 2 7
            test_result_parent = evo.try_evosuite(evo.classes_dir, evo.sut_class, evo.classes_dir)  # pass on left
            test_result_merge = evo.try_evosuite(evo.classes_dir, evo.sut_class, evo.mergeDir)  # fail on merge - passing tests 0 2 7

            if case == "left":
                if len(test_result_base[2].intersection(test_result_parent[2])) < len(test_result_base[2]): # and (len(test_result_base[2].intersection(test_result_merge[2])) > len(test_result_base[2].intersection(test_result_parent[2]))) and (len(test_result_base[2].intersection(test_result_merge[2])) > len(test_result_merge[2].intersection(test_result_parent[2]))):
                    conflictLeft.append([True, test_result_base[2].difference(test_result_parent[2])])
                else:
                    conflictLeft.append([False, test_result_base[2].difference(test_result_parent[2])])

                if len(test_result_merge[2].intersection(test_result_parent[2])) < len(test_result_merge[2]):
                    conflictLeft.append([True, test_result_merge[2].difference(test_result_parent[2])])
                else:
                    conflictLeft.append([False, test_result_merge[2].difference(test_result_parent[2])])

                if len(test_result_base[2].intersection(test_result_merge[2])) > 0 and not test_result_parent[1]:
                    conflictLeft.append([True, test_result_base[2].intersection(test_result_merge[2])])
                else:
                    conflictLeft.append([False, test_result_base[2].intersection(test_result_merge[2])])
            else:
                if len(test_result_base[2].intersection(test_result_parent[2])) < len(test_result_base[2]):
                    conflictRight.append([True, test_result_base[2].difference(test_result_parent[2])])
                else:
                    conflictRight.append([False, test_result_base[2].difference(test_result_parent[2])])

                if len(test_result_merge[2].intersection(test_result_parent[2])) < len(test_result_merge[2]):
                    conflictRight.append([True, test_result_merge[2].difference(test_result_parent[2])])
                else:
                    conflictRight.append([False, test_result_merge[2].difference(test_result_parent[2])])

                if len(test_result_base[2].intersection(test_result_merge[2])) > 0 and not test_result_parent[1]:
                    conflictRight.append([True, test_result_base[2].intersection(test_result_merge[2])])
                else:
                    conflictRight.append([False, test_result_base[2].intersection(test_result_merge[2])])

        return conflictLeft, conflictRight

    def exec_evosuite_diff(self, evo, scenario):
        cases = ["left", "right"]
        conflictLeft = []
        conflictRight = []
        for case in cases:
            evo.dRegCp = evo.generate_dependencies_path(scenario, "base")
            evo.classes_dir = evo.generate_dependencies_path(scenario, case)
            evo.mergeDir = evo.generate_dependencies_path(scenario, "merge")

            # thread_evosuite_diff = threading.Thread(target=evo.gen_evosuite_diff)
            evo.gen_evosuite_diff(scenario)
            # thread_evosuite_diff.start()
            # thread_evosuite_diff.join()

            test_result_base = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.dRegCp)  # fail on base
            test_result_parent = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.classes_dir)  # pass on left
            test_result_merge = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.mergeDir)  # fail on merge

            print(test_result_base)
            print(test_result_parent)
            print(test_result_merge)

            if case == "left":
                if len(test_result_base[2].intersection(test_result_parent[2])) == 0 and len(test_result_base[2]) > 0:
                    conflictLeft.append([True, test_result_base[2].difference(test_result_parent[2])])
                else:
                    conflictLeft.append([False, test_result_base[2].difference(test_result_parent[2])])

                if len(test_result_merge[2].intersection(test_result_parent[2])) == 0 and len(test_result_merge[2]) > 0:
                    conflictLeft.append([True, test_result_merge[2].difference(test_result_parent[2])])
                else:
                    conflictLeft.append([False, test_result_merge[2].difference(test_result_parent[2])])

                if len(test_result_base[2].intersection(test_result_merge[2])) > 0 and not test_result_parent[1]:
                    conflictLeft.append([True, test_result_base[2].intersection(test_result_merge[2])])
                else:
                    conflictLeft.append([False, test_result_base[2].intersection(test_result_merge[2])])
            else:
                if len(test_result_base[2].intersection(test_result_parent[2])) == 0 and len(test_result_base[2]) > 0:
                    conflictRight.append([True, test_result_base[2].difference(test_result_parent[2])])
                else:
                    conflictRight.append([False, test_result_base[2].difference(test_result_parent[2])])

                if len(test_result_merge[2].intersection(test_result_parent[2])) == 0 and len(test_result_merge[2]) > 0:
                    conflictRight.append([True, test_result_merge[2].difference(test_result_parent[2])])
                else:
                    conflictRight.append([False, test_result_merge[2].difference(test_result_parent[2])])

                if len(test_result_base[2].intersection(test_result_merge[2])) > 0 and not test_result_parent[1]:
                    conflictRight.append([True, test_result_base[2].intersection(test_result_merge[2])])
                else:
                    conflictRight.append([False, test_result_base[2].intersection(test_result_merge[2])])

        return conflictLeft, conflictRight


if __name__ == '__main__':

    #evo = evotest()
    #evo.add_default_constructor("/home/ines/Documents/ic/Project-stuff/example-project-evosuite/src/main/java/br/com/Ball.java")
    #java_file = evo.find_java_files(evo.project.get_path_local_project(), evo.sut_class)

    config = get_config()
    with open(config['path_hash_csv']) as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=',')
        for row in csv_reader:
            evo = evotest(row[6], row[7])

            merge = MergeScenario(evo.project.get_path_local_project, row)
        #merge_scenarios = merge.get_merge_scenarios()

        #for scenario in merge_scenarios:
            evo.compile_commits(merge)
            #result_randoop_left, result_randoop_right = evo.exec_randoop(evo, scenario)

            result_evosuite_left, result_evosuite_right = evo.exec_evosuite(evo, merge)
            result_evodiff_left, result_evodiff_right = evo.exec_evosuite_diff(evo, merge)
            #evo.write_output_results(scenario,result_evosuite, result_evosuite_diff, result_randoop)
            evo.write_output_results_new(merge, "evosuite-diff", "left", result_evodiff_left[0], result_evodiff_left[1],
                                        result_evodiff_left[2])
            evo.write_output_results_new(merge, "evosuite-diff", "right", result_evodiff_right[0], result_evodiff_right[1],
                                        result_evodiff_right[2])
            evo.write_output_results_new(merge, "evosuite", "left", result_evosuite_left[0], result_evosuite_left[1],
                                        result_evosuite_left[2])
            evo.write_output_results_new(merge, "evosuite", "right", result_evosuite_right[0], result_evosuite_right[1],
                                        result_evosuite_right[2])
            #evo.write_output_results_new(scenario, "randoop", "left", result_randoop_left[0], result_randoop_left[1],
            #                             result_randoop_left[2])
            #evo.write_output_results_new(scenario, "randoop", "right", result_randoop_right[0], result_randoop_right[1],
            #                             result_randoop_right[2])







'''
        for case in cases:

        ###evosuite
            evo.dRegCp = evo.generate_dependencies_path(scenario, "base")
            evo.classes_dir = evo.generate_dependencies_path(scenario, case)
            evo.mergeDir = evo.generate_dependencies_path(scenario, "merge")

            print(evo.gen_evosuite(scenario))
            test_result = evo.try_evosuite(evo.classes_dir, evo.sut_class, evo.dRegCp)  # fail on base - passing tests 0 2 7
            test_result2 = evo.try_evosuite(evo.classes_dir, evo.sut_class, evo.classes_dir)  # pass on left
            test_result3 = evo.try_evosuite(evo.classes_dir, evo.sut_class, evo.mergeDir)  # fail on merge - passing tests 0 2 7
            print(test_result)
            print(test_result2)
            print(test_result3)


            evo.write_output_csv_intersec(test_result, test_result2, test_result3, scenario)


        #######evosuite differencial######3
        

        for case in cases:
            evo.dRegCp = evo.generate_dependencies_path(scenario, "base")
            evo.classes_dir = evo.generate_dependencies_path(scenario, case)
            evo.mergeDir = evo.generate_dependencies_path(scenario, "merge")

            # thread_evosuite_diff = threading.Thread(target=evo.gen_evosuite_diff)
            print("waiting analisys finish")
            evo.gen_evosuite_diff(scenario)
            # thread_evosuite_diff.start()
            # thread_evosuite_diff.join()

            print("ended")

            test_result = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.dRegCp)  # fail on base
            test_result2 = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.classes_dir)  # pass on left
            test_result3 = evo.try_evosuite_diff(evo.classes_dir, evo.sut_class, evo.mergeDir)  # fail on merge

            print(test_result)
            print(test_result2)
            print(test_result3)
            evo.write_output_csv(test_result, test_result2, test_result3, scenario)



'''