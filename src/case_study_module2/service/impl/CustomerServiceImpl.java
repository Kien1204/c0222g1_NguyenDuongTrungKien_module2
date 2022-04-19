package case_study_module2.service.impl;

import _10_stack_queue.exercise.demerging.Customer;
import case_study_module2.model.Employee;
import case_study_module2.service.CustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
    }

    @Override
    public void addNew() {
        System.out.println("nhập id ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập tên ");
        String name = scanner.nextLine();

        System.out.println("nhập tuổi ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập địa chỉ ");
        String address = scanner.nextLine();


        System.out.println("nhập loại khách hàng ");
        String typeCustomer = " ";
        boolean check = true;
        System.out.println("1.Diamond");
        System.out.println("2.Platinum");
        System.out.println("3.Gold");
        System.out.println("4.Silver");
        int choose = scanner.nextInt();
        while (check) {
            switch (choose) {
                case 1:
                    typeCustomer += "Diamond";
                    check = false;
                    break;
                case 2:
                    typeCustomer += "Platinum";
                    check = false;
                    break;
                case 3:
                    typeCustomer += "Gold";
                    check = false;
                    break;
                case 4:
                    typeCustomer += "Silver";
                    check = false;
                    break;
                default:
                    System.out.println("mời nhập lại");
            }

            System.out.println("nhập giới tính ");
            String sex = scanner.nextLine();
//    Customer customer = new Customer(id,name,age,address,sex,typeCustomer);
        }

    }
        @Override
        public void edit () {

        }

        @Override
        public void delete () {
//
        }
    }
