import re
import time
import subprocess

from nimrod.tools.bin import JUNIT, HAMCREST, JMOCKIT, EVOSUITE
from nimrod.utils import generate_classpath

TIMEOUT = 60 * 3


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

        params = (
            '-classpath', classpath,
            '-Dcoverage-classes=' + sut_class,
            '-Dcoverage-output=html',
            '-Dcoverage-metrics=line',
            '-Dcoverage-srcDirs=' + '.',
            'org.junit.runner.JUnitCore', test_class
        )

        start = time.time()
        try:
            output = self.java.exec_java(suite_dir, self.java.get_env(),
                                         timeout, *params)
            return (JUnit._extract_results_ok(output.decode('unicode_escape')),
                    time.time() - start)
        except subprocess.CalledProcessError as e:
            return (JUnit._extract_results(e.output.decode('unicode_escape')),
                    time.time() - start)
        except subprocess.TimeoutExpired:
            elapsed_time = time.time() - start
            print("# ERROR: Run JUnit tests timed out. {0} seconds".format(
                elapsed_time
            ))

        return (0, 0, set()), elapsed_time

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

