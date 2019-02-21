from unittest import TestCase

import os

from nimrod.tests.utils import get_config
from nimrod.tests.utils import calculator_project_dir
from nimrod.tests.utils import calculator_clean_project
from nimrod.tests.utils import calculator_target_dir

from nimrod.utils import get_files, get_class_files, get_java_files
from nimrod.utils import generate_classpath
from nimrod.tools.java import Java
from nimrod.tools.maven import Maven


class TestUtils(TestCase):

    def setUp(self):
        self.java_home = get_config()['java_home']
        self.maven_home = get_config()['maven_home']

        self.java = Java(self.java_home)
        self.maven = Maven(self.java, self.maven_home)

        self.maven.compile(calculator_project_dir(), 10)

    def test_get_files(self):
        classes = get_files(calculator_target_dir())

        self.assertEqual(8, len(classes))
        self.assertEqual(('maven-status/maven-compiler-plugin/compile/'
                         + 'default-compile/inputFiles.lst'), classes[0])
        self.assertEqual(('maven-status/maven-compiler-plugin/compile/'
                         + 'default-compile/createdFiles.lst'), classes[1])
        self.assertEqual('classes/br/ufal/ic/easy/Calculator.class',
                         classes[2])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Sum.class',
                         classes[3])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Operation.class',
                         classes[4])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Div.class',
                         classes[5])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Sub.class',
                         classes[6])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Mul.class',
                         classes[7])

    def test_get_class_files(self):
        classes = get_class_files(calculator_target_dir())

        self.assertEqual(6, len(classes))
        self.assertEqual('classes/br/ufal/ic/easy/Calculator.class',
                         classes[0])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Sum.class',
                         classes[1])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Operation.class',
                         classes[2])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Div.class',
                         classes[3])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Sub.class',
                         classes[4])
        self.assertEqual('classes/br/ufal/ic/easy/operations/Mul.class',
                         classes[5])

    def test_get_java_files(self):
        classes = get_java_files(calculator_project_dir())

        self.assertEqual(6, len(classes))
        self.assertEqual('src/main/java/br/ufal/ic/easy/Calculator.java',
                         classes[0])
        self.assertEqual('src/main/java/br/ufal/ic/easy/operations/Sum.java',
                         classes[1])
        self.assertEqual('src/main/java/br/ufal/ic/easy/operations/Div.java',
                         classes[2])
        self.assertEqual(('src/main/java/br/ufal/ic/easy/operations/'
                          'Operation.java'), classes[3])
        self.assertEqual('src/main/java/br/ufal/ic/easy/operations/Sub.java',
                         classes[4])
        self.assertEqual('src/main/java/br/ufal/ic/easy/operations/Mul.java',
                         classes[5])

    def test_generate_classpath(self):
        path = generate_classpath(['a', 'b', 'c'])
        path_split = path.split(os.pathsep)
        self.assertEqual('a', path_split[0])
        self.assertEqual('b', path_split[1])
        self.assertEqual('c', path_split[2])

    def tearDown(self):
        calculator_clean_project()