package _06_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private double height ;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getCylindricalVolume(){
        return Math.PI* Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +  " " +super.toString()+
                '}';
    }
}
