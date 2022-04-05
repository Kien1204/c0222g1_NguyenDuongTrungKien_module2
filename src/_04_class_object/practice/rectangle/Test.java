package _04_class_object.practice.rectangle;

import _04_class_object.practice.rectangle.ClassRectangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        ClassRectangle rectangle = new ClassRectangle(width,height);
        System.out.println(rectangle.getArea());
    }
}
