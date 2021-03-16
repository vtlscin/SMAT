from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit, JUnitResult, Coverage
from nimrod.tools.evosuite import Evosuite
from nimrod.setup_tools.behaviour_check import Behaviour_change


class Evosuite_setup:

    def __init__(self):
        self.suite_evosuite = None
        self.evosuite_params = None
        self.behaviour_change = Behaviour_change()

    def gen_evosuite(self, scenario, project_dep):
        evosuite = Evosuite(
            java=project_dep.java,
            classpath=project_dep.classes_dir,
            tests_src=project_dep.tests_dst + '/' + project_dep.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash(),
            sut_class=project_dep.sut_class,
            sut_method=project_dep.sut_method,
            params=self.evosuite_params
        )
        # suite = evosuite.generate()
        safira = Safira(java=project_dep.java, classes_dir=project_dep.classes_dir,
                        mutant_dir=project_dep.dRegCp)
        try:
            self.suite_evosuite = evosuite.generate_with_impact_analysis(safira, True)
        except Exception as e:
            print(e)
            self.suite_evosuite = evosuite.generate_with_impact_analysis(safira, False)
        if "Simulator" in project_dep.sut_class:
            import distutils.dir_util
            distutils.dir_util.copy_tree("./config/", evosuite.suite_dir + "/config/")

        return self.suite_evosuite

    def try_evosuite(self, classes_dir, sut_class, mutant_dir, project_dep):
        junit = JUnit(java=project_dep.java, classpath=classes_dir)
        return (junit.run_with_mutant(self.suite_evosuite, sut_class, mutant_dir)
                if self.suite_evosuite else None)

    def exec_evosuite(self, evo, scenario, parent):

        conflict_info = []
        try:
            evo.project_dep.dRegCp = evo.project_dep.generate_dependencies_path(scenario, "base")
            evo.project_dep.classes_dir = evo.project_dep.generate_dependencies_path(scenario, parent)
            evo.project_dep.mergeDir = evo.project_dep.generate_dependencies_path(scenario, "merge")

            conflict_info = self.exec_evosuite_all(evo, scenario)

        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def setup_for_merge_scenario(self, evo, scenario, jarBase, jarParent, jarMerge):
        try:
            evo.project_dep.dRegCp = jarBase
            evo.project_dep.classes_dir = jarParent
            evo.project_dep.mergeDir = jarMerge
            evo.project_dep.sut_class = scenario.merge_scenario.get_sut_class()
            evo.project_dep.sut_method = scenario.merge_scenario.get_sut_method()
        except:
            print("Some project versions could not be evaluated")

    def setup_for_merge_scenario_second(self, evo, scenario, jarBase, jarParentForGeneration, jarOtherParent, jarMerge):
        try:
            evo.project_dep.dRegCp = jarBase
            evo.project_dep.classes_dir = jarParentForGeneration
            evo.project_dep.rightDir = jarOtherParent
            evo.project_dep.mergeDir = jarMerge
            evo.project_dep.sut_class = scenario.merge_scenario.get_sut_class()
            evo.project_dep.sut_method = scenario.merge_scenario.get_sut_method()
        except:
            print("Some project versions could not be evaluated")

    def exec_evosuite_jar(self, evo, scenario, jarBase, jarParent, jarMerge):
        conflict_info = []
        try:
            evo.project_dep.dRegCp = jarBase
            evo.project_dep.classes_dir = jarParent
            evo.project_dep.mergeDir = jarMerge
            evo.project_dep.sut_class = scenario.merge_scenario.get_sut_class()
            evo.project_dep.sut_method = scenario.merge_scenario.get_sut_method()

            conflict_info = self.exec_evosuite_all(evo, scenario)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_jar_merge_scenario(self, evo, scenario, commit_pairs):
        conflict_info = []
        try:
            for commit_pair in commit_pairs:
                conflict_info += self.exec_evosuite_jar_commit_pair(evo, scenario, commit_pair[0], commit_pair[1], commit_pair[2], commit_pair[3])
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_jar_merge_scenario_test_conflicts(self, evo, scenario, commit_triples):
        conflict_info = []
        try:
            for commit_triplet in commit_triples:
                conflict_info += self.exec_evosuite_jar_test_conflict(evo, scenario, commit_triplet[0], commit_triplet[1], commit_triplet[2], commit_triplet[3], commit_triplet[4], commit_triplet[5])
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_jar_test_conflict(self, evo, scenario, jarBase, jarParent, jarMerge, commitBaseSha, commitParentSha, commitMergeSha):
        conflict_info = []
        try:
            self.setup_for_merge_scenario(evo, scenario, jarBase, jarParent, jarMerge)
            conflict_info = self.exec_evosuite_test_conflict(evo, scenario, commitBaseSha, commitParentSha, commitMergeSha)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_jar_test_conflict_second_criteria(self, evo, scenario, jarBase, jarParentLeft, jarParentRight, jarMerge, commitBaseSha, commitParentLeft, commitParentRight, commitMergeSha):
        conflict_info = []
        try:
            self.setup_for_merge_scenario_second(evo, scenario, jarBase, jarParentLeft, jarParentRight, jarMerge)
            conflict_info = self.exec_evosuite_test_conflict_second(evo, scenario, commitBaseSha, commitParentLeft, commitParentLeft, commitMergeSha)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_for_both_criteria(self, evo, scenario, jarBase, jarParentLeft, jarParentRight, jarMerge, commitBaseSha, commitParentLeft, commitParentRight, commitMergeSha):
        conflict_info = []
        try:
            self.setup_for_merge_scenario_second(evo, scenario, jarBase, jarParentLeft, jarParentRight, jarMerge)
            self.exec_evosuite_test_conflict_second(evo, scenario, commitBaseSha, commitParentLeft, commitParentRight, commitMergeSha, conflict_info)

            self.setup_for_merge_scenario_second(evo, scenario, jarBase, jarParentRight, jarParentLeft, jarMerge)
            self.exec_evosuite_test_conflict_second(evo, scenario, commitBaseSha, commitParentRight, commitParentLeft, commitMergeSha, conflict_info)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_jar_commit_pair(self, evo, scenario, jarCommitOne, jarCommitTwo, shaCommitOne, shaCommitTwo):
        conflict_info = []
        try:
            evo.project_dep.classes_dir = jarCommitOne
            evo.project_dep.dRegCp = jarCommitTwo
            evo.project_dep.sut_class = scenario.merge_scenario.get_sut_class()
            evo.project_dep.sut_method = scenario.merge_scenario.get_sut_method()

            conflict_info = self.exec_evosuite_all_commit_pair(evo, scenario, shaCommitOne, shaCommitTwo)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_all(self, evo, scenario):
        conflict_info = []
        try:
            path_suite = self.gen_evosuite(scenario, evo.project_dep)

            test_result_base = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                evo.project_dep.dRegCp, evo.project_dep)  # fail on base - passing tests 0 2 7
            test_result_parent = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir, evo.project_dep)  # pass on left
            test_result_merge = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                 evo.project_dep.mergeDir, evo.project_dep)  # fail on merge - passing tests 0 2 7

            conflict_info.append(
                self.behaviour_change.check_different_test_results_for_commit_pair(test_result_parent, test_result_base, path_suite))
            conflict_info.append(
                self.behaviour_change.check_different_test_results_for_commit_pair(test_result_parent, test_result_merge, path_suite))
            conflict_info.append(self.behaviour_change.check_different_test_results_for_merge_scenario(test_result_base, test_result_parent,
                                                                                      test_result_merge, path_suite))

        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_evosuite_test_conflict(self, evo, scenario, commitBaseSha, commitParentSha, commitMergeSha):
        conflict_info = []
        try:
            path_suite = self.gen_evosuite(scenario, evo.project_dep)

            test_result_base = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.dRegCp, evo.project_dep)  # fail on base - passing tests 0 2 7
            test_result_parent = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir, evo.project_dep)  # pass on left
            test_result_merge = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.mergeDir, evo.project_dep)  # fail on merge - passing tests 0 2 7

            conflict_info.append(self.behaviour_change.check_different_test_results_for_merge_scenario(test_result_base, test_result_parent, test_result_merge, path_suite, commitBaseSha, commitParentSha, commitMergeSha, "evosuite"))

        except:
            print("Some project versions could not be evaluated")
            conflict_info.append(["NONE", set(), "NO-INFORMATION", commitBaseSha, commitParentSha, commitMergeSha, "evosuite"])

        return conflict_info

    def exec_evosuite_test_conflict_second(self, evo, scenario, commitBaseSha, commitParentTestSuite, commitOtherParent, commitMergeSha, conflict_info):
        try:
            path_suite = self.gen_evosuite(scenario, evo.project_dep)

            test_result_base = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.dRegCp, evo.project_dep)  # fail on base - passing tests 0 2 7
            test_result_parent_test_suite = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir, evo.project_dep)  # pass on left
            test_result_other_parent = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.rightDir, evo.project_dep)  # pass on left
            test_result_merge = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.mergeDir, evo.project_dep)  # fail on merge - passing tests 0 2 7

            conflict_info.append(self.behaviour_change.check_different_test_results_for_merge_scenario(test_result_base, test_result_parent_test_suite, test_result_merge, path_suite, commitBaseSha, commitParentTestSuite, commitMergeSha, "evosuite"))
            conflict_info.append(self.behaviour_change.check_different_test_results_for_merge_scenario_second_criterion(test_result_base, test_result_parent_test_suite, test_result_other_parent, test_result_merge, path_suite, commitBaseSha, commitParentTestSuite, commitOtherParent, commitMergeSha, "evosuite"))

        except:
            print("Some project versions could not be evaluated")
            conflict_info.append(["NONE", set(), "NO-INFORMATION", commitBaseSha, commitParentTestSuite, commitMergeSha, "evosuite"])

    def exec_evosuite_all_commit_pair(self, evo, scenario, shaCommitOne, shaCommitTwo):
        conflict_info = []
        try:
            path_suite = self.gen_evosuite(scenario, evo.project_dep)

            test_result_commit_one = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.dRegCp, evo.project_dep)  # fail on base - passing tests 0 2 7
            test_result_commit_two = self.try_evosuite(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir, evo.project_dep)  # pass on left

            conflict_info.append(
                self.behaviour_change.check_different_test_results_for_commit_pair(test_result_commit_one, test_result_commit_two, path_suite, shaCommitOne, shaCommitTwo, "evosuite"))

        except:
            print("Some project versions could not be evaluated")
            conflict_info.append(["NONE", set(), "NO-INFORMATION", shaCommitOne, shaCommitTwo, "evosuite"])

        return conflict_info