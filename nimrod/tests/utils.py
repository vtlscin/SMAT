import os
import json

PATH = os.path.dirname(os.path.abspath(__file__))


def get_config():
    with open(os.path.join(PATH, os.sep.join(['env-config.json'])), 'r') as j:
        j = json.loads(j.read())

    return j


def path_calculator_project():
    return os.path.join(PATH, 'example')


def path_calculator_package():
    return os.path.join(path_calculator_project(), 'src', 'main', 'java', 'br',
                        'ufal', 'ic', 'easy')


def path_calculator_file():
    return os.path.join(path_calculator_package(), 'Calculator.java')