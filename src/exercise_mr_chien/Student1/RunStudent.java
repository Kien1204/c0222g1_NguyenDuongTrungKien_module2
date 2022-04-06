package exercise_mr_chien.Student1;

import java.util.Arrays;
import java.util.Scanner;

public class RunStudent {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Student [] students = new Student [2];
        for (int i = 0; i < students.length; i++) {
            System.out.println("nhập tên ");
         String name = scanner.nextLine();
            System.out.println("nhập địa chỉ ");
         String address = scanner.nextLine();
            System.out.println("nhập tuổi ");
         int age = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập điểm");
         double point = Double.parseDouble(scanner.nextLine());
         students[i]= new Student (name, address, age , point);

        }
        System.out.println(Arrays.toString(students));
        System.out.println("nhập phần tử muốn xóa");
        int delete = scanner.nextInt();
        students[delete]= null;
        for (Student student : students) {
            if (student == null) {
                continue;
            }
            System.out.println(student.toString());
        }
    }

}
