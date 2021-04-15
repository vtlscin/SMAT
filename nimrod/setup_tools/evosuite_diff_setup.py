from nimrod.setup_tools.setup_tool import Setup_tool
from nimrod.tools.evosuite import Evosuite


class Evosuite_Diff_setup(Setup_tool):

    def generate_test_suite(self, scenario, project_dep, randoopy):

        evosuite = Evosuite(
            java=project_dep.java,
            classpath=project_dep.classes_dir,
            sut_class=project_dep.sut_class,
            sut_method=project_dep.sut_method,
            params=self.tool_parameters,
            tests_src=project_dep.tests_dst + '/' + project_dep.project.get_project_name() + '/' + scenario.merge_scenario.get_merge_hash()
        )

        self.test_suite = evosuite.generate_differential(project_dep.dRegCp)
        return self.test_suite