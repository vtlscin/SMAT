from nimrod.tools.bin import JACOCOCLI, JACOCOAGENT
from nimrod.utils import generate_classpath

TIMEOUT = 80

class Jacoco:
    def __init__(self, java, classpath):
        self.java = java
        self.classpath = classpath

    #Run java -jar jacococli.jar instrument project_jar --dest dest_jar_instrumented
    def execIntrumentJar(self, projectJar, destJarinstrumented):
        params = [
            '-jar', JACOCOCLI,
            'instrument', projectJar,
            '--dest', destJarinstrumented
        ]
        self.java.simple_exec_java(params)