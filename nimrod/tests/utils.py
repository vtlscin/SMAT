import os
import json

PATH = os.path.dirname(os.path.abspath(__file__))


def get_config():
    with open(os.path.join(PATH, os.sep.join(['env-config.json'])), 'r') as j:
        j = json.loads(j.read())

    return j
