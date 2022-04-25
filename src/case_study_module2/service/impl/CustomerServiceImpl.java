package case_study_module2.service.impl;

import case_study_module2.model.Customer;
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
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("nhập id ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập tên ");
        String name = scanner.nextLine();

        System.out.println("nhập tuổi ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập giới tính ");
        String sex = scanner.nextLine();

        System.out.println("nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();


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

        }
        System.out.println("nhập địa chỉ ");
        String address = scanner.nextLine();

        System.out.println("nhập số chứng minh :");
        String idCard = scanner.nextLine();

        System.out.println("nhập số điện thoại");
        String phoneNumber = scanner.nextLine();

        System.out.println("nhập email");
        String email = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, dateOfBirth, idCard, address, typeCustomer, phoneNumber, email);
    }

    @Override
    public void edit() {
        System.out.println("nhập vào id muốn chỉnh sửa");
        boolean check = false;
        int idEmployee = Integer.parseInt(scanner.nextLine());
        for (Customer e : customerList) {
            if (e.getId() == idEmployee) {
                check = true;
                System.out.println("nhập id ");
                e.setId(Integer.parseInt(scanner.nextLine()));

                System.out.println("nhập tên ");
                e.setName(scanner.nextLine());

                System.out.println("nhập tuổi ");
                e.setAge(Integer.parseInt(scanner.nextLine()));

                System.out.println("nhập giới tính  ");
                e.setSex(scanner.nextLine());
                System.out.println("nhập level ");

                System.out.println("nhập số chứng minh ");
                e.setIdCard(scanner.nextLine());

                System.out.println("nhập email ");
                e.setEmail(scanner.nextLine());

                System.out.println("nhập địa chỉ");
                e.setAddress(scanner.nextLine());

                break;
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("nhập id muốn xóa ");
        boolean check = false;
        int id = scanner.nextInt();
        int temp = 0;
        for (Customer e : customerList) {
            if (e.getId() == id) {
                temp = id;
                check = true;
            }
        }
        if (check) {
            System.out.println("không tìm thấy id");
        }
        customerList.remove(temp);
    }

}
