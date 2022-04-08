package _07_abstract_class_interface.exercise.interface_colorable;

public class Square extends Shape {
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
     private double side ;

    public Square(String color, String filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }
    @Override
    public String toString() {
        return "Square{" + super.toString()+
                "side=" + side +
                '}';
    }
}
