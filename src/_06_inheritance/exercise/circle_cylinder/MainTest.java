package _06_inheritance.exercise.circle_cylinder;

public class MainTest {
    public static void main(String[] args) {
        Circle circle = new Circle(12,"red") ;
        System.out.println("diện tích của hình tròn là "+circle.getArea()+ " "+circle.toString());
        Cylinder cylinder = new Cylinder(14,"yellow",14);
        System.out.println("thể tích của hình trụ "+cylinder.getCylindricalVolume()+  " "+ cylinder.toString());
    }
}
