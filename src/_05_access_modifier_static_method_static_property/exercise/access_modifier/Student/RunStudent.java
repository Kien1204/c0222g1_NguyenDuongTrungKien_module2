package _05_access_modifier_static_method_static_property.exercise.access_modifier.Student;

public class RunStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("kiên");
        student.setClasses("co022g1");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
