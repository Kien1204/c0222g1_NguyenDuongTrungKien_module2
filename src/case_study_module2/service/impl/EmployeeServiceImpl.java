package case_study_module2.service.impl;

import case_study_module2.model.Employee;
import case_study_module2.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
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

        System.out.println("nhập địa chỉ ");
        String address = scanner.nextLine();


        System.out.println("nhập chứng minh ");
        String idCard = scanner.nextLine();

        System.out.println("nhập email ");
        String email = scanner.nextLine();

        System.out.println("nhập level ");
        String level = scanner.nextLine();

        System.out.println("nhập vị trí ");
        String position = scanner.nextLine();

        System.out.println("nhập lương ");
        int salary = scanner.nextInt();

        System.out.println("nhập giới tính ");
        String sex = scanner.nextLine();

        Employee employee = new Employee(id, name, age, address, sex, level, position, salary, idCard, email);
        employeeList.add(employee);
    }


    @Override
    public void edit() {
        boolean check = false;
        int idEmployee = scanner.nextInt();
        for (Employee e : employeeList) {
            if (e.getId() == idEmployee) {
                check = true;
                System.out.println("nhập id ");
                e.setId(Integer.parseInt(scanner.nextLine()));

                System.out.println("nhập tên ");
                e.setName(scanner.nextLine());

                System.out.println("nhập tuổi ");
                e.setAge(Integer.parseInt(scanner.nextLine()));

                System.out.println("nhập địa chỉ ");
                e.setAddress(scanner.nextLine());

                System.out.println("nhập giới tính  ");
                e.setSex(scanner.nextLine());

                System.out.println("nhập level ");
                e.setLevel(scanner.nextLine());

                System.out.println("nhập vị trí ");
                e.setPosition(scanner.nextLine());

                System.out.println("nhập lương ");
                e.setSalary(Integer.parseInt(scanner.nextLine()));

                System.out.println("nhập số chứng minh ");
                e.setIdCard(scanner.nextLine());

                System.out.println("nhập email ");
                e.setEmail(scanner.nextLine());
            }
        }

    }

    @Override
    public void delete() {
        System.out.println("nhập id muốn xóa ");
        boolean check = false;
        int id = scanner.nextInt();
        int temp = 0;
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                temp = id;
                check = true;
            }
        }
        if (check) {
            System.out.println("không tìm thấy id");
        }
        employeeList.remove(temp);
    }
}
