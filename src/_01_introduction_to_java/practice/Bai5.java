package _01_introduction_to_java.practice;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("28 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("month" + month + " have 31 days ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("month " + month + " have 30 day");
            default:
                System.out.println("no value ");
                break;
        }

    }
}
