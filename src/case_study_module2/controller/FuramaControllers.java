package case_study_module2.controller;

import case_study_module2.service.FacilityService;
import case_study_module2.service.impl.CustomerServiceImpl;
import case_study_module2.service.impl.EmployeeServiceImpl;
import case_study_module2.service.impl.FacilityServiceImpl;

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
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
            }

        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (true) {
            System.out.println("1.Display list employee");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.delete employee");
            System.out.println("5.Back to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    employeeService.display();
                    break;
                }
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
                    break;
            }

        }
    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (true) {
            System.out.println("1.Display list customer");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.delete customer");
            System.out.println("5.Back to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    customerService.display();
                    break;
                }
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    customerService.delete();
                    break;
            }
        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (true) {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.display list facility maintenance");
            System.out.println("5.Back to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    facilityService.display();
                    break;
                }
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:
            }

        }
    }

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (true) {
            System.out.println("1.Add new villa");
            System.out.println("2.Add new House");
            System.out.println("3.Add new Room");
            System.out.println("5.Back to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                }
                case 2:
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
            }

        }
    }
}