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

        System.out.println("nhập giới tính");
        String sex =scanner.nextLine() ;

        System.out.println("nhập level ");

        String level = "";
        System.out.println("1. Trung cấp");
        System.out.println("2. Cao đẳng ");
        System.out.println("3. Đại học");
        System.out.println("4. Sau đại học");


        int choose = Integer.parseInt(scanner.nextLine());
        boolean check = true;

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

        System.out.println("nhập vị trí ");
        String position = " ";
        System.out.println("1.Receptionist");
        System.out.println("2.Waiter  ");
        System.out.println("3.Supervisor");
        System.out.println("4.Manager");
        System.out.println("5.Director");

        int choose1 = Integer.parseInt(scanner.nextLine());
        boolean check1 = true;
        while (check1) {
            switch (choose1) {
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

        System.out.println("nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập chứng minh ");
        String idCard = scanner.nextLine();

        System.out.println("nhập email ");
        String email = scanner.nextLine();

        System.out.println("nhập địa chỉ ");
        String address = scanner.nextLine();


        Employee employee = new Employee(id,
                                        name,
                                        age,
                                        sex,
                                        level,
                                        position,
                                        salary,
                                        idCard,
                                        email,
                                        address);
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

                System.out.println("nhập địa chỉ");
                e.setAddress(scanner.nextLine());
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
