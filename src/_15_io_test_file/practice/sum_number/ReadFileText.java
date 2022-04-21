package _15_io_test_file.practice.sum_number;

import java.util.Scanner;

public class ReadFileText {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFile readfileEx = new ReadFile();
        readfileEx.readFileText(path);
    }
}
