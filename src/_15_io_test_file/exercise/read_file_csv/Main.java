package _15_io_test_file.exercise.read_file_csv;

import _15_io_test_file.exercise.copy_file_text.ReadAndWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<CountryInformation> countryInformationsList = new ArrayList<>();
        List<String[]> listStr = ReaderAndWriter.readFile("src\\_15_io_test_file\\exercise\\read_file_csv\\country_file.csv");

        CountryInformation countryInformation ;
        for (String[] data : listStr) {
            countryInformation = new CountryInformation(Integer.parseInt(data[0]), data[1], data[2]);
            countryInformationsList.add(countryInformation);
        }
        for (CountryInformation item : countryInformationsList) {
            System.out.println(item.toString());
        }
    }

}
