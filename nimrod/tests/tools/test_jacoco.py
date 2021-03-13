from unittest import TestCase

from nimrod.tests.utils import get_config
from nimrod.tools.java import Java
from nimrod.tools.jacoco import Jacoco


class TestJacoco(TestCase):

    @classmethod
    def setUp(cls):
        cls.java_home = get_config()['java_home']
        cls.java = Java(cls.java_home)

    # Teste do comando java -jar jacococli.jar instrument "jar_a_ser_modificado" --dest "local_jar_instrumetado"
    def test_instrument(self):
        jacoco = Jacoco(self.java)

        jarSemModificacaoes = "/home/vinicius/Documentos/UFPE/TCC/mergedataset/cloud-slang/20bac30d9bd76569aa6a4fa1e8261c1a9b5e6f76/original/base/cloudslang-all-0.7.50-SNAPSHOT-jar-with-dependencies.jar"
        destinoJarInstrumentado = "/home/vinicius/Documentos/UFPE/TCC/Resultados/CloudSlang/cloudslang-all/dest"

        jacoco.execIntrumentJar(jarSemModificacaoes, destinoJarInstrumentado)
