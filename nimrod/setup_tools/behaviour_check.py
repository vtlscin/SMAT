class Behaviour_change:

    def check_different_test_results_for_commit_pair(self, parent_one, parent_two, path_suite, commitOneSHA, commitTwoSHA, tool):
        aux = (parent_one.fail_test_set.difference(parent_two.fail_test_set)).difference(parent_two.not_executed_test_set).union(parent_two.fail_test_set.difference(parent_one.fail_test_set)).difference(parent_one.not_executed_test_set)
        selected_cases = self.get_test_cases_with_files(aux, parent_one.fail_test_set_with_files).union(self.get_test_cases_with_files(aux, parent_two.fail_test_set_with_files))
        detected_behavior_change = False

        if len(selected_cases) > 0:
            detected_behavior_change = True

        return [detected_behavior_change, selected_cases, path_suite[1], commitOneSHA, commitTwoSHA, tool]

    def get_test_cases_with_files(self, selected_cases, test_cases_with_files):
        selected_cases_with_files = set()
        for test in selected_cases:
            for test_with_file in test_cases_with_files:
                if (test in test_with_file):
                    selected_cases_with_files.add(test_with_file)

        return selected_cases_with_files

    def check_different_test_results_for_merge_scenario(self, parent_one, parent_two, parent_tree, path_suite, commitBase, commitParent, commitMerge, tool):
        aux_fail_pass_fail = (parent_one.fail_test_set.intersection(parent_tree.fail_test_set)).difference(parent_one.not_executed_test_set).difference(parent_tree.not_executed_test_set).difference(parent_two.not_executed_test_set).difference(parent_two.fail_test_set)
        aux_pass_fail_pass = (parent_one.ok_tests.intersection(parent_tree.ok_tests)).difference(parent_one.not_executed_test_set).difference(parent_tree.not_executed_test_set).difference(parent_two.not_executed_test_set).difference(parent_two.ok_tests)
        selected_cases = self.get_test_cases_with_files(aux_fail_pass_fail, parent_one.fail_test_set_with_files).union(self.get_test_cases_with_files(aux_pass_fail_pass, parent_two.fail_test_set_with_files))
        detected_behavior_change = False

        if len(selected_cases) > 0:
            detected_behavior_change = True

        return [detected_behavior_change, selected_cases, path_suite[1], commitBase, commitParent, commitMerge, tool, parent_one.flaky_test_set]