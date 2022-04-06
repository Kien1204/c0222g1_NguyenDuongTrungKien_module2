package _05_access_modifier_static_method_static_property.exercise.access_modifier.Circle;

public class RunCircle {
    public static void main(String[] args) {
        Circle testCircle1 = new Circle();
        System.out.println("testCircle1 Area: " + testCircle1.getArea());

        Circle testCircle2 = new Circle();
        testCircle2.setRadius(9.0);
        System.out.println("testCircle2 Area: " + testCircle2.getArea());
    }
}
