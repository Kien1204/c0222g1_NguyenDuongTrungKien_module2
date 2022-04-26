package case_study_module2.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;
    private String email;

    public Employee() {
    }

    public Employee(int id,
                    String name,
                    int age,
                    String sex,
                    String dateOfBirth,
                    String idCard,
                    String address,
                    String level,
                    String position,
                    int salary,
                    String email) {
        super(id, name, age, sex, dateOfBirth, idCard, address);
        this.level = level;
        this.position = position;
        this.salary = salary;
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
