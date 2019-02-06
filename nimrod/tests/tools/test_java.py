import os
from unittest import TestCase
from nimrod.tools.java import Java
from nimrod.tests.utils import get_config


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
        with self.assertRaises(SystemExit):
            Java()

    def test_init_with_wrong_parameter(self):
        with self.assertRaises(SystemExit):
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