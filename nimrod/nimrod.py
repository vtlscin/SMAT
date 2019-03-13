import os
import shutil

from nimrod.tools.randoop import Randoop
from nimrod.tools.mujava import MuJava
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit

from collections import namedtuple


OUTPUT_DIR = 'nimrod_output'


NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'executions'])


class Nimrod:

    def __init__(self, java, maven):
        self.java = java
        self.maven = maven

    def run(self, project_dir, mutants_dir, sut_class, randoop_params=None,
            output_dir=None):

        results = {}

        _, classes_dir = self.maven.compile(project_dir, clean=True)
        output_dir = self.check_output_dir(output_dir if output_dir
                                           else os.path.join(project_dir,
                                                             OUTPUT_DIR))
        mutants = MuJava(self.java, mutants_dir).read_log()
        junit = JUnit(java=self.java, classpath=classes_dir)

        for mutant in mutants:
            tests_src = os.path.join(output_dir, 'suites', mutant.mid)

            randoop = Randoop(
                java=self.java,
                classpath=classes_dir,
                tests_src=tests_src,
                sut_class=sut_class,
                params=randoop_params
            )

            safira = Safira(
                java=self.java,
                classes_dir=classes_dir,
                mutant_dir=mutant.dir
            )

            suite = randoop.generate_with_impact_analysis(safira)

            test_result = junit.run_with_mutant(suite, sut_class, mutant)

            results[mutant.mid] = NimrodResult(test_result.fail_tests == 0,
                                               test_result.fail_tests > 0,
                                               test_result.executions)

        return results

    @staticmethod
    def check_output_dir(output_dir):
        output_dir = os.path.abspath(os.path.join('.', output_dir))
        if os.path.exists(output_dir):
            shutil.rmtree(output_dir)
        os.makedirs(output_dir)

        return output_dir
