import os
import shutil
import time

from nimrod.tools.randoop import Randoop
from nimrod.tools.mujava import MuJava
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit, JUnitResult, Coverage
from nimrod.tools.evosuite import Evosuite
from nimrod.utils import package_to_dir

from collections import namedtuple


OUTPUT_DIR = 'nimrod_output'


NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout', 'test_tool'])


class Nimrod:

    def __init__(self, java, maven):
        self.java = java
        self.maven = maven

    def run(self, project_dir, mutants_dir, sut_class, randoop_params=None,
            evosuite_diff_params=None, evosuite_params=None, output_dir=None):

        results = {}

        _, classes_dir = self.maven.compile(project_dir, clean=True)
        output_dir = self.check_output_dir(output_dir if output_dir
                                           else os.path.join(project_dir,
                                                             OUTPUT_DIR))

        for mutant in self.get_mutants(classes_dir, mutants_dir):
            start_time = time.time()
            if self.check_mutant(mutant, sut_class):
                tests_src = os.path.join(output_dir, 'suites', mutant.mid)
                
                test_result = self.try_evosuite_diff(classes_dir, tests_src,
                                                     sut_class, mutant,
                                                     evosuite_diff_params)
                
                
                if test_result.fail_tests > 0 or test_result.timeout:
                    results[mutant.mid] = self.create_nimrod_result(test_result,
                                                                    True, 'evosuite')
                else:
                    evo_test_result = self.try_evosuite(classes_dir, tests_src,
                                                        sut_class, mutant,
                                                        evosuite_params)
                    if evo_test_result and (evo_test_result.fail_tests > 0
                                            or evo_test_result.timeout):
                        results[mutant.mid] = self.create_nimrod_result(
                            evo_test_result, False, 'evosuite')
                    else:
                        ran_test_result = self.try_randoop(
                            classes_dir, tests_src, sut_class, mutant,
                            randoop_params)
                        if ran_test_result and (ran_test_result.fail_tests > 0
                                                or ran_test_result.timeout):
                            results[mutant.mid] = self.create_nimrod_result(
                                ran_test_result, False, 'randoop')
                        else:
                            results[mutant.mid] = self.sum_nimrod_result(
                                ran_test_result, evo_test_result, False)

                self.print_result(mutant, results[mutant.mid])
                exec_time = time.time() - start_time
                self.write_to_csv(results[mutant.mid], mutant, output_dir, exec_time=exec_time)

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
        print("Analyzing mutant: {0}".format(mutant.mid))
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

    def try_evosuite_diff(self, classes_dir, tests_src, sut_class, mutant,
                     evosuite_diff_params=None):
        junit = JUnit(java=self.java, classpath=classes_dir)

        evosuite = Evosuite(
            java=self.java,
            classpath=classes_dir,
            tests_src=tests_src,
            sut_class=sut_class,
            params=evosuite_diff_params
        )

        suite = evosuite.generate_differential(mutant.dir)

        return junit.run_with_mutant(suite, sut_class, mutant)

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
        # suite = evosuite.generate()

        safira = Safira(java=self.java, classes_dir=classes_dir,
                        mutant_dir=mutant.dir)

        suite = evosuite.generate_with_impact_analysis(safira)

        return (junit.run_with_mutant(suite, sut_class, mutant)
                if suite else None)

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

        return (junit.run_with_mutant(suite, sut_class, mutant)
                if suite else None)

    @staticmethod
    def check_output_dir(output_dir):
        output_dir = os.path.abspath(os.path.join('.', output_dir))
        if os.path.exists(output_dir):
            shutil.rmtree(output_dir)
        os.makedirs(output_dir)

        return output_dir

    @staticmethod
    def create_nimrod_result(test_result, differential, test_tool):
        return NimrodResult(
            test_result.fail_tests == 0 and not test_result.timeout,
            test_result.fail_tests > 0 or test_result.timeout,
            test_result.coverage, differential, test_result.timeout, test_tool)

    @staticmethod
    def sum_nimrod_result(ran, evo, differential):
        if ran and evo:
            return Nimrod.create_nimrod_result(
                JUnitResult(
                    ok_tests=ran.ok_tests + evo.ok_tests,
                    fail_tests=ran.fail_tests + evo.fail_tests,
                    fail_test_set=ran.fail_test_set.union(evo.fail_test_set),
                    run_time=ran.run_time + evo.run_time,
                    coverage=Coverage(
                        call_points=(ran.coverage.call_points
                                     .union(evo.coverage.call_points)),
                        test_cases=(ran.coverage.test_cases
                                    .union(evo.coverage.test_cases)),
                        executions=(ran.coverage.executions
                                    + evo.coverage.executions),
                    ),
                    timeout=ran.timeout or evo.timeout
                ),
                differential, ''
            )
        elif ran:
            return Nimrod.create_nimrod_result(ran, differential, 'randoop')
        elif evo:
            return Nimrod.create_nimrod_result(evo, differential, 'evosuite')

    @staticmethod
    def write_to_csv(result, mutant, output_dir='.', filename='nimrod.csv',
                     exclude_if_exists=False, exec_time=0):
        file = os.path.join(output_dir, filename)

        if exclude_if_exists:
            if os.path.exists(file):
                os.remove(file)

        if not os.path.exists(file):
            with open(file, 'w') as f:
                f.write('mutant,maybe_equivalent,not_equivalent,differential,' +
                        'timeout,killed_by,test_case,exec_time,call_points,test_cases,executions\n')

        if result and mutant:
            killer_tests = []
            if(len(result.coverage.test_cases)>0):
                killer_tests = [t[0]+'#'+t[1] for t in result.coverage.test_cases if len(t)==2]

            with open(file, 'a') as f:
                f.write('{0},{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}\n'.format(
                    mutant.mid,
                    'x' if result.maybe_equivalent else '',
                    'x' if result.not_equivalent else '',
                    'x' if result.differential else '',
                    'x' if result.timeout else '',
                    result.test_tool,
                    '' if result.maybe_equivalent else str(killer_tests).replace(',', '|'), 
                    round(exec_time, 2),                    
                    len(result.coverage.call_points),
                    len(result.coverage.test_cases),
                    result.coverage.executions
                ))
                f.close()



