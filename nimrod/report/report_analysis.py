import re
import os


class Report_Analysis:

    def __init__(self, randoop_original, randoop_modified):
        self.randoop_original = randoop_original
        self.randoop_modified = randoop_modified

    def start_analysis(self):
        left_randoop_original = self.randoop_original[0][2]
        left_randoop_modified = self.randoop_modified[0][2]

        if os.path.isdir(left_randoop_original) and os.path.isdir(left_randoop_modified):
            self.suites_comparison(left_randoop_original, left_randoop_modified)
            try:
                right_randoop_original = self.randoop_original[4][2]
                right_randoop_modified = self.randoop_modified[4][2]
                self.suites_comparison(right_randoop_original, right_randoop_modified)
            except:
                print("It wasn't possible to compare the test suites for the commit: " + str(self.randoop_original[1][4]))
        else:
            print("It wasn't possible to compare the test suites for commits: " + str(self.randoop_original[0][4]) + " and " + str(self.randoop_original[1][4]))

    def suites_comparison(self, path_suite_original, path_suite_modified):
        methods = self.methods_report_comparison(path_suite_original, path_suite_modified)
        objects = self.objects_report_comparison(path_suite_original, path_suite_modified)

        if len(methods) == 0 or len(objects) == 0:
            print("It wasn't possible to compare the suites " + str(path_suite_original) + " and " + str(path_suite_modified))
        else:
            self.write_comparison(path_suite_original, path_suite_modified, methods, objects)

    def methods_report_comparison(self, path_suite_original, path_suite_modified):
        methods_data = {}  # A dictionary in which the method name is the key and the value returned is a list with
        # the number of times that the method was called for original randoop and randoop--

        try:
            methods_report_file = open(path_suite_original + "/methods_report.csv")
            methods_report = methods_report_file.read()
            methods_report_file.close()

            lines = methods_report.split("\n")
            for line in lines[1:-1]:  # Exclude the first one because contains the headers and the last one because it is a empty line
                cells = re.split("(?<=\"),", line)
                method_map = {cells[0]: [cells[1], 0]}
                methods_data.update(method_map)
        except:
            print("Error on methods_report.csv in " + str(path_suite_original))
            return {}

        try:
            methods_report_file = open(path_suite_modified + "/methods_report.csv")
            methods_report = methods_report_file.read()
            methods_report_file.close()

            lines = methods_report.split("\n")
            for line in lines[1:-1]:  # Exclude the first one because contains the headers and the last one because it is a empty line
                cells = re.split("(?<=\"),", line)
                if cells[0] in methods_data:  # If the method signature is already in the dictionary, just change the value in the list
                    methods_data.get(cells[0])[1] = cells[1]
                else:
                    method_map = {cells[0]: [0, cells[1]]}
                    methods_data.update(method_map)
        except:
            print("Error on methods_report.csv in " + str(path_suite_modified))
            return {}

        return methods_data

    def objects_report_comparison(self, path_suite_original, path_suite_modified):
        objects_data = {}  # A dictionary the class of the object is the key and the value returned is a list with
        # the number of times that a objects from the class were created and how many of them are different from each
        # other, in that order, from randoop and randoop--

        try:
            objects_report_file = open(path_suite_original + "/objects_report.csv")
            objects_report = objects_report_file.read()
            objects_report_file.close()

            lines = objects_report.split("\n")
            for line in lines[1:-1]:  # Exclude the first one because contains the headers and the last one because it is a empty line
                cells = line.split(",")
                object_map = {cells[0]: [cells[1], cells[2], 0, 0]}
                objects_data.update(object_map)
        except:
            print("Error on objects_report.csv in " + str(path_suite_original))
            return {}

        try:
            objects_report_file = open(path_suite_modified + "/objects_report.csv")
            objects_report = objects_report_file.read()
            objects_report_file.close()

            lines = objects_report.split("\n")
            for line in lines[1:-1]: # Exclude the first one because contains the headers and the last one because it is a empty line
                cells = line.split(",")
                if cells[0] in objects_data: # If the class is already in the dictionary, just change the value in the list
                    objects_data.get(cells[0])[2] = cells[1]
                    objects_data.get(cells[0])[3] = cells[2]
                else:
                    object_map = {cells[0]: [0, 0, cells[1], cells[2]]}
                    objects_data.update(object_map)
        except:
            print("Error on methods_report.csv in " + str(path_suite_modified))
            return {}

        return objects_data

    def write_comparison(self, path_suite_original, path_suite_modified, methods, objects):
        suites_path = path_suite_original[:path_suite_original.rfind("/")]  # Get the directory where the test suites are
        reports_path = suites_path + "/reports"

        if os.path.isdir(reports_path) is False:
            os.mkdir(reports_path)

        suite_name_original = path_suite_original[path_suite_original.rfind("/") + 1:]
        suite_name_modified = path_suite_modified[path_suite_modified.rfind("/") + 1:]

        with open(reports_path + "/methods_report_" + suite_name_original + "_" + suite_name_modified + ".csv", "w") as output_file:
            headers = "Methods called,Number of times(Original),Number of times(Modified),Modified - Original,Percentage(Gain/Loss),\n"
            output_file.write(headers)
            for key in methods:
                number_original = int(methods.get(key)[0])
                number_modified = int(methods.get(key)[1])
                sub = number_modified - number_original

                if number_original == 0:
                    relative = "INF"
                elif number_modified == 0:
                    relative = "-INF"
                else:
                    relative = (sub / number_original) * 100
                    relative = str(round(relative, 2)).replace(".", ",")

                text = key + "," + str(number_original) + "," + str(number_modified) + "," + str(sub) + "," + "\"" + relative + "\"%" + "\n"
                output_file.write(text)

            output_file.close()

        with open(reports_path + "/objects_report_" + suite_name_original + "_" + suite_name_modified + ".csv", "w") as output_file:
            headers = "Classes of objects created,Number of objects created(Original),Number of objects created(Modified),Modified - Original,Percentage(Gain/Loss),Number of unique objects manipulated(Original),Number of unique objects manipulated(Modified),Modified - Original,Percentage(Gain/Loss),\n"
            output_file.write(headers)
            for key in objects:
                number_original = int(objects.get(key)[0])
                number_original_unique = int(objects.get(key)[1])
                number_modified = int(objects.get(key)[2])
                number_modified_unique = int(objects.get(key)[3])
                sub = number_modified - number_original
                sub_unique = number_modified_unique - number_original_unique

                if number_original == 0:
                    relative = "INF"
                    relative_unique = "INF"
                elif number_modified == 0:
                    relative = "-INF"
                    relative_unique = "-INF"
                else:
                    relative = (sub / number_original) * 100
                    relative = str(round(relative, 2)).replace(".", ",")
                    relative_unique = (sub_unique / number_original_unique) * 100
                    relative_unique = str(round(relative_unique, 2)).replace(".", ",")

                text = key + "," + str(number_original) + "," + str(number_modified) + "," + str(sub) + "," + "\"" + relative + "\"%" + "," + str(number_original_unique) + "," + str(number_modified_unique) + "," + str(sub_unique) + "," + "\"" + relative_unique + "\"%" + "\n"
                output_file.write(text)

            output_file.close()

        print("The analysis of suites " + suite_name_original + " and " + suite_name_modified + " was done")