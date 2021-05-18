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
    # scenario.merge_scenario.sut_class
    def generate_and_run_test_suites(self, evo, scenario, commitBaseSha, commitParentTestSuite, commitOtherParent,
                                     commitMergeSha, conflict_info, tool, projectName):
        # lista com nome do pacote, metodo e classe targets
        listaPacoteMetodoClasse = self.recuperaClassePacoteMetodo(scenario.merge_scenario.sut_method.replace("|", ","))
        print("Gerando analise para projeto ", projectName)
        jacoco = Jacoco(java=evo.project_dep.java)
        for i in range(4):
            commitVersion = self.selectJar(evo, i, commitMergeSha, commitParentTestSuite, commitOtherParent,
                                           commitBaseSha)

            print("Gerando testes para o randoopX")
            path_suite = self.generate_test_suite(scenario, evo.project_dep,
                                                  False)  # Indicacao para instanciar o randoopY

            print("Iniciando analise de dados para o randoopX")
            dadosParaGravacaoRandoopX = self.retornaDadosParaAnalise(evo, path_suite, jacoco,
                                                                     scenario.merge_scenario.sut_class, listaPacoteMetodoClasse)

            print("Gerando testes para o randoopY")
            path_suite_randoopY = self.generate_test_suite(scenario, evo.project_dep,
                                                           True)  # Indicacao para instanciar o randoopY

            print("Iniciando analise de dados para o randoopY")
            dadosParaGravacaoRandoopY = self.retornaDadosParaAnalise(evo, path_suite_randoopY, jacoco,
                                                                     scenario.merge_scenario.sut_class, listaPacoteMetodoClasse)

            print("Gerando linha do csv para versao", commitVersion)
            self.criaArquivoExcel(dadosParaGravacaoRandoopX[0], dadosParaGravacaoRandoopY[0],
                                  dadosParaGravacaoRandoopX[1], dadosParaGravacaoRandoopY[1],
                                  dadosParaGravacaoRandoopX[2], dadosParaGravacaoRandoopY[2], commitVersion,
                                  projectName, scenario.merge_scenario.sut_class, dadosParaGravacaoRandoopX[3],
                                  dadosParaGravacaoRandoopX[4], dadosParaGravacaoRandoopY[3],
                                  dadosParaGravacaoRandoopY[4], listaPacoteMetodoClasse[0], dadosParaGravacaoRandoopX[5],
                                  dadosParaGravacaoRandoopY[5], dadosParaGravacaoRandoopX[6], dadosParaGravacaoRandoopY[6]
                                  ,dadosParaGravacaoRandoopX[7], dadosParaGravacaoRandoopY[7])

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

    def criaArquivoExcel(self, coberturaClasesX, coberturaClasesY, coberturaMetodosX, coberturaMetodosY,
                         coberturaLinhasX, coberturaLinhasY
                         , commitVersion, projectName, classeTarget, coberturaMetodoClasseTargetX,
                         coberturaLinhaClasseTargetX, coberturaMetodoClasseTargetY, coberturaLinhaClasseTargetY,
                         nomeMetodoTarget, coberturaLinhaMetodoTargetX, coberturaLinhaMetodoTargetY,
                         coberturaInstrMetodoTargetX, coberturaInstrMetodoTargetY, coberturaBranchMetodoTargetX,
                         coberturaBranchMetodoTargetY):
        if (os.path.isfile("./result_cobertura.csv") == False):
            with open("./result_cobertura.csv", 'w', newline='') as file:
                writer = csv.writer(file)
                writer.writerow(["commit", "projeto", "randoop X: cobertura metodo SUA", "randoop Y: cobertura metodo SUA",
                                 "randoop X: cobertura classe SUA", "randoop Y: cobertura classe SUA",
                                 "randoop X: cobertura linha SUA", "randoop Y: cobertura linha SUA", "classeTarget",
                                 "randoop X: cobertura metodo CUA",
                                 "randoop Y: cobertura metodo CUA", "randoop X: cobertura linha CUA",
                                 "randoop Y: cobertura linha CUA", "Metodo Target", "randoop X: cobertura linha MUA",
                                 "randoop Y: cobertura linha MUA", "randoop X: cobertura instruction MUA",
                                 "randoop Y: cobertura instruction MUA", "randoop X: cobertura branch MUA",
                                 "randoop Y: cobertura branch MUA"])
                writer.writerow([commitVersion, projectName, coberturaMetodosX, coberturaMetodosY, coberturaClasesX,
                                 coberturaClasesY,
                                 coberturaLinhasX, coberturaLinhasY, classeTarget, coberturaMetodoClasseTargetX,
                                 coberturaMetodoClasseTargetY, coberturaLinhaClasseTargetX,
                                 coberturaLinhaClasseTargetY, nomeMetodoTarget, coberturaLinhaMetodoTargetX,
                                 coberturaLinhaMetodoTargetY, coberturaInstrMetodoTargetX, coberturaInstrMetodoTargetY,
                                 coberturaBranchMetodoTargetX, coberturaBranchMetodoTargetY])
        else:
            with open("./result_cobertura.csv", 'a+') as fd:
                writer = csv.writer(fd)
                writer.writerow([commitVersion, projectName, coberturaMetodosX, coberturaMetodosY, coberturaClasesX,
                                 coberturaClasesY, coberturaLinhasX, coberturaLinhasY, classeTarget,
                                 coberturaMetodoClasseTargetX,
                                 coberturaMetodoClasseTargetY, coberturaLinhaClasseTargetX,
                                 coberturaLinhaClasseTargetY, nomeMetodoTarget, coberturaLinhaMetodoTargetX,
                                 coberturaLinhaMetodoTargetY, coberturaInstrMetodoTargetX, coberturaInstrMetodoTargetY,
                                 coberturaBranchMetodoTargetX, coberturaBranchMetodoTargetY])

    def retornaDadosParaAnalise(self, evo, path_suite, jacoco, classeTarget, listaPacoteMetodoClasse):
        global tagAClasseTarget
        global tagSpanMetodoTarget

        print("Classe Target ", classeTarget)

        listaJar = evo.project_dep.classes_dir.split(
            ":")  # Melhoria poderia ser feita removendo caractere do final da lista caso ele exista.
        listaJarInstrumentados = ""

        for j in range(len(listaJar) - 1):  # -1 pois existe um ultimo : ao final do evo.project_dep.classes_dir
            jacoco.execInstrumentJar(listaJar[j], path_suite.suite_dir)
            nomeJarInstrumentado = listaJar[j].split("/")  # recupera o nome do jar
            listaJarInstrumentados = listaJarInstrumentados + path_suite.suite_dir + "/" + nomeJarInstrumentado[len(
                nomeJarInstrumentado) - 1] + ":"  # nome do jar fica na ultima posicao da lista, : sao colocados para separar os jars

        listaJarInstrumentados = listaJarInstrumentados + JACOCOAGENT

        print("Iniciando execucao dos testes")
        self.run_test_suite(listaJarInstrumentados, evo.project_dep.sut_class, listaJarInstrumentados,
                            evo.project_dep)

        listaJar = list(filter(lambda x: x != '', listaJar))  # filtra registros vazios da lista

        print("Gerando report em html")
        jacoco.generateReportHtml(path_suite.suite_dir, listaJar)

        print("Gerando analise de todas classes do projeto")
        reportHtml = codecs.open(path_suite.suite_dir + "/report/index.html", 'r')

        soup = BeautifulSoup(reportHtml, 'html.parser')

        tagFoot = soup.find('tfoot')

        tagTr = list(tagFoot.children)[0]  # recupera a tag tr responsavel pela linha de resultados

        # print(list(tagTr.children))

        resultados = list(tagTr.children)

        totalClass = int((resultados[12].get_text()).replace(".", ""))
        classesCobertas = int(totalClass - int((resultados[11].get_text()).replace(".", "")))

        porcentagemCoberturaClasse = round((classesCobertas / totalClass) * 100, 2)

        # print("Porcentagem de classes cobertas ", porcentagemCoberturaClasse,
        #       " Classes cobertas ", classesCobertas)

        totalMetodos = int((resultados[10].get_text()).replace(".", ""))
        metodosCobertos = int(totalMetodos - int((resultados[9].get_text()).replace(".", "")))

        porcentagemCoberturaMetodo = round((metodosCobertos / totalMetodos) * 100, 2)

        # print("Porcentagem de metodos cobertos ", porcentagemCoberturaMetodo,
        #       " Metodos cobertas ", metodosCobertos)

        totalLinhas = int((resultados[8].get_text()).replace(".", ""))
        linhasCobertas = int(totalLinhas - int((resultados[7].get_text()).replace(".", "")))

        porcentagemCoberturaLinhas = round((linhasCobertas / totalLinhas) * 100, 2)

        # print("Porcentagem de linhas cobertas ", porcentagemCoberturaLinhas,
        #       " Linhas cobertas ",
        #       linhasCobertas)

        print("Gerando analise da classe target")
        reportClasseTarger = codecs.open(
            path_suite.suite_dir + "/report/" + listaPacoteMetodoClasse[2] + "/index.html",
            'r')  # abre o index.html relativo ao pacote da classe target

        soup = BeautifulSoup(reportClasseTarger, 'html.parser')

        tagsA = soup.find_all('a')  # recupera todas as tags a

        nomeClasseTarget = listaPacoteMetodoClasse[1]

        for i in range(len(tagsA)):
            if tagsA[i].get_text() == nomeClasseTarget:  # dentro das tags a escolhe a tag referente a classe target
                tagAClasseTarget = tagsA[i]
                break

        tagTr = list(tagAClasseTarget.parents)[1]  # recupera a tag tr responsavel pela linha de resultados

        # print(list(tagTr.children))

        resultadosClasseTarget = list(tagTr.children)

        totalLinhasClasseTarget = int((resultadosClasseTarget[8].get_text()).replace(".", ""))
        linhasCobertasClasseTarget = int(
            totalLinhasClasseTarget - int((resultadosClasseTarget[7].get_text()).replace(".", "")))

        porcentagemCoberturaLinhasClasseTarget = round((linhasCobertasClasseTarget / totalLinhasClasseTarget) * 100, 2)

        # print("Porcentagem de linhas cobertas classe target", porcentagemCoberturaLinhasClasseTarget,
        #       " Linhas cobertas classe target",
        #       totalLinhasClasseTarget)

        totalMetodosClasseTarget = int((resultadosClasseTarget[10].get_text()).replace(".", ""))
        metodosCobertosClasseTarget = int(
            totalMetodosClasseTarget - int((resultadosClasseTarget[9].get_text()).replace(".", "")))

        porcentagemCoberturaMetodoClasseTarget = round((metodosCobertosClasseTarget / totalMetodosClasseTarget) * 100,
                                                       2)

        # print("Porcentagem de metodos cobertos classe target", porcentagemCoberturaMetodoClasseTarget,
        #       " Metodos cobertas classe target", totalMetodosClasseTarget)

        print("Gerando analise do metodo target")
        reportMetodoTarger = codecs.open(
            path_suite.suite_dir + "/report/" + listaPacoteMetodoClasse[2] + "/" + listaPacoteMetodoClasse[1] + ".html",
            'r')  # abre o html relativo a classe target

        soup = BeautifulSoup(reportMetodoTarger, 'html.parser')

        tagsSpam = soup.find_all('span')  # recupera todas as tags spam

        nomeMetodoTarget = listaPacoteMetodoClasse[0]

        for i in range(len(tagsSpam)):
            if tagsSpam[i].get_text() == nomeMetodoTarget:  # dentro das tags a escolhe a tag referente a classe target
                tagSpanMetodoTarget = tagsSpam[i]
                break

        tagTr = list(tagSpanMetodoTarget.parents)[1]

        # print(list(tagTr.children))

        resultadosMetodoTarget = list(tagTr.children)

        totalLinhasMetodoTarget = int((resultadosMetodoTarget[8].get_text()).replace(".", ""))
        linhasCobertasMetodoTarget = int(
            totalLinhasMetodoTarget - int((resultadosMetodoTarget[7].get_text()).replace(".", "")))

        porcentagemCoberturaLinhasMetodoTarget = round((linhasCobertasMetodoTarget / totalLinhasMetodoTarget) * 100, 2)

        # print("Porcentagem de linhas cobertas metodo target", porcentagemCoberturaLinhasMetodoTarget,
        #       " Linhas cobertas metodo target",
        #       totalLinhasMetodoTarget)

        print("Gerando analise instruct metodo target")
        porcentagemInstrucMetodoTarget = (resultadosMetodoTarget[2].get_text()).replace("%", "")

        print("Gerando analise branch metodo target")
        porcentagemBranchMetodoTarget = (resultadosMetodoTarget[4].get_text()).replace("%", "")

        return [porcentagemCoberturaClasse, porcentagemCoberturaMetodo, porcentagemCoberturaLinhas,
                porcentagemCoberturaMetodoClasseTarget,
                porcentagemCoberturaLinhasClasseTarget, porcentagemCoberturaLinhasMetodoTarget,
                porcentagemInstrucMetodoTarget, porcentagemBranchMetodoTarget]

    # recupera pacote, nome da classe ou metodo target do teste
    def recuperaClassePacoteMetodo(self, pathMetodo):
        listaNomes = pathMetodo.split(".")
        nomeMetodo = listaNomes[len(listaNomes) - 1]  # ultima posicao
        nomeCLasse = listaNomes[len(listaNomes) - 2]  # penultima posicao
        listaNomes.remove(nomeMetodo)
        listaNomes.remove(nomeCLasse)
        pacote = ".".join(listaNomes)
        return [nomeMetodo, nomeCLasse, pacote]

