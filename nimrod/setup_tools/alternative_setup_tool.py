import os
from math import ceil

from nimrod.setup_tools.randoop_setup import Randoop_setup
from nimrod.tools.jacoco import Jacoco
from nimrod.tools.bin import JACOCOAGENT
from bs4 import BeautifulSoup
import codecs
import csv


# Classe criada com um comportamento alternativo do metodo generate_and_run_test_suites
class Alternative_setup_tool(Randoop_setup):

    def generate_and_run_test_suites(self, evo, scenario, commitBaseSha, commitParentTestSuite, commitOtherParent,
                                     commitMergeSha, conflict_info, tool, projectName):
        jacoco = Jacoco(java=evo.project_dep.java)
        for i in range(4):
            commitVersion = self.selectJar(evo, i, commitMergeSha, commitParentTestSuite, commitOtherParent,
                                           commitBaseSha)

            path_suite = self.generate_test_suite(scenario, evo.project_dep,
                                                  False)  # Indicacao para instanciar o randoopY

            dadosParaGravacaoRandoopX = self.retornaDadosParaAnalise(evo, path_suite, jacoco)

            path_suite_randoopY = self.generate_test_suite(scenario, evo.project_dep,
                                                           True)  # Indicacao para instanciar o randoopY
            # instrumentar jar

            # listaJar = evo.project_dep.classes_dir.split(
            #     ":")  # Melhoria poderia ser feita removendo caractere do final da lista caso ele exista.
            # listaJarInstrumentados = ""
            #
            # for j in range(len(listaJar) - 1):  # -1 pois existe um ultimo : ao final do evo.project_dep.classes_dir
            #     jacoco.execInstrumentJar(listaJar[j], path_suite.suite_dir)
            #     nomeJarInstrumentado = listaJar[j].split("/")  # recupera o nome do jar
            #     listaJarInstrumentados = listaJarInstrumentados + path_suite.suite_dir + "/" + nomeJarInstrumentado[len(
            #         nomeJarInstrumentado) - 1] + ":"  # nome do jar fica na ultima posicao da lista, : sao colocados para separar os jars
            #
            # listaJarInstrumentados = listaJarInstrumentados + JACOCOAGENT
            #
            # print(listaJarInstrumentados)
            #
            # self.run_test_suite(listaJarInstrumentados, evo.project_dep.sut_class, listaJarInstrumentados,
            #                     evo.project_dep)
            #
            # jacoco.generateReportHtml(path_suite.suite_dir, listaJar[4])
            #
            # reportHtml = codecs.open(path_suite.suite_dir + "/report/index.html", 'r')
            #
            # soup = BeautifulSoup(reportHtml, 'html.parser')
            #
            # tagFoot = soup.find('tfoot')
            #
            # tagTr = list(tagFoot.children)[0]
            #
            # print(list(tagTr.children))
            #
            # resultados = list(tagTr.children)
            #
            # totalClass = int((resultados[12].get_text()).replace(".", ""))
            # classesCobertas = int(totalClass - int((resultados[11].get_text()).replace(".", "")))
            #
            # print("Porcentagem de classes cobertas ", round((classesCobertas / totalClass) * 100, 2),
            #       " Classes cobertas ", classesCobertas)
            #
            # totalMetodos = int((resultados[10].get_text()).replace(".", ""))
            # metodosCobertos = int(totalMetodos - int((resultados[9].get_text()).replace(".", "")))
            #
            # print("Porcentagem de metodos cobertos ", round((metodosCobertos / totalMetodos) * 100, 2),
            #       " Metodos cobertas ", metodosCobertos)
            #
            # totalLinhas = int((resultados[8].get_text()).replace(".", ""))
            # linhasCobertas = int(totalLinhas - int((resultados[7].get_text()).replace(".", "")))
            #
            # print("Porcentagem de linhas cobertas ", round((linhasCobertas / totalLinhas) * 100, 2),
            #       " Linhas cobertas ",
            #       linhasCobertas)

            dadosParaGravacaoRandoopY = self.retornaDadosParaAnalise(evo, path_suite_randoopY, jacoco)

            # self.criaArquivoExcel(round((classesCobertas / totalClass) * 100, 2),
            #                       round((metodosCobertos / totalMetodos) * 100, 2),
            #                       round((linhasCobertas / totalLinhas) * 100, 2), commitVersion, projectName)

            self.criaArquivoExcel(dadosParaGravacaoRandoopX[0], dadosParaGravacaoRandoopY[0],
                                  dadosParaGravacaoRandoopX[1], dadosParaGravacaoRandoopY[1],
                                  dadosParaGravacaoRandoopX[2], dadosParaGravacaoRandoopY[2], commitVersion, projectName)

    # Metodo que vai atualizar selecionar o jar que vai gerar os testes de acordo com a iteracao
    def selectJar(self, evo, iteracao, commitMerge, commitLeft, commitRight, commitBase):
        commitVersion = ""
        if iteracao == 0:
            print('generated test with base jar')
            evo.project_dep.classes_dir = evo.project_dep.dRegCp
            commitVersion = commitBase
        elif iteracao == 1:
            print('generated test with left jar')
            evo.project_dep.classes_dir = evo.project_dep.left_dir
            commitVersion = commitLeft
        elif iteracao == 2:
            print('generated test with right jar')
            evo.project_dep.classes_dir = evo.project_dep.rightDir
            commitVersion = commitRight
        else:
            print('generated test with merge jar')
            evo.project_dep.classes_dir = evo.project_dep.mergeDir
            commitVersion = commitMerge
        return commitVersion

    def criaArquivoExcel(self, coberturaClasesX, coberturaClasesY, coberturaMetodosX, coberturaMetodosY, coberturaLinhasX, coberturaLinhasY
                         , commitVersion, projectName):
        if (os.path.isfile("./result_cobertura.csv") == False):
            with open("./result_cobertura.csv", 'w', newline='') as file:
                writer = csv.writer(file)
                writer.writerow(["commit", "projeto", "cobertura randoop X MUA", "cobertura randoop Y MUA", "cobertura randoop X CUA", "cobertura randoop Y CUA",
                                 "cobertura randoop X LUA", "cobertura randoop Y LUA"])
                writer.writerow([commitVersion, projectName, coberturaMetodosX, coberturaMetodosY, coberturaClasesX, coberturaClasesY,
                                 coberturaLinhasX, coberturaLinhasY])
        else:
            with open("./result_cobertura.csv", 'a+') as fd:
                writer = csv.writer(fd)
                writer.writerow([commitVersion, projectName, coberturaMetodosX, coberturaMetodosY, coberturaClasesX, coberturaClasesY,
                                 coberturaLinhasX, coberturaLinhasY])

    def retornaDadosParaAnalise(self, evo, path_suite, jacoco):
        listaJar = evo.project_dep.classes_dir.split(
            ":")  # Melhoria poderia ser feita removendo caractere do final da lista caso ele exista.
        listaJarInstrumentados = ""

        for j in range(len(listaJar) - 1):  # -1 pois existe um ultimo : ao final do evo.project_dep.classes_dir
            jacoco.execInstrumentJar(listaJar[j], path_suite.suite_dir)
            nomeJarInstrumentado = listaJar[j].split("/")  # recupera o nome do jar
            listaJarInstrumentados = listaJarInstrumentados + path_suite.suite_dir + "/" + nomeJarInstrumentado[len(
                nomeJarInstrumentado) - 1] + ":"  # nome do jar fica na ultima posicao da lista, : sao colocados para separar os jars

        listaJarInstrumentados = listaJarInstrumentados + JACOCOAGENT

        self.run_test_suite(listaJarInstrumentados, evo.project_dep.sut_class, listaJarInstrumentados,
                            evo.project_dep)

        listaJar = list(filter(lambda x: x != '', listaJar)) # filtra registros vazios da lista

        print(listaJar)

        jacoco.generateReportHtml(path_suite.suite_dir, listaJar)

        reportHtml = codecs.open(path_suite.suite_dir + "/report/index.html", 'r')

        soup = BeautifulSoup(reportHtml, 'html.parser')

        tagFoot = soup.find('tfoot')

        tagTr = list(tagFoot.children)[0]

        print(list(tagTr.children))

        resultados = list(tagTr.children)

        totalClass = int((resultados[12].get_text()).replace(".", ""))
        classesCobertas = int(totalClass - int((resultados[11].get_text()).replace(".", "")))

        porcentagemCoberturaClasse = round((classesCobertas / totalClass) * 100, 2)

        print("Porcentagem de classes cobertas ", porcentagemCoberturaClasse,
              " Classes cobertas ", classesCobertas)

        totalMetodos = int((resultados[10].get_text()).replace(".", ""))
        metodosCobertos = int(totalMetodos - int((resultados[9].get_text()).replace(".", "")))

        porcentagemCoberturaMetodo = round((metodosCobertos / totalMetodos) * 100, 2)

        print("Porcentagem de metodos cobertos ", porcentagemCoberturaMetodo,
              " Metodos cobertas ", metodosCobertos)

        totalLinhas = int((resultados[8].get_text()).replace(".", ""))
        linhasCobertas = int(totalLinhas - int((resultados[7].get_text()).replace(".", "")))

        porcentagemCoberturaLinhas = round((linhasCobertas / totalLinhas) * 100, 2)

        print("Porcentagem de linhas cobertas ", porcentagemCoberturaLinhas,
              " Linhas cobertas ",
              linhasCobertas)

        return [porcentagemCoberturaClasse, porcentagemCoberturaMetodo, porcentagemCoberturaLinhas]
