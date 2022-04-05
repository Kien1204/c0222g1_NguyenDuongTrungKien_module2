package _04_class_object.exercise.class_fan;

public class RunFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
