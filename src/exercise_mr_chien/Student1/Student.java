package exercise_mr_chien.Student1;

public class Student extends Person{
    private double point;
    private String address;

    public Student(String name, int age, boolean gender, double point) {
        super(name, age, gender);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "point=" + point +
                ", address='" + address + '\'' +
                '}';
    }
}


