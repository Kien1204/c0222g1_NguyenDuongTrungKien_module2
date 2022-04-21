package _15_io_test_file.exercise.copy_file_text;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriter {
    public static void writeFile(String path, String line) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write(line + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String > readFile(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;
        List<String  > listStr = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) !=null && !line.equals("")){
                String[] arrStr = line.split(",");
                listStr.add(line);
            }
            return listStr;
        } catch(IOException e){
            System.err.println("loi");
        }
         return null;
    }
}


