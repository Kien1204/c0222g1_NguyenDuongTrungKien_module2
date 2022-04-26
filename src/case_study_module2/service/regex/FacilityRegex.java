package case_study_module2.service.regex;

import java.util.Scanner;

public class FacilityRegex {
    private static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
//    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
//    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
//    public static final String REGEX_AREA = "^[3-9]\\d|[1-9]\\d{2}$";

    public static String name() {
        String name;
        while (true) {
            name = scanner.nextLine();
            if (name.matches(REGEX_STR)) {
                break;
            } else {
                System.out.println("bạn đã nhập sai format");
            }
        }
        return name;
    }

    public static String id() {
        String id;
        while (true) {
            id = scanner.nextLine();
            if (id.matches(REGEX_ID_VILLA)) {
                break;
            } else {
                System.out.println("mã dịch vụ phải có dạng SVVL-XXXX");
            }
        }
        return id;
    }

    public static double areaUse() {
        double areaUse;
        while (true) {
            try {
                areaUse = Double.parseDouble(scanner.nextLine());
                if (areaUse > 30) {
                    break;
                } else {
                    System.out.println("diện tích phải lớn hơn 30m");
                }
            } catch (NumberFormatException e) {
                System.err.println("sai format");
            }
        }
        return areaUse;
    }

    public static double areaPool() {
        double areaPool;
        while (true) {
            try {
                areaPool = Double.parseDouble(scanner.nextLine());
                if (areaPool > 30) {
                    break;
                } else {
                    System.out.println("diện tích phải lớn hơn 30m");
                }
            } catch (NumberFormatException e) {
                System.err.println("sai format");
            }
        }
        return areaPool;
    }

    public static int price() {
        int price;
        while (true) {
            try {
                price = Integer.parseInt(scanner.nextLine());
                if (price > 0) {
                    break;
                } else {
                    System.out.println("giá phải là số dương");
                }
            } catch (NumberFormatException e) {
                System.err.println("phải là số dương : ");
            }
        }
        return price;
    }

    public static int rentalPeopleMax() {
        int rentalPeopleMax;
        while (true) {
            try {
                rentalPeopleMax = Integer.parseInt(scanner.nextLine());
                if (rentalPeopleMax > 0 && rentalPeopleMax < 20) {
                    break;
                } else {
                    System.out.println("số lượng phải lớn 0 và nhỏ hơn 20 ");
                }
            } catch (NumberFormatException e) {
                System.err.println("sai format");
            }
        }
        return rentalPeopleMax;
    }

    public static int floor() {
        int floor;
        while (true) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("số tầng phải là số dương");
                }
            } catch (NumberFormatException e) {
                System.out.println("sai format");
            }
        }
        return floor;
    }

    public static String styleRental() {
        String styleRental;
        while (true) {
            styleRental = scanner.nextLine();
            if (styleRental.matches(REGEX_STR)) {
                break;
            } else {
                System.out.println("bạn đã nhập sai format");
            }
        }
        return styleRental;
    }

    public static String standardVilla() {
        String standardVilla;
        while (true) {
            standardVilla = scanner.nextLine();
            if (standardVilla.matches(REGEX_STR)) {
                break;
            } else {
                System.out.println("bạn đã nhập sai format");
            }
        }
        return standardVilla;
    }

    public static String freeService() {
        String freeService;
        while (true) {
            freeService = scanner.nextLine();
            if (freeService.matches(REGEX_STR)) {
                break;
            } else {
                System.out.println("bạn đã nhập sai format");
            }
        }
        return freeService;
    }
}
