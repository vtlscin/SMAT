import os
import time
import subprocess

from abc import ABC, abstractmethod
from collections import namedtuple

from nimrod.utils import generate_classpath
from nimrod.tools.bin import SAFIRA


ImpactAnalysisResult = namedtuple('ImpactAnalysisResult', ['methods',
                                                           'constructors',
                                                           'run_time'])


class ImpactAnalysis(ABC):
    pass

    @abstractmethod
    def run(self):
        """Execute impact analysis."""


class Safira(ImpactAnalysis):

    def __init__(self, java, classes_dir, mutant_dir):
        self.java = java
        self.classes_dir = classes_dir
        self.mutant_dir = mutant_dir

    def run(self):
        classpath = generate_classpath([
            SAFIRA
        ])

        start = time.time()
        try:
            output = self.java.simple_exec_java(
                '-classpath', classpath,
                'saferefactor.safira.SafiraStart', self.classes_dir,
                self.mutant_dir)

            return ImpactAnalysisResult(
                *self._extract_results(output.decode('unicode_escape')),
                time.time() - start
            )
        except subprocess.CalledProcessError:
            print('# ERROR: [SAFIRA] called process error')
        except subprocess.TimeoutExpired:
            elapsed_time = time.time() - start
            print("# ERROR: [SAFIRA] execution timed out: {0} seconds".format(
                elapsed_time
            ))

    @staticmethod
    def _extract_results(output):
        methods = []
        constructors = []

        for res in output.split("|"):
            res = res.split(':')
            if str(res[0]).startswith('method'):
                methods.append(' '.join(res[1].split()).strip())
            elif str(res[0]).startswith('cons'):
                constructors.append(' '.join(res[1].replace(
                    '.<init>', '').split()).strip())

        return methods, constructors
