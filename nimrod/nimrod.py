import os
import shutil

from nimrod.tools.randoop import Randoop
from nimrod.tools.mujava import MuJava
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit
from nimrod.tools.evosuite import Evosuite

from collections import namedtuple


OUTPUT_DIR = 'nimrod_output'


NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential'])


class Nimrod:

    def __init__(self, java, maven):
        self.java = java
        self.maven = maven

    def run(self, project_dir, mutants_dir, sut_class, randoop_params=None,
            evosuite_params=None, output_dir=None):

        results = {}

        _, classes_dir = self.maven.compile(project_dir, clean=True)
        output_dir = self.check_output_dir(output_dir if output_dir
                                           else os.path.join(project_dir,
                                                             OUTPUT_DIR))
        mutants = MuJava(self.java, mutants_dir).read_log()

        for mutant in mutants:
            tests_src = os.path.join(output_dir, 'suites', mutant.mid)

            test_result = self.try_evosuite(classes_dir, tests_src, sut_class,
                                            mutant, evosuite_params)
            if test_result.fail_tests > 0:
                results[mutant.mid] = NimrodResult(test_result.fail_tests == 0,
                                                   test_result.fail_tests > 0,
                                                   test_result.coverage, True)
            else:
                test_result = self.try_randoop(classes_dir, tests_src,
                                               sut_class, mutant,
                                               randoop_params)

                results[mutant.mid] = NimrodResult(test_result.fail_tests == 0,
                                                   test_result.fail_tests > 0,
                                                   test_result.coverage, False)

        return results

    def try_evosuite(self, classes_dir, tests_src, sut_class, mutant,
                     evosuite_params=None):
        junit = JUnit(java=self.java, classpath=classes_dir)

        evosuite = Evosuite(
            java=self.java,
            classpath=classes_dir,
            tests_src=tests_src,
            sut_class=sut_class,
            params=evosuite_params
        )

        suite = evosuite.generate_differential(mutant.dir)

        return junit.run_with_mutant(suite, sut_class, mutant)

    def try_randoop(self, classes_dir, tests_src, sut_class, mutant,
                    randoop_params=None):
        junit = JUnit(java=self.java, classpath=classes_dir)

        randoop = Randoop(
            java=self.java,
            classpath=classes_dir,
            tests_src=tests_src,
            sut_class=sut_class,
            params=randoop_params
        )

        safira = Safira(java=self.java, classes_dir=classes_dir,
                        mutant_dir=mutant.dir)

        suite = randoop.generate_with_impact_analysis(safira)

        return junit.run_with_mutant(suite, sut_class, mutant)

    @staticmethod
    def check_output_dir(output_dir):
        output_dir = os.path.abspath(os.path.join('.', output_dir))
        if os.path.exists(output_dir):
            shutil.rmtree(output_dir)
        os.makedirs(output_dir)

        return output_dir
