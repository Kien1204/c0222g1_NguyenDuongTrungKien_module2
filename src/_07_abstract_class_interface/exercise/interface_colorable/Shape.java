package _07_abstract_class_interface.exercise.interface_colorable;

public abstract class Shape {
    private String color ;
    private  String filled ;

    public Shape(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }

}
