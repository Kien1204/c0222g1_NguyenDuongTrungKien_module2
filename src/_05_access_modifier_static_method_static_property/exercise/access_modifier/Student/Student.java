package _05_access_modifier_static_method_static_property.exercise.access_modifier.Student;

public class Student {
    private String name ;
    private String classes;
    public Student(){
        name = "Kien";
        classes = "C0222G1";
    }
    public void setName(String name) {
        this.name = name;

    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
