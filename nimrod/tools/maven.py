import os
import subprocess


TIMEOUT = 10 * 60


class Maven:

    def __init__(self, maven_home, jdk, skip_compile=False):
        self.maven_home = maven_home
        self.jdk = jdk
        self.skip_compile = skip_compile

    def _check(self):
        if not self.maven_home:
            if 'M2_HOME' in os.environ and os.environ['M2_HOME']:
                self.maven_home = os.environ['M2_HOME']
            elif 'MAVEN_HOME' in os.environ and os.environ['MAVE_HOME']:
                self.maven_home = os.environ['MAVEN_HOME']

            self._version(exit_on_error=True)

    def _version(self, exit_on_error=False):
        try:
            self._exec('-version')
        except OSError:
            print('maven not found.')
            if exit_on_error:
                raise SystemExit()

    def _exec(self, *args):
        return self._exec_mvn(None, self.jdk.get_env(), TIMEOUT, args)

    def _exec_mvn(self, cwd, env, timeout, *args):

        command = [os.path.join(self.maven_home, os.sep.join('bin', 'mvn'))]
        command = command + list(args)

        return subprocess.check_output(command, cwd=cwd, env=env,
                                       timeout=timeout)
