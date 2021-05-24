import re
import os


class Report_Analysis:

    def start_analysis(self, randoop_original, randoop_modified):
        self.suites_comparison(randoop_original[0][2], randoop_modified[0][2])
        right_path_index_original = len(randoop_original) - 1
        right_path_index_modified = len(randoop_modified) - 1
        self.suites_comparison(randoop_original[right_path_index_original][2], randoop_modified[right_path_index_modified][2])

    def checking_suites_and_reports(self, path_suite_original, path_suite_modified):
        if os.path.isdir(path_suite_original) and os.path.isdir(path_suite_modified):
            if self.all_reports():
                self.suites_comparison(path_suite_original, path_suite_modified)
            else:
                print(
                    "It wasn't possible to compare the test suites because there are missing reports in paths: " + str(
                        path_suite_original) + " or " + str(path_suite_modified))
        else:
            print("It wasn't possible to make analysis because there are invalid path suites")

    def all_reports(self):
        return os.path.isfile(path_suite_original + "/methods_report.csv") and os.path.isfile(path_suite_modified + "/methods_report.csv") \
               and os.path.isfile(path_suite_original + "/objects_report.csv") and os.path.isfile(path_suite_modified + "/objects_report.csv")

    def suites_comparison(self, path_suite_original, path_suite_modified):
        methods = self.methods_report_comparison(path_suite_original, path_suite_modified)
        objects = self.objects_report_comparison(path_suite_original, path_suite_modified)

        if len(methods) == 0 or len(objects) == 0:
            print("It wasn't possible to compare the suites " + str(path_suite_original) + " and " + str(
                path_suite_modified))
        else:
            self.write_comparison(path_suite_original, path_suite_modified, methods, objects)

    def methods_report_comparison(self, path_suite_original, path_suite_modified):
        methods_data = {} # A dictionary in which the method name is the key and the value returned is a list with
        # the number of times that the method was called for original randoop and randoop--

        methods_data = self.methods_report_analysis(methods_data, path_suite_original + "/methods_report.csv", True)
        methods_data = self.methods_report_analysis(methods_data, path_suite_modified + "/methods_report.csv", False)

        return methods_data

    def methods_report_analysis(self, methods_data, report_path, randoop_original_report):
        try:
            methods_report_file = open(report_path)
            methods_report = methods_report_file.read()
            methods_report_file.close()

            lines = methods_report.split("\n")
            for line in lines[1:-1]:  # Exclude the first one because contains the headers and the last one because it is a empty line
                cells = re.split("(?<=\"),", line)
                if randoop_original_report:
                    method_map = {cells[0]: [cells[1], 0]}
                    methods_data.update(method_map)
                elif cells[0] in methods_data: # If the method signature is already in the dictionary, just change the value in the list
                    methods_data.get(cells[0])[1] = cells[1]
                else:
                    method_map = {cells[0]: [0, cells[1]]}
                    methods_data.update(method_map)

            return methods_data
        except:
            print("Error on methods_report.csv in " + str(report_path))
            return {}

    def objects_report_comparison(self, path_suite_original, path_suite_modified):
        objects_data = {}  # A dictionary the class of the object is the key and the value returned is a list with
        # the number of times that a objects from the class were created and how many of them are different from each
        # other, in that order, from randoop and randoop--

        objects_data = self.objects_report_analysis(objects_data, path_suite_original + "/objects_report.csv", True)
        objects_data = self.objects_report_analysis(objects_data, path_suite_modified + "/objects_report.csv", False)

        return objects_data

    def objects_report_analysis(self, objects_data, report_path, randoop_original_report):
        try:
            objects_report_file = open(report_path)
            objects_report = objects_report_file.read()
            objects_report_file.close()

            lines = objects_report.split("\n")
            for line in lines[1:-1]: # Exclude the first one because contains the headers and the last one because it is a empty line
                cells = line.split(",")
                if randoop_original_report:
                    object_map = {cells[0]: [cells[1], 0, cells[2], 0]}
                    objects_data.update(object_map)
                elif cells[0] in objects_data: # If the class is already in the dictionary, just change the value in the list
                    objects_data.get(cells[0])[1] = cells[1]
                    objects_data.get(cells[0])[3] = cells[2]
                else:
                    object_map = {cells[0]: [0, cells[1], 0, cells[2]]}
                    objects_data.update(object_map)

            return objects_data
        except:
            print("Error on objects_report.csv in " + str(report_path))
            return {}

    def write_comparison(self, path_suite_original, path_suite_modified, methods, objects):
        suites_path = path_suite_original[:path_suite_original.rfind("/")]  # Get the directory where the test suites are
        reports_path = suites_path + "/reports"

        if os.path.isdir(reports_path) is False:
            os.mkdir(reports_path)

        suite_name_original = path_suite_original[path_suite_original.rfind("/") + 1:]
        suite_name_modified = path_suite_modified[path_suite_modified.rfind("/") + 1:]

        methods_report_name = reports_path + "/methods_report_" + suite_name_original + "_" + suite_name_modified + ".csv"
        methods_report_headers = "Methods called,Number of times(Original),Number of times(Modified),Modified - Original,Percentage(Gain/Loss)\n"

        self.csv_report(methods_report_name, methods_report_headers, methods, False)

        objects_report_name = reports_path + "/objects_report_" + suite_name_original + "_" + suite_name_modified + ".csv"
        objects_report_headers = "Classes of objects created,Number of objects created(Original),Number of objects created(Modified),Modified - Original,Percentage(Gain/Loss),Number of unique objects manipulated(Original),Number of unique objects manipulated(Modified),Modified - Original,Percentage(Gain/Loss)\n"

        self.csv_report(objects_report_name, objects_report_headers, objects, True)

        print("The analysis of suites " + suite_name_original + " and " + suite_name_modified + " was done")

    def csv_report(self, path_csv, headers, data, is_object_report):
        with open(path_csv,"w") as output_file:
            output_file.write(headers)

            for key in data:
                text = key + "," + self.get_data(int(data.get(key)[0]), int(data.get(key)[1]))

                if is_object_report:
                    text += "," + self.get_data(int(data.get(key)[2]), int(data.get(key)[3])) + "\n"
                else:
                    text += "\n"

                output_file.write(text)

            output_file.close()

    def get_data(self, number_original, number_modified):
        sub = number_modified - number_original

        if number_original == 0:
            relative = "INF"
        elif number_modified == 0:
            relative = "-INF"
        else:
            relative = (sub / number_original) * 100
            relative = str(round(relative, 2)).replace(".", ",")

        return str(number_original) + "," + str(number_modified) + "," + str(
            sub) + "," + "\"" + relative + "\"%"
