from nimrod.project_info.commit import Commit
import csv

class MergeScenario:

    def __init__(self, path_local_clone, path_merge_scenarios):
        self.path_local_clone = path_local_clone
        self.path_merge_scenarios = path_merge_scenarios
        self.merge_scenarios = self.identify_merge_scenarios(path_merge_scenarios)

    def get_merge_scenarios(self):
        return self.merge_scenarios

    def identify_merge_scenarios(self, path_merge_scenarios):
        merge_scenarios = []
        with open(path_merge_scenarios) as csv_file:
            csv_reader = csv.reader(csv_file, delimiter=',')
            for row in csv_reader:
                commit = Commit(row[0], row[1], row[2], row[3], row[4])
                merge_scenarios.append(commit)
        return merge_scenarios