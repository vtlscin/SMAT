from unittest import TestCase

import os
import shutil

from nimrod.tests.utils import get_config
from nimrod.tests.utils import calculator_project_dir
from nimrod.tests.utils import calculator_clean_project
from nimrod.tests.utils import calculator_target_dir

from nimrod.tools.java import Java
from nimrod.tools.maven import Maven
from nimrod.tools.randoop import Randoop
from nimrod.tools.junit import JUnit


class TestJUnit(TestCase):

    @classmethod
    def setUpClass(self):
        self.java_home = get_config()['java_home']
        self.maven_home = get_config()['maven_home']

        self.java = Java(self.java_home)
        self.maven = Maven(self.java, self.maven_home)

        self.maven.compile(calculator_project_dir(), 10)

    def test_run_junit(self):
        classpath = os.path.join(calculator_target_dir(), 'classes')
        tests_src = os.path.join(calculator_project_dir(), 'randoop')
        junit = JUnit(self.java, classpath)

        sut_class = 'br.ufal.ic.easy.operations.Sum'

        (suite_name, suite_dir, suite_classes_dir,
         suite_classes) = self.generate_suite(tests_src, sut_class)

        output = junit.exec(suite_dir, suite_classes_dir, sut_class,
                            suite_classes[0])

        self.assertTrue(output.ok_tests > 0)
        self.assertTrue(output.fail_tests == 0)
        self.assertTrue(len(output.fail_test_set) == 0)
        self.assertTrue(output.run_time > 0)

        shutil.rmtree(tests_src)

    def generate_suite(self, tests_src, sut_class):
        randoop = Randoop(
            java=self.java,
            classpath=os.path.join(calculator_target_dir(), 'classes'),
            tests_src=tests_src,
            sut_class=sut_class
        )
        randoop.parameters = ['--time-limit=1']

        return randoop.generate()

    def tearDown(self):
        calculator_clean_project()
