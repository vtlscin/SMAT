from nimrod.tools.bin import JACOCOCLI, JACOCOAGENT
from nimrod.utils import generate_classpath


class Jacoco:
    def __init__(self, java):
        self.java = java

    # Run java -jar jacococli.jar instrument project_jar --dest dest_jar_instrumented
    def execIntrumentJar(self, projectJar, destJarinstrumented):
        params = [
            '-jar', JACOCOCLI,
            'instrument', projectJar,
            '--dest', destJarinstrumented
        ]
        return self.java.simple_exec_java(*params)
