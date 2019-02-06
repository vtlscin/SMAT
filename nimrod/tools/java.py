import os
import subprocess

TIMEOUT = 10 * 60


class Java:

    def __init__(self, java_home=None):
        self.java_home = java_home
        self._javac = None
        self._java = None

        self._check()

    def _check(self):
        if not self.java_home:
            if 'JAVA_HOME' in os.environ and os.environ['JAVA_HOME']:
                self.java_home = os.environ['JAVA_HOME']
            else:
                print('JAVA_HOME undefined.')
                raise SystemExit()

        self._version_javac(exit_on_error=True)
        self._version_java(exit_on_error=True)

    @property
    def javac(self):
        return os.path.join(self.java_home, os.sep.join(['bin', 'javac']))

    @property
    def java(self):
        return os.path.join(self.java_home, os.sep.join(['jre', 'bin', 'java']))

    def _version_javac(self, exit_on_error=False):
        try:
            self.simple_exec_javac('-version')
        except OSError:
            print('javac not found.')
            if exit_on_error:
                raise SystemExit()

    def _version_java(self, exit_on_error=False):
        try:
            self.simple_exec_java('-version')
        except OSError:
            print('java not found.')
            if exit_on_error:
                raise SystemExit()

    def simple_exec_java(self, *args):
        return self.exec_java(None, self.get_env(), TIMEOUT, *args)

    def exec_java(self, cwd, env, timeout, *args):
        return self._exec(self.java, cwd, env, timeout, *args)

    def simple_exec_javac(self, *args):
        return self.exec_javac(None, None, self.get_env(), TIMEOUT, *args)

    def exec_javac(self, java_file, cwd, env, timeout, *args):
        args = list(args)
        if java_file:
            args.append(java_file)

        return self._exec(self.javac, cwd, env, timeout, *args)

    @staticmethod
    def _exec(program, cwd, env, timeout, *args):
        try:
            command = [program] + list(args)

            return subprocess.check_output(command, cwd=cwd, env=env,
                                           timeout=timeout)
        except subprocess.CalledProcessError:
            print('{0}: call process error with arguments {1}.'.format(
                program, args))
        except subprocess.TimeoutExpired:
            print('{0}: timeout with arguments {1}.'.format(program, args))

    def get_env(self, variables=None):
        env = os.environ.copy()
        env['JAVA_HOME'] = self.java_home

        if variables:
            for key in variables.keys():
                env[key] = variables[key]
