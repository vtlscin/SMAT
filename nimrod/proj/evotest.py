import csv
from nimrod.tools.randoop import Randoop
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit, JUnitResult, Coverage
from nimrod.tools.evosuite import Evosuite
from collections import namedtuple
from nimrod.project_info.git_project import GitProject
from nimrod.tests.utils import get_config
from nimrod.project_info.merge_scenario import MergeScenario
from nimrod.report.output_report import Output_report
from nimrod.proj.project_dependencies import Project_dependecies

NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout', 'test_tool', 'is_equal_coverage'])


class evotest:

    def __init__(self, path_local_project="", path_local_module_analysis="", project_name=""):
        config = get_config()
        self.project_dep = Project_dependecies(config, path_local_project, path_local_module_analysis, project_name)

        self.evosuite_diff_params = None
        self.suite_evosuite_diff = None

        self.suite_evosuite = None
        self.evosuite_params = None

        self.suite_randoop = None
        self.randoop_params = None

        self.output_report = Output_report(config["path_output_csv"])

    def set_git_project(self, path):
        self.project = GitProject(path)

    def gen_evosuite_diff(self, scenario):

        evosuite = Evosuite(
            java=self.project_dep.java,
            classpath=self.project_dep.classes_dir,
            sut_class=self.project_dep.sut_class,
            params=self.evosuite_diff_params,
            tests_src=self.project_dep.tests_dst + '/' + self.project_dep.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash()
        )
        self.suite_evosuite_diff = evosuite.generate_differential(self.project_dep.dRegCp)
        return self.suite_evosuite_diff

    def gen_evosuite(self, scenario):
        evosuite = Evosuite(
            java=self.project_dep.java,
            classpath=self.project_dep.classes_dir,
            tests_src=self.project_dep.tests_dst + '/' + self.project_dep.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash(),
            sut_class=self.project_dep.sut_class,
            params=self.evosuite_params
        )
        # suite = evosuite.generate()
        safira = Safira(java=self.project_dep.java, classes_dir=self.project_dep.classes_dir, mutant_dir=self.project_dep.dRegCp)
        self.suite_evosuite = evosuite.generate_with_impact_analysis(safira)
        if "Simulator" in self.project_dep.sut_class:
            import distutils.dir_util
            distutils.dir_util.copy_tree("./config/", evosuite.suite_dir + "/config/")

        return self.suite_evosuite

    def gen_randoop(self, scenario):
        randoop = Randoop(
            java=self.java,
            classpath=self.project_dep.classes_dir,
            tests_src=self.tests_dst + '/' + self.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash(),
            sut_class=self.sut_class,
            params=self.randoop_params
        )
        safira = Safira(java=self.java, classes_dir=self.project_dep.classes_dir, mutant_dir=self.project_dep.dRegCp)
        if "Bisect" in self.sut_class:
            self.suite_randoop = randoop.generate()
        else:
            self.suite_randoop = randoop.generate_with_impact_analysis(safira)
            if "Simulator" in self.sut_class:
                import distutils.dir_util
                distutils.dir_util.copy_tree("./config/", randoop.suite_dir + "/config/")
        return self.suite_randoop

    def try_evosuite(self, classes_dir, sut_class, mutant_dir):
        junit = JUnit(java=self.project_dep.java, classpath=classes_dir)
        return (junit.run_with_mutant(self.suite_evosuite, sut_class, mutant_dir)
                if self.suite_evosuite else None)

    def try_evosuite_diff(self, classes_dir, sut_class, mutant_dir):

        junit = JUnit(java=self.project_dep.java, classpath=classes_dir)
        res = junit.run_with_mutant(self.suite_evosuite_diff, sut_class, mutant_dir)
        return res

    def try_randoop(self, classes_dir, sut_class, mutant_dir):
        junit = JUnit(java=self.java, classpath=classes_dir)
        return (junit.run_with_mutant(self.suite_randoop, sut_class, mutant_dir)
                if self.suite_randoop else None)

    def check_different_test_results_for_commit_pair(self, parent_one, parent_two, path_suite):
        if len(parent_one[2].difference(parent_two[2])) > 0:
            return [True, parent_one[2].difference(parent_two[2]), path_suite[1]]
        else:
            return [False, parent_one[2].difference(parent_two[2]), path_suite[1]]

    def check_different_test_results_for_merge_scenario(self, parent_one, parent_two, parent_tree, path_suite):
        if len(parent_one[2].intersection(parent_tree[2]).difference(parent_two[2])) > 0:
            return [True, parent_one[2].intersection(parent_tree[2]), path_suite[1]]
        else:
            return [False, parent_one[2].intersection(parent_tree[2]), path_suite[1]]

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

    def exec_evosuite(self, evo,scenario, parent):

        conflict_info = []
        try:
            evo.project_dep.dRegCp = evo.project_dep.generate_dependencies_path(scenario, "base")
            evo.project_dep.classes_dir = evo.project_dep.generate_dependencies_path(scenario, parent)
            evo.project_dep.mergeDir = evo.project_dep.generate_dependencies_path(scenario, "merge")

            path_suite = evo.gen_evosuite(scenario)

            test_result_base = evo.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.dRegCp)  # fail on base - passing tests 0 2 7
            test_result_parent = evo.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir)  # pass on left
            test_result_merge = evo.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.mergeDir)  # fail on merge - passing tests 0 2 7

            conflict_info.append(self.check_different_test_results_for_commit_pair(test_result_base, test_result_parent,path_suite))
            conflict_info.append(self.check_different_test_results_for_commit_pair(test_result_merge, test_result_parent,path_suite))
            conflict_info.append(self.check_different_test_results_for_merge_scenario(test_result_base, test_result_parent,test_result_merge, path_suite))
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_jar(self, evo,scenario, jarBase, jarParent, jarMerge):
        conflict_info = []
        try:
            evo.dRegCp = jarBase
            evo.classes_dir = jarParent
            evo.mergeDir = jarMerge
            self.project_dep.sut_class = scenario.merge_scenario.get_sut_class()

            conflict_info = self.exec_evosuite_all(scenario)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_all(self, scenario):
        conflict_info = []
        try:
            path_suite = evo.gen_evosuite(scenario)

            test_result_base = evo.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                evo.project_dep.dRegCp)  # fail on base - passing tests 0 2 7
            test_result_parent = evo.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir)  # pass on left
            test_result_merge = evo.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                 evo.project_dep.mergeDir)  # fail on merge - passing tests 0 2 7

            conflict_info.append(
                self.check_different_test_results_for_commit_pair(test_result_base, test_result_parent, path_suite))
            conflict_info.append(
                self.check_different_test_results_for_commit_pair(test_result_merge, test_result_parent, path_suite))
            conflict_info.append(self.check_different_test_results_for_merge_scenario(test_result_base, test_result_parent,
                                                                                      test_result_merge, path_suite))

        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_diff(self, evo, scenario, parent):
        conflict_info = []
        try:
            evo.project_dep.dRegCp = evo.project_dep.generate_dependencies_path(scenario, "base")
            evo.project_dep.classes_dir = evo.project_dep.generate_dependencies_path(scenario, parent)
            evo.project_dep.mergeDir = evo.project_dep.generate_dependencies_path(scenario, "merge")
            self.project_dep.sut_class = scenario.merge_scenario.get_sut_class()

            conflict_info = self.exec_evosuite_diff_all(scenario)

        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_diff_jar(self, evo, scenario, jarBase, jarParent, jarMerge):
        conflict_info = []
        try:
            evo.project_dep.dRegCp = jarBase
            evo.project_dep.classes_dir = jarParent
            evo.project_dep.mergeDir = jarMerge
            self.project_dep.sut_class = scenario.merge_scenario.get_sut_class()

            conflict_info = self.exec_evosuite_diff_all(scenario)

        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_diff_all(self, scenario):
        conflict_info = []
        try:
            path_suite = evo.gen_evosuite_diff(scenario)

            test_result_base = evo.try_evosuite_diff(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.dRegCp)  # fail on base
            test_result_parent = evo.try_evosuite_diff(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir)  # pass on left
            test_result_merge = evo.try_evosuite_diff(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.mergeDir)  # fail on merge

            conflict_info.append(
                self.check_different_test_results_for_commit_pair(test_result_base, test_result_parent, path_suite))
            conflict_info.append(
                self.check_different_test_results_for_commit_pair(test_result_merge, test_result_parent, path_suite))
            conflict_info.append(self.check_different_test_results_for_merge_scenario(test_result_base, test_result_parent,
                                                                                      test_result_merge, path_suite))

        except:
            print("Some project versions could not be evaluated")

        return conflict_info

if __name__ == '__main__':

    config = get_config()
    with open(config['path_hash_csv']) as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=',')
        for row in csv_reader:
            if row[1] == "true":
                evo = evotest(project_name=row[0])
                merge = MergeScenario(merge_information=row)

                result_evodiff_left = evo.exec_evosuite_diff_jar(evo, merge, row[10], row[11], row[13])
                result_evodiff_right = evo.exec_evosuite_diff_jar(evo, merge, row[10], row[12], row[13])
                result_evosuite_left = evo.exec_evosuite_jar(evo, merge, row[10], row[11], row[13])
                result_evosuite_right = evo.exec_evosuite_jar(evo, merge, row[10], row[12], row[13])

                evo.output_report.write_output_results(evo.project_dep.project.get_project_name(), merge, "evosuite-diff", "left", result_evodiff_left)
                evo.output_report.write_output_results(evo.project_dep.project.get_project_name(),merge, "evosuite-diff", "right", result_evodiff_right)
                evo.output_report.write_output_results(evo.project_dep.project.get_project_name(),merge, "evosuite", "left", result_evosuite_left)
                evo.output_report.write_output_results(evo.project_dep.project.get_project_name(),merge, "evosuite", "right", result_evosuite_right)

            else:
                evo = evotest(row[8], row[9], row[0])
                merge = MergeScenario(evo.project_dep.project.get_path_local_project, row)
                evo.project_dep.compile_commits(merge)

                result_evosuite_left = evo.exec_evosuite(evo, merge, "left")
                result_evosuite_right = evo.exec_evosuite(evo, merge, "right")
                result_evodiff_left = evo.exec_evosuite_diff(evo, merge, "left")
                result_evodiff_right = evo.exec_evosuite_diff(evo, merge, "right")

                evo.output_report.write_output_results(evo.project_dep.project.get_project_name(), merge, "evosuite-diff", "left", result_evodiff_left)
                evo.output_report.write_output_results(evo.project_dep.project.get_project_name(), merge, "evosuite-diff", "right", result_evodiff_right)
                evo.output_report.write_output_results(evo.project_dep.project.get_project_name(), merge,"evosuite", "left", result_evosuite_left)
                evo.output_report.write_output_results(evo.project_dep.project.get_project_name(), merge,"evosuite", "right", result_evosuite_right)