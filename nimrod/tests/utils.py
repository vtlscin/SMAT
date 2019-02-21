import os
import json
import shutil

PATH = os.path.dirname(os.path.abspath(__file__))


def get_config():
    with open(os.path.join(PATH, os.sep.join(['env-config.json'])), 'r') as j:
        j = json.loads(j.read())

    return j


def calculator_project_dir():
    return os.path.join(PATH, 'example')


def calculator_package():
    return 'br.ufal.ic.easy'


def calculator_package_dir():
    return os.path.join(calculator_project_dir(), 'src', 'main', 'java', 'br',
                        'ufal', 'ic', 'easy')


def calculator_java_file():
    return os.path.join(calculator_package_dir(), 'Calculator.java')


def calculator_target_dir():
    return os.path.join(calculator_project_dir(), 'target')


def calculator_clean_project():
    target_dir = calculator_target_dir()

    if os.path.exists(target_dir):
        shutil.rmtree(target_dir)
