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
        listaPacoteMetodoClasse = self.recuperaClassePacoteMetodo(scenario.merge_scenario.sut_method.replace("|", ","), scenario.merge_scenario.sut_class)

        listaPartesBasicasReport = ["commit", "projeto"]
        listaCoberturaProjeto = ["randoop X: cobertura metodo SUA", "randoop Y: cobertura metodo SUA",
                                 "randoop X: cobertura classe SUA", "randoop Y: cobertura classe SUA",
                                 "randoop X: cobertura linha SUA", "randoop Y: cobertura linha SUA"]
        listaCoberturaClasse = ["classeTarget", "randoop X: cobertura metodo CUA", "randoop Y: cobertura metodo CUA",
                                "randoop X: cobertura linha CUA", "randoop Y: cobertura linha CUA"]
        listaCoberturaMetodo = ["Metodo Target", "randoop X: cobertura linha MUA", "randoop Y: cobertura linha MUA",
                                "randoop X: cobertura instruction MUA", "randoop Y: cobertura instruction MUA",
                                "randoop X: cobertura branch MUA", "randoop Y: cobertura branch MUA"]

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
                                                                     scenario.merge_scenario.sut_class,
                                                                     listaPacoteMetodoClasse)

            print("Gerando testes para o randoopY")
            path_suite_randoopY = self.generate_test_suite(scenario, evo.project_dep,
                                                           True)  # Indicacao para instanciar o randoopY

            print("Iniciando analise de dados para o randoopY")
            dadosParaGravacaoRandoopY = self.retornaDadosParaAnalise(evo, path_suite_randoopY, jacoco,
                                                                     scenario.merge_scenario.sut_class,
                                                                     listaPacoteMetodoClasse)

            print("Gerando linha do csv para versao", commitVersion)
            self.criaArquivoExcel(commitVersion, projectName, dadosParaGravacaoRandoopX, dadosParaGravacaoRandoopY, listaPartesBasicasReport,
                                  listaCoberturaProjeto, listaCoberturaClasse, listaCoberturaMetodo, scenario.merge_scenario.sut_class,
                                  listaPacoteMetodoClasse[0])

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

    def criaArquivoExcel(self, commitVersion, projectName, dadosParaGravacaoRandoopX, dadosParaGravacaoRandoopY, listaPartesBasicasReport,
                         listaCoberturaProjeto, listaCoberturaClasse, listaCoberturaMetodo, classeTarget, nomeMetodoTarget):
        if os.path.isfile("./result_cobertura.csv") == False:
            with open("./result_cobertura.csv", 'w', newline='') as file:
                if (dadosParaGravacaoRandoopX[1][0] is True) & (dadosParaGravacaoRandoopY[1][0] is True): # se possuir classe target
                    if (dadosParaGravacaoRandoopX[2][0] is True) & (dadosParaGravacaoRandoopY[2][0] is True): # se possuir metodo target
                        writer = csv.writer(file)
                        writer.writerow(
                            [listaPartesBasicasReport[0], listaPartesBasicasReport[1], listaCoberturaProjeto[0], listaCoberturaProjeto[1]
                                , listaCoberturaProjeto[2], listaCoberturaProjeto[3], listaCoberturaProjeto[4], listaCoberturaProjeto[5],
                             listaCoberturaClasse[0], listaCoberturaClasse[1], listaCoberturaClasse[2], listaCoberturaClasse[3], listaCoberturaClasse[4]
                                , listaCoberturaMetodo[0], listaCoberturaMetodo[1], listaCoberturaMetodo[2], listaCoberturaMetodo[3],
                             listaCoberturaMetodo[4], listaCoberturaMetodo[5], listaCoberturaMetodo[6]])
                        writer.writerow([commitVersion, projectName, dadosParaGravacaoRandoopX[0][1], dadosParaGravacaoRandoopY[0][1],
                                         dadosParaGravacaoRandoopX[0][0], dadosParaGravacaoRandoopY[0][0], dadosParaGravacaoRandoopX[0][2],
                                         dadosParaGravacaoRandoopY[0][2], classeTarget, dadosParaGravacaoRandoopX[1][2],
                                         dadosParaGravacaoRandoopY[1][2], dadosParaGravacaoRandoopX[1][1], dadosParaGravacaoRandoopY[1][1],
                                         nomeMetodoTarget, dadosParaGravacaoRandoopX[2][1], dadosParaGravacaoRandoopY[2][1],
                                         dadosParaGravacaoRandoopX[2][2], dadosParaGravacaoRandoopY[2][2], dadosParaGravacaoRandoopX[2][3],
                                         dadosParaGravacaoRandoopY[2][3]])
                    else:
                        writer = csv.writer(file)
                        writer.writerow(
                            [listaPartesBasicasReport[0], listaPartesBasicasReport[1], listaCoberturaProjeto[0], listaCoberturaProjeto[1]
                                , listaCoberturaProjeto[2], listaCoberturaProjeto[3], listaCoberturaProjeto[4], listaCoberturaProjeto[5],
                             listaCoberturaClasse[0], listaCoberturaClasse[1], listaCoberturaClasse[2], listaCoberturaClasse[3], listaCoberturaClasse[4]])
                        writer.writerow([commitVersion, projectName, dadosParaGravacaoRandoopX[0][1], dadosParaGravacaoRandoopY[0][1],
                                         dadosParaGravacaoRandoopX[0][0], dadosParaGravacaoRandoopY[0][0], dadosParaGravacaoRandoopX[0][2],
                                         dadosParaGravacaoRandoopY[0][2], classeTarget, dadosParaGravacaoRandoopX[1][2],
                                         dadosParaGravacaoRandoopY[1][2], dadosParaGravacaoRandoopX[1][1],
                                         dadosParaGravacaoRandoopY[1][1]])
                else:
                    writer = csv.writer(file)
                    writer.writerow(
                        [listaPartesBasicasReport[0], listaPartesBasicasReport[1], listaCoberturaProjeto[0], listaCoberturaProjeto[1],
                         listaCoberturaProjeto[2], listaCoberturaProjeto[3], listaCoberturaProjeto[4], listaCoberturaProjeto[5]])
                    writer.writerow(
                        [commitVersion, projectName, dadosParaGravacaoRandoopX[0][1], dadosParaGravacaoRandoopY[0][1],
                         dadosParaGravacaoRandoopX[0][0], dadosParaGravacaoRandoopY[0][0],
                         dadosParaGravacaoRandoopX[0][2], dadosParaGravacaoRandoopY[0][2]])
        else:
            with open("./result_cobertura.csv", 'a+') as fd:
                if (dadosParaGravacaoRandoopX[1][0] is True) & (dadosParaGravacaoRandoopY[1][0] is True):  # se possuir classe target
                    if (dadosParaGravacaoRandoopX[2][0] is True) & (dadosParaGravacaoRandoopY[2][0] is True):  # se possuir metodo target
                        writer = csv.writer(fd)
                        writer.writerow([commitVersion, projectName, dadosParaGravacaoRandoopX[0][1], dadosParaGravacaoRandoopY[0][1],
                                         dadosParaGravacaoRandoopX[0][0], dadosParaGravacaoRandoopY[0][0], dadosParaGravacaoRandoopX[0][2],
                                         dadosParaGravacaoRandoopY[0][2], classeTarget, dadosParaGravacaoRandoopX[1][2],
                                         dadosParaGravacaoRandoopY[1][2], dadosParaGravacaoRandoopX[1][1], dadosParaGravacaoRandoopY[1][1],
                                         nomeMetodoTarget, dadosParaGravacaoRandoopX[2][1], dadosParaGravacaoRandoopY[2][1],
                                         dadosParaGravacaoRandoopX[2][2], dadosParaGravacaoRandoopY[2][2], dadosParaGravacaoRandoopX[2][3],
                                         dadosParaGravacaoRandoopY[2][3]])
                    else:
                        writer = csv.writer(fd)
                        writer.writerow([commitVersion, projectName, dadosParaGravacaoRandoopX[0][1], dadosParaGravacaoRandoopY[0][1],
                                         dadosParaGravacaoRandoopX[0][0], dadosParaGravacaoRandoopY[0][0], dadosParaGravacaoRandoopX[0][2],
                                         dadosParaGravacaoRandoopY[0][2], classeTarget, dadosParaGravacaoRandoopX[1][2],
                                         dadosParaGravacaoRandoopY[1][2], dadosParaGravacaoRandoopX[1][1],
                                         dadosParaGravacaoRandoopY[1][1]])
                else:
                    writer = csv.writer(fd)
                    writer.writerow(
                        [commitVersion, projectName, dadosParaGravacaoRandoopX[0][1], dadosParaGravacaoRandoopY[0][1],
                         dadosParaGravacaoRandoopX[0][0], dadosParaGravacaoRandoopY[0][0],
                         dadosParaGravacaoRandoopX[0][2], dadosParaGravacaoRandoopY[0][2]])

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
        dadosReportProjeto = self.reportProjetoCompleto(path_suite)

        print("Gerando analise da classe target")
        dadosReportClasseTarget = self.reportClasseTarget(path_suite, listaPacoteMetodoClasse)

        print("Gerando analise do metodo target")
        # TODO Melhorar obtencao do metodo target considerando que no parametro do metodo pode vim o pacote do parametro
        if ("(" in listaPacoteMetodoClasse[0]) & (")" in listaPacoteMetodoClasse[0]):
            dadosReportMetodoTarget = self.reportMetodoTarget(path_suite, listaPacoteMetodoClasse)
        else:
            dadosReportMetodoTarget = [False]

        return [dadosReportProjeto, dadosReportClasseTarget, dadosReportMetodoTarget]

    # recupera pacote, nome da classe ou metodo target do teste
    def recuperaClassePacoteMetodo(self, pathMetodo, pathClasse):
        listaPacoteClasse = pathClasse.split(".")
        nomeClasse = listaPacoteClasse[len(listaPacoteClasse) - 1] # ultima posicao
        listaPacoteClasse.remove(nomeClasse)
        pacote = ".".join(listaPacoteClasse)
        nomeMetodo = pathMetodo[len(pathClasse) + 1:len(pathMetodo)]
        nomeMetodo = self.ajustaNomeMetodo(nomeMetodo)
        print("Metodo target: " + nomeMetodo)
        print("Classe target: " + nomeClasse)
        return [nomeMetodo, nomeClasse, pacote]

    # Ajusta nome do metodo removendo pacote do parametro dentro do metodo
    # Ex : getSchemaFromAnnotation(io.swagger.oas.annotations.media.Schema) ->  getSchemaFromAnnotation(Schema)
    def ajustaNomeMetodo(self, nomeMetodo):
        if ("(" in nomeMetodo) & (")" in nomeMetodo) & ("." in nomeMetodo):
            print("Metodo target precisa de tratamento")
            posicaoPrimeiroParentese = nomeMetodo.find("(")
            posicaoUltimoPonto = nomeMetodo.rindex(".")
            nomeMetodo = nomeMetodo[0:posicaoPrimeiroParentese + 1] + nomeMetodo[posicaoUltimoPonto + 1:len(nomeMetodo)] # contatena por exemplo getSchemaFromAnnotation( + Schema)
        return nomeMetodo

    def reportProjetoCompleto(self, path_suite):
        reportHtml = codecs.open(path_suite.suite_dir + "/report/index.html", 'r')

        soup = BeautifulSoup(reportHtml, 'html.parser')

        tagFoot = soup.find('tfoot')

        tagTr = list(tagFoot.children)[0]  # recupera a tag tr responsavel pela linha de resultados

        resultados = list(tagTr.children)

        totalClass = int((resultados[12].get_text()).replace(".", ""))
        classesCobertas = int(totalClass - int((resultados[11].get_text()).replace(".", "")))

        porcentagemCoberturaClasse = round((classesCobertas / totalClass) * 100, 2)

        totalMetodos = int((resultados[10].get_text()).replace(".", ""))
        metodosCobertos = int(totalMetodos - int((resultados[9].get_text()).replace(".", "")))

        porcentagemCoberturaMetodo = round((metodosCobertos / totalMetodos) * 100, 2)

        totalLinhas = int((resultados[8].get_text()).replace(".", ""))
        linhasCobertas = int(totalLinhas - int((resultados[7].get_text()).replace(".", "")))

        porcentagemCoberturaLinhas = round((linhasCobertas / totalLinhas) * 100, 2)

        return [porcentagemCoberturaClasse, porcentagemCoberturaMetodo, porcentagemCoberturaLinhas]

    def reportClasseTarget(self, path_suite, listaPacoteMetodoClasse):
        tagAClasseTarget = ''
        porcentagemCoberturaLinhasClasseTarget= ''
        porcentagemCoberturaMetodoClasseTarget = ''
        vaiGerarReportClasse = True

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

        if tagAClasseTarget != '':
            tagTr = list(tagAClasseTarget.parents)[1]  # recupera a tag tr responsavel pela linha de resultados

            resultadosClasseTarget = list(tagTr.children)

            totalLinhasClasseTarget = int((resultadosClasseTarget[8].get_text()).replace(".", ""))
            linhasCobertasClasseTarget = int(
                totalLinhasClasseTarget - int((resultadosClasseTarget[7].get_text()).replace(".", "")))

            porcentagemCoberturaLinhasClasseTarget = round((linhasCobertasClasseTarget / totalLinhasClasseTarget) * 100,
                                                           2)

            totalMetodosClasseTarget = int((resultadosClasseTarget[10].get_text()).replace(".", ""))
            metodosCobertosClasseTarget = int(
                totalMetodosClasseTarget - int((resultadosClasseTarget[9].get_text()).replace(".", "")))

            porcentagemCoberturaMetodoClasseTarget = round(
                (metodosCobertosClasseTarget / totalMetodosClasseTarget) * 100,
                2)
        else:
            print("Classe target nao encontrado no projeto")
            vaiGerarReportClasse = False

        # Primeira posicao da lista indica se vai ser gerado um report com analise de classe target
        return [vaiGerarReportClasse, porcentagemCoberturaLinhasClasseTarget, porcentagemCoberturaMetodoClasseTarget]

    def reportMetodoTarget(self, path_suite, listaPacoteMetodoClasse):
        porcentagemBranchMetodoTarget = ''
        porcentagemInstrucMetodoTarget = ''
        linhasCobertasMetodoTarget = ''
        tagSpanMetodoTarget = ''

        vaiGerarReportMetodo = True

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
        if tagSpanMetodoTarget != '':
            tagTr = list(tagSpanMetodoTarget.parents)[1]

            resultadosMetodoTarget = list(tagTr.children)

            totalLinhasMetodoTarget = int((resultadosMetodoTarget[8].get_text()).replace(".", ""))
            linhasCobertasMetodoTarget = int(
                totalLinhasMetodoTarget - int((resultadosMetodoTarget[7].get_text()).replace(".", "")))

            print("Gerando analise instruct metodo target")
            porcentagemInstrucMetodoTarget = (resultadosMetodoTarget[2].get_text()).replace("%", "")

            print("Gerando analise branch metodo target")
            porcentagemBranchMetodoTarget = (resultadosMetodoTarget[4].get_text()).replace("%", "")
        else:
            print("Metodo target nao encontrado na classe target")
            vaiGerarReportMetodo = False

        # Primeira posicao da lista indica se vai ser gerado um report com analise de metodo target
        return [vaiGerarReportMetodo, linhasCobertasMetodoTarget, porcentagemInstrucMetodoTarget,
                porcentagemBranchMetodoTarget]
