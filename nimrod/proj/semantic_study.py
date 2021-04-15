import csv
import os
from collections import namedtuple

from nimrod.proj.project_dependencies import Project_dependecies
from nimrod.project_info.git_project import GitProject
from nimrod.project_info.merge_scenario import MergeScenario
from nimrod.report.output_report import Output_report
from nimrod.report.output_semantic_conflicts import Output_semantic_conflicts
from nimrod.report.report import Report
from nimrod.setup_tools.alternative_setup_tool import Alternative_setup_tool
from nimrod.setup_tools.evosuite_diff_setup import Evosuite_Diff_setup
from nimrod.setup_tools.evosuite_setup import Evosuite_setup
from nimrod.setup_tools.randoop_setup import Randoop_setup
from nimrod.tests.utils import get_config
from nimrod.setup_tools.tools import Tools

NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout', 'test_tool', 'is_equal_coverage'])


class semantic_study:

    def __init__(self, path_local_project="", path_local_module_analysis="", project_name=""):
        config = get_config()
        self.project_dep = Project_dependecies(config, path_local_project, path_local_module_analysis, project_name)

        self.evosuite_setup = Evosuite_setup()
        self.evosuite_diff_setup = Evosuite_Diff_setup()
        self.randoop_setup = Alternative_setup_tool()
        # self.randoop_setup = Randoop_setup()

        self.output_semantic_conflict = Output_semantic_conflicts(os.getcwd().replace("/nimrod/proj", "/"), "test_conflicts")

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
                semantic_study_obj = semantic_study(project_name=row[0])
                merge = MergeScenario(merge_information=row)
                for i in range(0, 1):
                    evosuite_diff_commit_pair = semantic_study_obj.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(semantic_study_obj, merge, row[10], row[11], row[5], row[3])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[6], row[7])
                    evosuite_diff_commit_pair = semantic_study_obj.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(semantic_study_obj, merge, row[10], row[12], row[5], row[4])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[6], row[7])
                    evosuite_diff_commit_pair = semantic_study_obj.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(semantic_study_obj, merge, row[11], row[13], row[2], row[3])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[6], row[7])
                    evosuite_diff_commit_pair = semantic_study_obj.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(semantic_study_obj, merge, row[12], row[13], row[2], row[4])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[6], row[7])
                    evosuite_commit_pair = semantic_study_obj.evosuite_setup.exec_evosuite_jar_commit_pair(semantic_study_obj, merge, row[10], row[11], row[5], row[3])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[6], row[7])
                    evosuite_commit_pair = semantic_study_obj.evosuite_setup.exec_evosuite_jar_commit_pair(semantic_study_obj, merge, row[10], row[12], row[5], row[4])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[6], row[7])
                    evosuite_commit_pair = semantic_study_obj.evosuite_setup.exec_evosuite_jar_commit_pair(semantic_study_obj, merge, row[11], row[13], row[2], row[3])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[6], row[7])
                    evosuite_commit_pair = semantic_study_obj.evosuite_setup.exec_evosuite_jar_commit_pair(semantic_study_obj, merge, row[12], row[13], row[2], row[4])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[6], row[7])
                    randoop_commit_pair = semantic_study_obj.randoop_setup.exec_randoop_jar_commit_pair(semantic_study_obj, merge, row[10], row[11], row[5], row[3])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[6], row[7])
                    randoop_commit_pair = semantic_study_obj.randoop_setup.exec_randoop_jar_commit_pair(semantic_study_obj, merge, row[10], row[12], row[5], row[4])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[6], row[7])
                    randoop_commit_pair = semantic_study_obj.randoop_setup.exec_randoop_jar_commit_pair(semantic_study_obj, merge, row[11], row[13], row[2], row[3])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[6], row[7])
                    randoop_commit_pair = semantic_study_obj.randoop_setup.exec_randoop_jar_commit_pair(semantic_study_obj, merge, row[12], row[13], row[2], row[4])
                    semantic_study_obj.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[6], row[7])
            elif row[1] == "true":
                print("Semantic Conflict Analysis")
                semantic_study_obj = semantic_study(project_name=row[0])
                merge = MergeScenario(merge_information=row)
                #path_report = semantic_study_obj.output_report.path_output_csv_test_conflicts
                for i in range(0, 1):
                    # evosuite = semantic_study_obj.evosuite_setup.run_tool_for_semantic_conflict_detection(semantic_study_obj, merge, row[10], row[11], row[12], row[13], row[5], row[3], row[4], row[2], Tools.EVOSUITE.value)
                    # semantic_study_obj.output_semantic_conflict.write_output_line(row[0], evosuite, row[6], row[7])
                    # evosuite_diff = semantic_study_obj.evosuite_diff_setup.run_tool_for_semantic_conflict_detection(semantic_study_obj, merge, row[10], row[11], row[12], row[13], row[5], row[3], row[4], row[2], Tools.DIFF_EVOSUITE.value)
                    # semantic_study_obj.output_semantic_conflict.write_output_line(row[0], evosuite_diff, row[6], row[7])
                    randoop = semantic_study_obj.randoop_setup.run_tool_for_semantic_conflict_detection(semantic_study_obj, merge, row[10], row[11], row[12], row[13], row[5], row[4], row[3], row[2], Tools.RANDOOP.value, row[0])
                    semantic_study_obj.output_semantic_conflict.write_output_line(row[0], randoop, row[6], row[7])

    final_report = Report()
    final_report.get_report(os.getcwd().replace("/nimrod/proj","/test_conflicts2.csv"))
