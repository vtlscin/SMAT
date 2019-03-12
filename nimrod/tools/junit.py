import re
import sys
import time
import subprocess

from collections import namedtuple

from nimrod.tools.bin import JUNIT, HAMCREST, JMOCKIT, EVOSUITE
from nimrod.utils import generate_classpath

TIMEOUT = 60 * 3


JUnitResult = namedtuple('JUnitResult', ['ok_tests', 'fail_tests', 
                                         'fail_test_set', 'run_time',
                                         'executions'])


class JUnit:

    def __init__(self, java, classpath):
        self.java = java
        self.classpath = classpath
        
    def exec(self, suite_dir, suite_classes_dir, sut_class, test_class,
             timeout=TIMEOUT):
        classpath = generate_classpath([
            JMOCKIT, JUNIT, HAMCREST, EVOSUITE,
            suite_classes_dir,
            self.classpath
        ])

        return self._exec(suite_dir, sut_class, test_class, classpath, '.',
                          timeout)

    def exec_with_mutant(self, suite_dir, suite_classes_dir, sut_class,
                         test_class, mutant, timeout=TIMEOUT):
        classpath = generate_classpath([
            JMOCKIT, JUNIT, HAMCREST, EVOSUITE,
            suite_classes_dir,
            mutant.dir,
            self.classpath
        ])

        return self._exec(suite_dir, sut_class, test_class, classpath,
                          mutant.dir, timeout)

    def _exec(self, suite_dir, sut_class, test_class, classpath,
              cov_src_dirs='.', timeout=TIMEOUT):

        params = (
            '-classpath', classpath,
            '-Dcoverage-classes=' + sut_class,
            '-Dcoverage-output=html',
            '-Dcoverage-metrics=line',
            '-Dcoverage-srcDirs=' + cov_src_dirs,
            'org.junit.runner.JUnitCore', test_class
        )

        start = time.time()
        try:
            output = self.java.exec_java(suite_dir, self.java.get_env(),
                                         timeout, *params)
            return JUnitResult(
                *JUnit._extract_results_ok(output.decode('unicode_escape')),
                time.time() - start, 0
            )
        except subprocess.CalledProcessError as e:
            return JUnitResult(
                *JUnit._extract_results(e.output.decode('unicode_escape')),
                time.time() - start, 0
            )
        except subprocess.TimeoutExpired as e:
            elapsed_time = time.time() - start
            print("# ERROR: Run JUnit tests timed out. {0} seconds".format(
                elapsed_time
            ), file=sys.stderr)
            raise e

    @staticmethod
    def _extract_results_ok(output):
        result = re.findall(r'OK \([0-9]* tests?\)', output)
        if len(result) > 0:
            result = result[0].replace('(', '')
            r = [int(s) for s in result.split() if s.isdigit()]
            return r[0], 0, set()

        return 0, 0, set()

    @staticmethod
    def _extract_results(output):
        if len(re.findall(r'initializationError', output)) == 0:
            result = re.findall(r'Tests run: [0-9]*,[ ]{2}Failures: [0-9]*',
                                output)
            if len(result) > 0:
                result = result[0].replace(',', ' ')
                r = [int(s) for s in result.split() if s.isdigit()]
                return r[0], r[1], JUnit._extract_test_id(output)

        return 0, 0, set()

    @staticmethod
    def _extract_test_id(output):
        tests_fail = set()
        for test in re.findall(r'\.test[0-9]+\([A-Za-z0-9_]+\.java:[0-9]+\)',
                               output):
            i = re.findall('\d+', test)
            file = re.findall(r'\(.+?(?=\.)', test)[0][1:]
            test_case = re.findall(r'\..+?(?=\()', test)[0][1:]

            if len(i) > 0:
                tests_fail.add('{0}#{1}'.format(file, test_case, int(i[-1])))
            else:
                print("*** ERROR: Error in regex of junit output.")

        return tests_fail

    def run_with_mutant(self, suite, sut_class, mutant):
        ok_tests = 0
        fail_tests = 0
        fail_test_set = set()
        run_time = 0
        executions = 0

        for test_class in suite.test_classes:
            result = self.exec_with_mutant(suite.suite_dir,
                                           suite.suite_classes_dir, sut_class,
                                           test_class, mutant)
            ok_tests += result.ok_tests
            fail_tests += result.fail_tests
            fail_test_set = fail_test_set.union(result.fail_test_set)
            run_time += run_time
            executions += result.executions

        return JUnitResult(ok_tests, fail_tests, fail_test_set, run_time,
                           executions)

