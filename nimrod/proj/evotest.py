import csv
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

NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout', 'test_tool', 'is_equal_coverage'])


class evotest:

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
        csv_reader = csv.reader(csv_file, delimiter=';')
        for row in csv_reader:
            if row[1] == "commit_pairs":
                print("Commits pair analysis")
                evo = evotest(project_name=row[0])
                merge = MergeScenario(merge_information=row)

                evosuite_diff_commit_pair = evo.evosuite_diff_setup.exec_evosuite_diff_jar_commit_pair(evo, merge, row[7], row[6], row[3], row[2])
                evo.output_report.write_output_results_commit_pairs(row[0], evosuite_diff_commit_pair, row[4], row[5])
                evosuite_commit_pair = evo.evosuite_setup.exec_evosuite_jar_commit_pair(evo, merge, row[7], row[6],row[3], row[2])
                evo.output_report.write_output_results_commit_pairs(row[0], evosuite_commit_pair, row[4], row[5])
                randoop_commit_pair = evo.randoop_setup.exec_randoop_jar_commit_pair(evo, merge, row[7], row[6],row[3], row[2])
                evo.output_report.write_output_results_commit_pairs(row[0], randoop_commit_pair, row[4], row[5])
