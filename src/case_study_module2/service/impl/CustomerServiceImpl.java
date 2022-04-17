package case_study_module2.service.impl;

import _10_stack_queue.exercise.demerging.Customer;
import case_study_module2.model.Employee;
import case_study_module2.service.CustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList=new LinkedList<>();
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
        String typeCustomer  = scanner.nextLine();


        System.out.println("nhập giới tính ");
        String sex = scanner.nextLine();
//    Customer customer = new Customer(id,name,age,address,typeCustomer,sex);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
