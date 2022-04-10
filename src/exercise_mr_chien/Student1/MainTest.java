package exercise_mr_chien.Student1;
import _02_loop.practice.Menu;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class MainTest {
    public static Person[] people = new Person[10];
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        people[0] = new Student("Kien", 18, true, 8);
        people[1] = new Student("Khanh", 19, true, 9);
        people[2] = new Teacher("long ", 20, false, 10000000);
        people[3] = new Teacher("Duy", 21, true, 1000000);

        while (true) {
            System.out.println("Choose one : ");
            System.out.println("1. Display List ");
            System.out.println("2. Add Student ");
            System.out.println("3. Add Teacher");
            System.out.println("4. Delete Student ");
            System.out.println("5. Delete Teacher");
            System.out.println("6. Show list of Student ");
            System.out.println("7. Show list of Teacher");
            System.out.println("8. Exit");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    display();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addTeacher();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    deleteTeacher();
                    break;
                case 6:
                    studentList();
                    break;
                case 7:
                    teacherList();
                    break;
                case 8:
                    System.exit(8);
            }
        }
    }

    public static void display() {
        for (int i = 0; i < 10; i++) {
            if (people[i] != null) {
                System.out.println(people[i]);
            }
        }
    }


    public static void addStudent() {
        System.out.println("Enter student's name: ");
        String name = input.nextLine();
        System.out.println("Enter student's age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("1: Man      2. Woman");
        boolean gender = false;
        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            gender = true;
        }
        System.out.println("Enter student's point: ");
        int point = Integer.parseInt(input.nextLine());
        int num = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                num = i;
                break;
            }
        }
        people[num] = new Student(name, age, gender, point);
        display();
    }
    
    public static void addTeacher() {
        System.out.println("Enter teacher's name: ");
        String name = input.nextLine();
        System.out.println("Enter teacher 's age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Enter teacher's salary: ");
        int salary = Integer.parseInt(input.nextLine());
        System.out.println("1: Man      2. Woman");
        boolean gender = false;
        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            gender = true;
        }
        int num = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                num = i;
                break;
            }
        }
        people[num] = new Teacher(name, age, gender, salary);
        display();
    }

    public static void deleteStudent() {
        System.out.println("Enter the name that you want to delete: ");
        String name = input.nextLine();
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                break;
            } else if (name.equals(people[i].getName()) && people[i] instanceof Student) {
                for (int j = i; j < people.length - 1; j++) {
                    people[j] = people[j + 1];
                }
            }
        }
        display();
    }

    public static void deleteTeacher(){
        System.out.println("Enter the name that you want to delete: ");
        String name = input.nextLine();
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                break;
            } else if (name.equals(people[i].getName()) && people[i] instanceof Teacher) {
                for (int j = i; j < people.length - 1; j++) {
                    people[j] = people[j + 1];
                }
            }
        }
        display();
    }
    public static void studentList() {
        for (Person item : people) {
            if (item instanceof Student) {
                Student student = (Student) item;
                System.out.println(student.toString());
            }
        }

    }
    public static void teacherList() {
        for (Person item : people) {
            if (item instanceof Teacher) {
                Teacher teacher = (Teacher) item;
                System.out.println(teacher.toString());
            }
        }

    }
}

