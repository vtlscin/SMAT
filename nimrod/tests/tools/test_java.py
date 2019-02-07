import os
import subprocess

from unittest import TestCase
from nimrod.tools.java import Java
from nimrod.tests.utils import get_config
from nimrod.tests.utils import path_calculator_file
from nimrod.tests.utils import path_calculator_package


class TestJava(TestCase):

    def setUp(self):
        self.java_home = get_config()['java_home']

    def test_init_java_home_not_found(self):
        if 'JAVA_HOME' in os.environ:
            del os.environ['JAVA_HOME']

        with self.assertRaises(SystemExit):
            Java()

    def test_init_without_parameters(self):
        os.environ['JAVA_HOME'] = self.java_home
        Java()

    def test_init_with_parameter(self):
        Java(self.java_home)

    def test_init_wrong_java_home(self):
        os.environ['JAVA_HOME'] = 'wrong_path'
        with self.assertRaises(FileNotFoundError):
            Java()

    def test_init_with_wrong_parameter(self):
        with self.assertRaises(FileNotFoundError):
            Java('wrong_path')

    def test_javac_path(self):
        java = Java(self.java_home)

        self.assertEqual(
            os.path.join(self.java_home, os.sep.join(['bin', 'javac'])),
            java.javac)

    def test_java_path(self):
        java = Java(self.java_home)

        self.assertEqual(
            os.path.join(self.java_home, os.sep.join(['jre', 'bin', 'java'])),
            java.java)

    def test_compile_java_file(self):
        java = Java(self.java_home)

        class_file = os.path.join(path_calculator_package(), 'Calculator.class')

        if os.path.isfile(class_file):
            os.remove(class_file)

        java.exec_javac(path_calculator_file(), None, None, 10)

        self.assertTrue(os.path.isfile(class_file))

    def test_java_timeout(self):
        java = Java(self.java_home)

        with self.assertRaises(subprocess.TimeoutExpired):
            java.exec_javac(path_calculator_file(), None, None, 0)

    def test_get_env(self):
        java = Java(self.java_home)

        env = java.get_env({'VARIABLE': 'VALUE'})

        self.assertTrue('JAVA_HOME' in env)
        self.assertTrue('VARIABLE' in env)
        self.assertEqual(env['VARIABLE'], 'VALUE')