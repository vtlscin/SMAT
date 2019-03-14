import os
import shutil

from nimrod.tools.randoop import Randoop
from nimrod.tools.mujava import MuJava
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit
from nimrod.tools.evosuite import Evosuite
from nimrod.utils import package_to_dir

from collections import namedtuple


OUTPUT_DIR = 'nimrod_output'


NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout'])


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

        for mutant in self.get_mutants(classes_dir, mutants_dir):
            if self.check_mutant(mutant, sut_class):
                tests_src = os.path.join(output_dir, 'suites', mutant.mid)

                test_result = self.try_evosuite(classes_dir, tests_src,
                                                sut_class, mutant,
                                                evosuite_params)
                if test_result.fail_tests > 0 or test_result.timeout:
                    results[mutant.mid] = self.create_nimrod_result(test_result,
                                                                    True)
                else:
                    test_result = self.try_randoop(classes_dir, tests_src,
                                                   sut_class, mutant,
                                                   randoop_params)

                    results[mutant.mid] = self.create_nimrod_result(test_result,
                                                                    False)

                self.print_result(mutant, results[mutant.mid])
                self.write_to_csv(results[mutant.mid], mutant, output_dir)

        return results

    @staticmethod
    def print_result( mutant, result):
        if result.maybe_equivalent:
            print('{0} maybe equivalent, executions: {1}.'
                  .format(mutant.mid, result.coverage.executions))
        else:
            print('{0} is not equivalent. {1}'
                  .format(mutant.mid, 'Killed by differential test.' if
                          result.differential else ''))

    @staticmethod
    def check_mutant(mutant, sut_class):
        if os.path.exists(mutant.dir):
            class_file = os.path.join(mutant.dir, package_to_dir(sut_class) +
                                      '.class')
            if not os.path.exists(class_file):
                print("{0}: .class not found.".format(mutant.mid))
                return False
            else:
                return True
        else:
            print('{0}: directory not found.'.format(mutant.mid))
            return False

    def get_mutants(self, classpath, mutants_dir):
        mujava = MuJava(self.java, mutants_dir)
        mutants = mujava.read_log()
        mujava.compile_mutants(classpath, mutants)

        return mutants

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

    @staticmethod
    def create_nimrod_result(test_result, differential):
        return NimrodResult(
            test_result.fail_tests == 0 and not test_result.timeout,
            test_result.fail_tests > 0 or test_result.timeout,
            test_result.coverage, differential, test_result.timeout)

    @staticmethod
    def write_to_csv(result, mutant, output_dir='.', filename='nimrod.csv',
                     exclude_if_exists=False):
        file = os.path.join(output_dir, filename)

        if exclude_if_exists:
            if os.path.exists(file):
                os.remove(file)

        if not os.path.exists(file):
            with open(file, 'w') as f:
                f.write('mutant,maybe_equivalent,not_equivalent,differential,' +
                        'timeout,call_points,test_cases,executions\n')

        if result and mutant:
            with open(file, 'a') as f:
                f.write('{0},{1},{2},{3},{4},{5},{6},{7}\n'.format(
                    mutant.mid,
                    'x' if result.maybe_equivalent else '',
                    'x' if result.not_equivalent else '',
                    'x' if result.differential else '',
                    'x' if result.timeout else '',
                    len(result.coverage.call_points),
                    len(result.coverage.test_cases),
                    result.coverage.executions
                ))
                f.close()



