package _07_abstract_class_interface.exercise.interface_resizeable;

public class Rectangle extends Shape {
    private double width ;
    private  double length;

    public Rectangle(String color, String filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return length;
    }

    public void setHeight(double height) {
        this.length = height;
    }
    public void setArea (double width, double height){}
    public double getArea(){
        return this.length*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +
                "width=" + width +
                ", height=" + length + ", area = " + this.getArea() +
                '}';
    }

    @Override
    public void resizeable(double percent) {
       this.width= this.width+this.width*percent/100;
       this.length= this.length+this.length*percent/100;
    }
}