import sys
import time
import subprocess

from abc import ABC, abstractmethod
from collections import namedtuple

from nimrod.utils import generate_classpath
from nimrod.tools.bin import SAFIRA


ImpactAnalysisResult = namedtuple('ImpactAnalysisResult', ['methods',
                                                           'constructors',
                                                           'run_time'])

TIMEOUT = 60 * 1


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

    def run(self, params=None, timeout=TIMEOUT):
        classpath = generate_classpath([
            SAFIRA
        ])

        start = time.time()
        try:
            output = self.java.exec_java(
                None, self.java.get_env(), timeout,
                '-classpath', classpath,
                'saferefactor.safira.SafiraStart',
                *tuple(params if params else []),
                self.classes_dir, self.mutant_dir
            )
            return ImpactAnalysisResult(
                *self._extract_results(output.decode('unicode_escape')),
                time.time() - start
            )
        except subprocess.TimeoutExpired as e:
            elapsed_time = time.time() - start
            print("# ERROR: [SAFIRA] execution timed out: {0} seconds".format(
                elapsed_time), file=sys.stderr)
            raise e

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
