package _15_io_test_file.exercise.copy_file_text;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriter readAndWriter = new ReadAndWriter();
        List<String> str = readAndWriter.readFile("src\\_15_io_test_file\\exercise\\copy_file_text\\source_file.txt");
        for (String data : str) {
            ReadAndWriter.writeFile("src\\_15_io_test_file\\exercise\\copy_file_text\\target_file.txt", data);
        }
    }
}
