from nimrod.tools.randoop import Randoop
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit
from nimrod.setup_tools.behaviour_check import Behaviour_change

class Randoop_setup:

    def __init__(self):
        self.suite_randoop = None
        self.randoop_params = None
        self.behaviour_change = Behaviour_change()

    def gen_randoop(self, scenario, project_dep):
        randoop = Randoop(
            java=project_dep.java,
            classpath=project_dep.classes_dir,
            tests_src=project_dep.tests_dst + '/' + project_dep.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash(),
            sut_class=project_dep.sut_class,
            sut_method=project_dep.sut_method,
            params=self.randoop_params
        )
        safira = Safira(java=project_dep.java, classes_dir=project_dep.classes_dir, mutant_dir=project_dep.dRegCp)
        if "Bisect" in project_dep.sut_class:
            self.suite_randoop = randoop.generate()
        else:
            try:
                self.suite_randoop = randoop.generate_with_impact_analysis(safira, True)
            except Exception as e:
                print(e)
                self.suite_randoop = randoop.generate_with_impact_analysis(safira, False)
            if "Simulator" in project_dep.sut_class:
                import distutils.dir_util
                distutils.dir_util.copy_tree("./config/", randoop.suite_dir + "/config/")
        return self.suite_randoop

    def try_randoop(self, classes_dir, sut_class, mutant_dir, project_dep):
        junit = JUnit(java=project_dep.java, classpath=classes_dir)
        return (junit.run_with_mutant(self.suite_randoop, sut_class, mutant_dir)
                if self.suite_randoop else None)

    def exec_randoop(self, evo, scenario, parent):
        conflict_info = []
        try:
            evo.project_dep.dRegCp = evo.project_dep.generate_dependencies_path(scenario, "base")
            evo.project_dep.classes_dir = evo.project_dep.generate_dependencies_path(scenario, parent)
            evo.project_dep.mergeDir = evo.project_dep.generate_dependencies_path(scenario, "merge")

            conflict_info = self.exec_randoop_all(evo, scenario)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_randoop_jar(self, evo, scenario, jarBase, jarParent, jarMerge):
        conflict_info = []
        try:
            evo.project_dep.dRegCp = jarBase
            evo.project_dep.classes_dir = jarParent
            evo.project_dep.mergeDir = jarMerge
            evo.project_dep.sut_class = scenario.merge_scenario.get_sut_class()
            evo.project_dep.sut_method = scenario.merge_scenario.get_sut_method()

            conflict_info = self.exec_randoop_all(evo, scenario)
        except:
            print("Some project versions could not be evaluated - Some configuration steps were not performed")

        return conflict_info

    def exec_randoop_all(self, evo, scenario):
        conflict_info = []
        try:
            path_suite = self.gen_randoop(scenario, evo.project_dep)

            test_result_base = self.try_randoop(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                evo.project_dep.dRegCp, evo.project_dep)  # fail on base - passing tests 0 2 7
            test_result_parent = self.try_randoop(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir, evo.project_dep)  # pass on left
            test_result_merge = self.try_randoop(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                 evo.project_dep.mergeDir, evo.project_dep)  # fail on merge - passing tests 0 2 7

            conflict_info.append(
                self.behaviour_change.check_different_test_results_for_commit_pair(test_result_parent, test_result_base, path_suite))
            conflict_info.append(
                self.behaviour_change.check_different_test_results_for_commit_pair(test_result_parent, test_result_merge, path_suite))
            conflict_info.append(self.behaviour_change.check_different_test_results_for_merge_scenario(test_result_base, test_result_parent,
                                                                                      test_result_merge, path_suite))

        except:
            print("Some project versions could not be evaluated - ")

        return conflict_info

    def exec_randoop_jar_merge_scenario(self, evo, scenario, commit_pairs):
        conflict_info = []
        try:
            for commit_pair in commit_pairs:
                conflict_info += self.exec_randoop_jar_commit_pair(evo, scenario, commit_pair[0], commit_pair[1], commit_pair[2], commit_pair[3])
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_randoop_jar_commit_pair(self, evo, scenario, jarCommitOne, jarCommitTwo, shaCommitOne, shaCommitTwo):
        conflict_info = []
        try:
            evo.project_dep.classes_dir = jarCommitOne
            evo.project_dep.dRegCp = jarCommitTwo
            evo.project_dep.sut_class = scenario.merge_scenario.get_sut_class()
            evo.project_dep.sut_method = scenario.merge_scenario.get_sut_method()

            conflict_info = self.exec_randoop_all_commit_pair(evo, scenario, shaCommitOne, shaCommitTwo)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_randoop_all_commit_pair(self, evo, scenario, shaCommitOne, shaCommitTwo):
        conflict_info = []
        try:
            path_suite = self.gen_randoop(scenario, evo.project_dep)

            test_result_commit_one = self.try_randoop(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.dRegCp, evo.project_dep)  # fail on base - passing tests 0 2 7
            test_result_commit_two = self.try_randoop(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir, evo.project_dep)  # pass on left

            conflict_info.append(
                self.behaviour_change.check_different_test_results_for_commit_pair(test_result_commit_one, test_result_commit_two, path_suite, shaCommitOne, shaCommitTwo, "randoop"))

        except:
            print("Some project versions could not be evaluated")
            conflict_info.append(["NONE", set(), "NO-INFORMATION", shaCommitOne, shaCommitTwo, "randoop"])

        return conflict_info

    def exec_randoop_jar_merge_scenario_test_conflicts(self, evo, scenario, commit_triples):
        conflict_info = []
        try:
            for commit_triplet in commit_triples:
                conflict_info += self.exec_randoop_jar_test_conflict(evo, scenario, commit_triplet[0], commit_triplet[1], commit_triplet[2], commit_triplet[3], commit_triplet[4], commit_triplet[5])
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def exec_randoop_jar_test_conflict(self, evo, scenario, jarBase, jarParent, jarMerge, commitBaseSha, commitParentSha, commitMergeSha):
        conflict_info = []
        try:
            self.setup_for_merge_scenario(evo, scenario, jarBase, jarParent, jarMerge)
            conflict_info = self.exec_randoop_test_conflict(evo, scenario, commitBaseSha, commitParentSha, commitMergeSha)
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

    def exec_randoop_test_conflict(self, evo, scenario, commitBaseSha, commitParentSha, commitMergeSha):
        conflict_info = []
        try:
            path_suite = self.gen_randoop(scenario, evo.project_dep)

            test_result_base = self.try_randoop(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.dRegCp, evo.project_dep)  # fail on base - passing tests 0 2 7
            test_result_parent = self.try_randoop(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.classes_dir, evo.project_dep)  # pass on left
            test_result_merge = self.try_randoop(evo.project_dep.classes_dir, evo.project_dep.sut_class, evo.project_dep.mergeDir, evo.project_dep)  # fail on merge - passing tests 0 2 7

            conflict_info.append(self.behaviour_change.check_different_test_results_for_merge_scenario(test_result_base, test_result_parent, test_result_merge, path_suite, commitBaseSha, commitParentSha, commitMergeSha, "randoop"))

        except:
            print("Some project versions could not be evaluated")
            conflict_info.append(["NONE", set(), "NO-INFORMATION", commitBaseSha, commitParentSha, commitMergeSha, "randoop"])

        return conflict_info