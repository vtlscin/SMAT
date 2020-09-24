# SMAT: <i>Identifying Semantic Merge Conflicts Via Automated Behavior Change Detection</i>

This project aims to detect semantic conflicts by generating and running test suites on merge scenarios.

## Getting Started
<ul>
  <li> Clone the project locally using the command on your prompt: <i>git clone https://github.com/leusonmario/SMAT</i>
  <li> After cloning, you must rename the configuration file <a href="https://github.com/leusonmario/SMAT/blob/master/nimrod/tests/env-config.template.json" target="_blank"><b>env-config.template.json</b></a> for <b>env-config.json</b>, and set up the required information for <b>java_home</b>. You must inform the location that Java was installed on your project. In case this environment variable is already configured, you don't need to inform this information again.
  <li> Next, you must inform the path of the file with the list of merge scenarios to be analyzed for the field <b>path_hash_csv</b>.
  <li> Our scripts require Python 3.6.x. In case you are running the scripts on a Linux terminal, you can just call the semantic_study.py file (<b>python3 semantic_study.py</b>). As a result, the file <b>semantic_conflict_results.csv</b> and the folder <b>output-test-dest</b> grouping the generated test suites will be created.
</ul>
