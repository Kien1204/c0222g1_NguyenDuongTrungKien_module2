package _07_abstract_class_interface.exercise.interface_resizeable;

public abstract  class Shape implements Resizeable {
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

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }

    @Override
    public void resizeable(double percent) {
    }
}
