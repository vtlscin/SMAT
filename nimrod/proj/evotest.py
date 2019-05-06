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

class evotest:


    def __init__(self):
        self.classes_dir = '/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/apiguardian-api-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/commons-lang3-3.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/hamcrest-core-1.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-4.13-beta-1.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-jupiter-api-5.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-platform-commons-1.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/opentest4j-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/classes/'
        self.sut_class = "br.com.Ball"
        self.dRegCp = '/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/apiguardian-api-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/commons-lang3-3.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/hamcrest-core-1.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/junit-4.13-beta-1.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/junit-jupiter-api-5.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/junit-platform-commons-1.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/opentest4j-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/classes'
        self.java = Java(get_config()['java_home'])
        self.maven = Maven(self.java, get_config()['maven_home'])
        self.evosuite_diff_params = None
        self.suite_evosuite_diff =None

    def gen_evosuite_diff(self):
        evosuite = Evosuite(
            java=self.java,
            classpath=self.classes_dir,
            sut_class=self.sut_class,
            params=self.evosuite_diff_params,
            tests_src="/media/jprm/Ubuntu/IC/nimrod-hunor/nimrod/proj/output"
        )
        self.suite_evosuite_diff = evosuite.generate_differential(self.dRegCp)
        return self.suite_evosuite_diff


if __name__ == '__main__':


    evo = evotest()
    evo.gen_evosuite_diff()





    #os.system('java -jar /media/jprm/Ubuntu/IC/evosuite/evosuite-1.0.6.jar -regressionSuite -projectCP $(find /media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/ | paste -sd ":")":/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/classes/" -Dregressioncp=$(find /media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/ | paste -sd ":")":/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/classes" -class br.com.Ball')

    #thread_evosuite_test = threading.Thread(target=evo.gen_evosuite_diff, args=())
    #thread_evosuite_test.start()

    #os.system(evo.dRegCp)
    #print(evo.classes_dir)
    #print(evo.java)
    #a =subprocess.check_output(['java', '-jar', '/media/jprm/Ubuntu/IC/nimrod-hunor/nimrod/tools/bin/evosuite-1.0.6.jar','-regressionSuite'])
    #a = subprocess.check_output('java -jar /media/jprm/Ubuntu/IC/evosuite/evosuite-1.0.6.jar  -regressionSuite -projectCP /media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/apiguardian-api-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/commons-lang3-3.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/hamcrest-core-1.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-4.13-beta-1.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-jupiter-api-5.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/junit-platform-commons-1.0.3.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/dependency/opentest4j-1.0.0.jar:/media/jprm/Ubuntu/IC/example-project-evosuite/base/target/classes/ -Dregressioncp=$(find /media/jprm/Ubuntu/IC/example-project-evosuite/left/target/dependency/ | paste -sd ":")":/media/jprm/Ubuntu/IC/example-project-evosuite/left/target/classes" -class br.com.Ball',shell=True)

    #print(a)
