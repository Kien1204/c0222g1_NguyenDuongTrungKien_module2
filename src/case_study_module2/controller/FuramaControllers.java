package case_study_module2.controller;

import java.util.Scanner;

public class FuramaControllers {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1 . Employee Management ");
            System.out.println("2 . Customer Management ");
            System.out.println("3 . Facility Management ");
            System.out.println("4 . Booking  Management ");
            System.out.println("5 . Promotion Management ");
            System.out.println("6 . Exit ");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
            }
        }
    }

    public static void displayEmployeeMenu() {
        boolean check = true;
        while (true) {
            System.out.println("1.Display list employee");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Back to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                }
            }
        }
    }
}
