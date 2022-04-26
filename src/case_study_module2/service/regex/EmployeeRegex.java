package case_study_module2.service.regex;

import java.util.Scanner;

public class EmployeeRegex {
    private static Scanner scanner = new Scanner(System.in);
    private static final String BIRTH_DAY = "^(((0[1-9]|[12]\\d|3[01])/((0[13578])|(1[02])))|((0[1-9]|[12]\\d|30)/((0[2469])|11)))/((19[4-9]\\d)|200[0-3])$";

    public static String dateOfBirth() {
        String dayOfBirth;
        while (true) {
            try {
                dayOfBirth = scanner.nextLine();
                if (dayOfBirth.matches(BIRTH_DAY)) {
                    break;
                }
            }catch (NumberFormatException e ){
                System.out.println("sai format");
            }
        }
        return dayOfBirth;
    }

    public static String level () {
        boolean check = true;
        String level = "";
        int choose = 0;
        System.out.println("1. Trung cấp");
        System.out.println("2. Cao đẳng ");
        System.out.println("3. Đại học");
        System.out.println("4. Sau đại học");
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("nhập sai format");
        }
        while (check) {
            switch (choose) {
                case 1:
                    level += "Trung cấp";
                    check = false;
                    break;
                case 2:
                    level += "Cao đẳng";
                    check = false;
                    break;
                case 3:
                    level += "Đại học";
                    check = false;
                    break;
                case 4:
                    level += "Sau đại học";
                    check = false;
                    break;

                default:
                    System.out.println("mời nhập lại");
            }
        }
        return level ;
    }
    public static String position (){

        System.out.println("nhập vị trí ");
        String position = " ";
        System.out.println("1.Receptionist");
        System.out.println("2.Waiter  ");
        System.out.println("3.Supervisor");
        System.out.println("4.Manager");
        System.out.println("5.Director");
        int choose=0;
        try {
            choose = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e ){
            System.out.println("nhập sai format");
        }
        boolean check1 = true;
        while (check1) {
            switch (choose) {
                case 1:
                    position += "Receptionist";
                    check1 = false;
                    break;
                case 2:
                    position += "Waiter  ";
                    check1 = false;
                    break;
                case 3:
                    position += "Supervisor";
                    check1 = false;
                    break;
                case 4:
                    position += "Manager";
                    check1 = false;
                    break;
                case 5:
                    position += "Director";
                    check1= false;
                    break;

            }
        }
        return position;
    }
}

