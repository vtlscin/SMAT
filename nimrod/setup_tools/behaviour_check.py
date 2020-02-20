class Behaviour_change:

    def check_different_test_results_for_commit_pair(self, parent_one, parent_two, path_suite):
        if ((parent_one.ok_tests - len(parent_two.not_executed_test_set)) != 0) and ((parent_two.ok_tests - len(parent_one.not_executed_test_set)) != 0) and (parent_one.fail_test_set.difference(parent_two.not_executed_test_set)) != (parent_two.fail_test_set.difference(parent_one.not_executed_test_set)):
            return [True, ((parent_one.fail_test_set.difference(parent_two.fail_test_set)).union(parent_two.fail_test_set.difference(parent_one.fail_test_set))).difference(parent_two.not_executed_test_set), path_suite[1]]
        else:
            return [False, ((parent_one.fail_test_set.difference(parent_two.fail_test_set)).union(parent_two.fail_test_set.difference(parent_one.fail_test_set))).difference(parent_two.not_executed_test_set), path_suite[1]]

    def check_different_test_results_for_merge_scenario(self, parent_one, parent_two, parent_tree, path_suite):
        if len(parent_one[2].intersection(parent_tree[2]).difference(parent_two[2])) > 0:
            return [True, parent_one[2].intersection(parent_tree[2]).difference(parent_two[2]), path_suite[1]]
        elif len(parent_two[2].difference(parent_one[2].union(parent_tree[2]))) > 0:
            return [True, parent_two[2].difference(parent_one[2].union(parent_tree[2])), path_suite[1]]
        else:
            return [False, parent_one[2].intersection(parent_tree[2]).difference(parent_two[2]).union(parent_two[2].difference(parent_one[2].intersection(parent_tree[2]))), path_suite[1]]