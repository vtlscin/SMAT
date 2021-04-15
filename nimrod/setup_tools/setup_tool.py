from abc import ABC, abstractmethod

from nimrod.setup_tools.behaviour_check import Behaviour_change
from nimrod.tools.junit import JUnit


class Setup_tool(ABC):

    def __init__(self):
        self.test_suite = None
        self.tool_parameters = None
        self.behaviour_change = Behaviour_change()

    def setup_for_partial_merge_scenario(self, evo, scenario, jarBase, jarParent, jarMerge):
        try:
            evo.project_dep.dRegCp = jarBase
            evo.project_dep.classes_dir = jarParent  # left
            evo.project_dep.left_dir = jarParent # left
            evo.project_dep.mergeDir = jarMerge
            evo.project_dep.sut_class = scenario.merge_scenario.get_sut_class()
            evo.project_dep.sut_method = scenario.merge_scenario.get_sut_method()
        except:
            print("Some project versions could not be evaluated")

    def setup_for_full_merge_scenario(self, evo, scenario, jarBase, jarParentForGeneration, jarOtherParent, jarMerge):
        try:
            self.setup_for_partial_merge_scenario(evo, scenario, jarBase, jarParentForGeneration, jarMerge)
            evo.project_dep.rightDir = jarOtherParent
        except:
            print("Some project versions could not be evaluated")

    def run_tool_for_semantic_conflict_detection(self, evo, scenario, jarBase, jarParentLeft, jarParentRight, jarMerge,
                                                 commitBaseSha, commitParentLeft, commitParentRight, commitMergeSha,
                                                 tool, projectName):
        conflict_info = []
        try:
            self.setup_for_full_merge_scenario(evo, scenario, jarBase, jarParentLeft, jarParentRight, jarMerge)
            self.generate_and_run_test_suites(evo, scenario, commitBaseSha, commitParentLeft, commitParentRight,
                                              commitMergeSha, conflict_info, tool, projectName)

            self.setup_for_full_merge_scenario(evo, scenario, jarBase, jarParentRight, jarParentLeft, jarMerge)
            #self.generate_and_run_test_suites(evo, scenario, commitBaseSha, commitParentRight, commitParentLeft,
                                              #commitMergeSha, conflict_info, tool)
        except:
            print("Some project versions could not be evaluated")

        return conflict_info

    def generate_and_run_test_suites(self, evo, scenario, commitBaseSha, commitParentTestSuite, commitOtherParent,
                                     commitMergeSha, conflict_info, tool, projectName):
        try:
            path_suite = self.generate_test_suite(scenario, evo.project_dep, False)

            # instrumentar jar

            # atualizar parametros para rodar suite com jar instrumentado

            # atualizar chamada para execucao simplificada: execucao dos testes e geracao dos jacoco.exec

            # mover jacoco.exec para local especifico

            # gerar o report

            test_result_base = self.run_test_suite(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                   evo.project_dep.dRegCp, evo.project_dep)
            test_result_parent_test_suite = self.run_test_suite(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                                evo.project_dep.classes_dir, evo.project_dep)
            test_result_other_parent = self.run_test_suite(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                           evo.project_dep.rightDir, evo.project_dep)
            test_result_merge = self.run_test_suite(evo.project_dep.classes_dir, evo.project_dep.sut_class,
                                                    evo.project_dep.mergeDir, evo.project_dep)

            conflict_info.append(self.behaviour_change.check_conflict_occurrence_for_first_criterion(test_result_base,
                                                                                                     test_result_parent_test_suite,
                                                                                                     test_result_merge,
                                                                                                     path_suite,
                                                                                                     commitBaseSha,
                                                                                                     commitParentTestSuite,
                                                                                                     commitMergeSha,
                                                                                                     tool))
            conflict_info.append(self.behaviour_change.check_conflict_occurrence_for_second_criterion(test_result_base,
                                                                                                      test_result_parent_test_suite,
                                                                                                      test_result_other_parent,
                                                                                                      test_result_merge,
                                                                                                      path_suite,
                                                                                                      commitBaseSha,
                                                                                                      commitParentTestSuite,
                                                                                                      commitOtherParent,
                                                                                                      commitMergeSha,
                                                                                                      tool))

        except:
            print("Some project versions could not be evaluated")
            conflict_info.append(["NONE", set(), "NO-INFORMATION", commitBaseSha, commitParentTestSuite, commitMergeSha,
                                  tool])

    def run_test_suite(self, classes_dir, sut_class, mutant_dir, project_dep):
        junit = JUnit(java=project_dep.java, classpath=classes_dir)
        res = junit.run_with_mutant(self.test_suite, sut_class, mutant_dir)
        return res

    @abstractmethod
    def generate_test_suite(self, scenario, project_dep, randoopy):
        pass
