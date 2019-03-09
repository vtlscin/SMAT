from nimrod.tools.testing.suite_generator import SuiteGenerator

import random

from nimrod.utils import generate_classpath
from nimrod.tools.bin import RANDOOP


class Randoop(SuiteGenerator):

    def _get_tool_name(self):
        return "randoop"

    def _exec_tool(self):
        params = [
            '-classpath', generate_classpath([self.classpath, RANDOOP]),
            'randoop.main.Main',
            'gentests',
            '--randomseed=' + str(random.randint(0, 9999)),
            '--testclass=' + self.sut_class,
            '--junit-output-dir=' + self.suite_dir
        ]

        params += self.parameters

        return self._exec(*tuple(params))

    def _test_classes(self):
        return ['RegressionTest']
