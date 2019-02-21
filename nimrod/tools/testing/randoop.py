from nimrod.tools.testing.test_generator import TestGenerator

import os
import random

from nimrod.utils import generate_classpath

PATH = os.path.dirname(os.path.abspath(__file__))
RANDOOP = os.sep.join([PATH, '..', 'bin', 'randoop-all-4.0.3.jar'])


class Randoop(TestGenerator):

    def _get_tool_name(self):
        return "randoop"

    def _exec_tool(self):
        command = [
            '-classpath', generate_classpath([self.classpath, RANDOOP]),
            'randoop.main.Main',
            'gentests',
            '--randomseed=' + str(random.randint(0, 9999)),
            '--testclass=' + self.sut_class,
            '--junit-output-dir=' + self.suite_dir
        ]

        command += self.parameters

        return self._exec(*tuple(command))

    def _test_classes(self):
        return ['RegressionTest']
