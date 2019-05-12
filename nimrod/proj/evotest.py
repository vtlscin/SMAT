import os
import shutil
import time
import threading
import subprocess
from nimrod.tools.randoop import Randoop
from nimrod.tools.mujava import MuJava
from nimrod.mutant import Mutant
from nimrod.tools.safira import Safira
from nimrod.tools.junit import JUnit, JUnitResult, Coverage
from nimrod.tools.evosuite import Evosuite
from nimrod.utils import package_to_dir

from collections import namedtuple


from nimrod.tools.java import Java
from nimrod.tools.maven import Maven
from nimrod.tests.utils import get_config

NimrodResult = namedtuple('NimrodResult', ['maybe_equivalent', 'not_equivalent',
                                           'coverage', 'differential',
                                           'timeout', 'test_tool', 'is_equal_coverage'])
class evotest:


    def __init__(self):
        self.classes_dir = '/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/apiguardian-api-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/commons-lang3-3.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/hamcrest-core-1.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-4.13-beta-1.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-jupiter-api-5.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-platform-commons-1.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/opentest4j-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/classes/'
        self.sut_class = "br.com.Ball"
        self.dRegCp = '/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/apiguardian-api-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/commons-lang3-3.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/hamcrest-core-1.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/junit-4.13-beta-1.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/junit-jupiter-api-5.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/junit-platform-commons-1.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/opentest4j-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/classes'
        self.java = Java(get_config()['java_home'])
        self.maven = Maven(self.java, get_config()['maven_home'])
        self.evosuite_diff_params = None
        self.suite_evosuite_diff =None
        self.tests_src = "/media/jprm/Ubuntu/IC/nimrod-hunor/nimrod/proj/output"

    def gen_evosuite_diff(self):
        evosuite = Evosuite(
            java=self.java,
            classpath=self.classes_dir,
            sut_class=self.sut_class,
            params=self.evosuite_diff_params,
            tests_src=self.tests_src
        )
        self.suite_evosuite_diff = evosuite.generate_differential(self.dRegCp)
        return self.suite_evosuite_diff


    def try_evosuite_diff(self, classes_dir, sut_class, mutant_dir):
        junit = JUnit(java=self.java, classpath=classes_dir)
        return junit.run_with_mutant(self.suite_evosuite_diff, sut_class, mutant_dir)


    def create_nimrod_result(test_result, differential, test_tool, is_equal_coverage=False):
        return NimrodResult(
            test_result.fail_tests == 0 and not test_result.timeout,
            test_result.fail_tests > 0 or test_result.timeout,
            test_result.coverage, differential, test_result.timeout, test_tool, is_equal_coverage)

if __name__ == '__main__':

    evo = evotest()
    #evo.gen_evosuite_diff()
    thread_evosuite_diff = threading.Thread(target=evo.gen_evosuite_diff)

    print("waiting analisys finish")
    thread_evosuite_diff.start()
    thread_evosuite_diff.join()
    print("ended")

    test_result = evo.try_evosuite_diff(evo.sut_class,
                                         evo.classes_dir, evo.dRegCp)

    print(test_result)
    if test_result.fail_tests > 0 or test_result.timeout:
    #    results = evo.create_nimrod_result(test_result, True, 'evosuite')
          print("dsdsd")

'''
    test_result = evo.try_evosuite_diff(evo.classes_dir, evo.tests_src,evo.sut_class)

    if test_result.fail_tests > 0 or test_result.timeout:
        results[mutant.mid] = self.create_nimrod_result(test_result,
                                                        True, 'evosuite')
'''