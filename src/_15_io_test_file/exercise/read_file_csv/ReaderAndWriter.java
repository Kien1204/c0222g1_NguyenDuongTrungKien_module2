package _15_io_test_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
    public static void writeFile(String path, String line) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write(line + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> readFile(String path) {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) !=null && !line.equals("")){
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            return listStr;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

}
