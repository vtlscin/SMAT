import csv
import os

class Output_report():

    def __init__(self, output_path):
        self.path_output_csv = output_path

    def write_output_results(self, project_name, scenario, tool, which_parent, criteria_validation, class_information, method_information):
        if (os.path.isfile(os.getcwd().replace("/nimrod/proj","/")+'semantic_study_result.csv') == False):
            self.create_result_file()
        else:
            self.path_output_csv = os.getcwd().replace("/nimrod/proj", "/") + "semantic_study_result.csv"
        self.write_each_result(self.formate_output_line(project_name, scenario.merge_scenario.get_merge_hash(), tool, which_parent, "base-parent", criteria_validation, 0, class_information, method_information))
        self.write_each_result(self.formate_output_line(project_name, scenario.merge_scenario.get_merge_hash(), tool, which_parent, "parent-merge", criteria_validation, 1, class_information, method_information))
        self.write_each_result(self.formate_output_line(project_name, scenario.merge_scenario.get_merge_hash(), tool, which_parent, "base-merge", criteria_validation, 2, class_information, method_information))

    def create_result_file(self):
        with open(os.getcwd().replace("/nimrod/proj","/")+'semantic_study_result.csv', 'w', newline='') as file:
            writer = csv.writer(file)
            writer.writerow(["project_name", "merge_commit", "tool_under_analysis", "analyzed_parent", "commit_pair", "behavior_change", "failed_test_cases", "local_test_suite", "class_under-analysis", "method_under_analysis"])

        self.path_output_csv = os.getcwd().replace("/nimrod/proj","/")+"semantic_study_result.csv"


    def write_each_result(self, output):
        with open(self.path_output_csv, 'a+') as fd:
            writer = csv.writer(fd)
            writer.writerow(output)

    def formate_output_line(self, project_name, merge, tool, which_parent, commit_pair, criteria_validation, id_information, class_information, method_information):
        if (len(criteria_validation) > 0 and criteria_validation[id_information] != None):
            return [project_name, merge, tool, which_parent, commit_pair, criteria_validation[id_information][0], criteria_validation[id_information][1], criteria_validation[id_information][2], class_information, method_information]
        else:
            return [project_name, merge, tool,
                                  which_parent, commit_pair, "NO_INFORMATION", "", "","",""]