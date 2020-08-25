import csv
import os
from nimrod.tools.randoop import Randoop
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit
from collections import namedtuple
from nimrod.project_info.git_project import GitProject
from nimrod.tests.utils import get_config
from nimrod.project_info.merge_scenario import MergeScenario
from nimrod.report.output_report import Output_report
from nimrod.proj.project_dependencies import Project_dependecies
from nimrod.setup_tools.evosuite_setup import Evosuite_setup
from nimrod.setup_tools.evosuite_diff_setup import Evosuite_Diff_setup
from nimrod.setup_tools.randoop_setup import Randoop_setup
from nimrod.report.report import Report

NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout', 'test_tool', 'is_equal_coverage'])


class semantic_study:

    def __init__(self, path_local_project="", path_local_module_analysis="", project_name=""):
        config = get_config()
        self.project_dep = Project_dependecies(config, path_local_project, path_local_module_analysis, project_name)

        self.evosuite_setup = Evosuite_setup()
        self.evosuite_diff_setup = Evosuite_Diff_setup()
        self.randoop_setup = Randoop_setup()

        self.suite_evosuite = None
        self.evosuite_params = None

        self.suite_randoop = None
        self.randoop_params = None

        self.output_report = Output_report(config["path_output_csv"])

    def set_git_project(self, path):
        self.project = GitProject(path)

    def get_commit_pairs(self, row):
        return [[row[11],row[10],row[3],row[5]], [row[12],row[10],row[4],row[5]], [row[11],row[13],row[3],row[2]], [row[12],row[13],row[4],row[2]]]

    def get_commit_triples(self, row):
        return [[row[10],row[11],row[13],row[5], row[3], row[2]], [row[10],row[12],row[13],row[5], row[4], row[2]]]

if __name__ == '__main__':

    config = get_config()
    with open(config['path_hash_csv']) as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=',')
        for row in csv_reader:
            if row[1] == "commit_pairs":
                print("Commits pair analysis")
                semantic_study = semantic_study(project_name=row[0])
                merge = MergeScenario(merge_information=row)
                for i in range(0, 1):
                    evosuite_diff_commit_pair = semantic_study.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(semantic_study, merge, row[10], row[11], row[5], row[3])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[6], row[7])
                    evosuite_diff_commit_pair = semantic_study.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(semantic_study, merge, row[10], row[12], row[5], row[4])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[6], row[7])
                    evosuite_diff_commit_pair = semantic_study.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(semantic_study, merge, row[11], row[13], row[2], row[3])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[6], row[7])
                    evosuite_diff_commit_pair = semantic_study.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(semantic_study, merge, row[12], row[13], row[2], row[4])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[6], row[7])
                    evosuite_commit_pair = semantic_study.evosuite_setup.exec_evosuite_jar_commit_pair(semantic_study, merge, row[10], row[11], row[5], row[3])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[6], row[7])
                    evosuite_commit_pair = semantic_study.evosuite_setup.exec_evosuite_jar_commit_pair(semantic_study, merge, row[10], row[12], row[5], row[4])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[6], row[7])
                    evosuite_commit_pair = semantic_study.evosuite_setup.exec_evosuite_jar_commit_pair(semantic_study, merge, row[11], row[13], row[2], row[3])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[6], row[7])
                    evosuite_commit_pair = semantic_study.evosuite_setup.exec_evosuite_jar_commit_pair(semantic_study, merge, row[12], row[13], row[2], row[4])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[6], row[7])
                    randoop_commit_pair = semantic_study.randoop_setup.exec_randoop_jar_commit_pair(semantic_study, merge, row[10], row[11], row[5], row[3])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[6], row[7])
                    randoop_commit_pair = semantic_study.randoop_setup.exec_randoop_jar_commit_pair(semantic_study, merge, row[10], row[12], row[5], row[4])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[6], row[7])
                    randoop_commit_pair = semantic_study.randoop_setup.exec_randoop_jar_commit_pair(semantic_study, merge, row[11], row[13], row[2], row[3])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[6], row[7])
                    randoop_commit_pair = semantic_study.randoop_setup.exec_randoop_jar_commit_pair(semantic_study, merge, row[12], row[13], row[2], row[4])
                    semantic_study.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[6], row[7])
            elif row[1] == "true":
                print("Semantic Conflict Analysis")
                semantic_study = semantic_study(project_name=row[0])
                merge = MergeScenario(merge_information=row)
                path_report = semantic_study.output_report.path_output_csv_test_conflicts
                for i in range(0, 3):
                    evosuite = semantic_study.evosuite_setup.exec_evosuite_jar_test_conflict(semantic_study, merge, row[10], row[11], row[13], row[5], row[3], row[2])
                    semantic_study.output_report.write_output_results_test_conflicts(row[0], evosuite, row[6], row[7])
                    evosuite = semantic_study.evosuite_setup.exec_evosuite_jar_test_conflict(semantic_study, merge, row[10], row[11], row[13], row[5], row[4], row[2])
                    semantic_study.output_report.write_output_results_test_conflicts(row[0], evosuite, row[6], row[7])
                    evosuite_diff = semantic_study.evosuite_diff_setup.exec_evosuite_diff_jar_test_conflict(semantic_study, merge, row[10], row[11], row[13], row[5], row[3], row[2])
                    semantic_study.output_report.write_output_results_test_conflicts(row[0], evosuite_diff, row[6], row[7])
                    evosuite_diff = semantic_study.evosuite_diff_setup.exec_evosuite_diff_jar_test_conflict(semantic_study, merge, row[10], row[11], row[13], row[5], row[4], row[2])
                    semantic_study.output_report.write_output_results_test_conflicts(row[0], evosuite_diff, row[6], row[7])
                    randoop = semantic_study.randoop_setup.exec_randoop_jar_test_conflict(semantic_study, merge, row[10], row[11], row[13], row[5], row[3], row[2])
                    semantic_study.output_report.write_output_results_test_conflicts(row[0], randoop, row[6], row[7])
                    randoop = semantic_study.randoop_setup.exec_randoop_jar_test_conflict(semantic_study, merge, row[10], row[11], row[13], row[5], row[4], row[2])
                    semantic_study.output_report.write_output_results_test_conflicts(row[0], randoop, row[6], row[7])

    final_report = Report()
    final_report.get_report(os.getcwd().replace("/nimrod/proj","/semantic_conflict_results.csv"))
