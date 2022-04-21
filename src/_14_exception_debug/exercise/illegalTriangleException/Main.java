package _14_exception_debug.exercise.illegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        do {
            try {
                System.out.println("Enter three side of the triangle: ");
                double side1 = Double.parseDouble(scanner.nextLine());
                double side2 = Double.parseDouble(scanner.nextLine());
                double side3 = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(side1, side2, side3);
                check = false;
            }
            catch (IllegalTriangleException ex) {
                System.err.println(ex.getMessage());
                check = true;
            }
            catch (NumberFormatException ex){
                System.err.println("lỗi nhập chữ");
                check=true;
            }

        } while (check);
    }
}
