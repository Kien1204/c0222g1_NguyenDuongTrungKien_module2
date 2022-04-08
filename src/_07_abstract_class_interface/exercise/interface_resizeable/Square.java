package _07_abstract_class_interface.exercise.interface_resizeable;

public class Square extends Shape{
    private double squareEdge ;

    public Square(String color, String filled, double squareEdge) {
        super(color, filled);
        this.squareEdge = squareEdge;
    }

    public double getSquareEdge() {
        return squareEdge;
    }

    public void setSquareEdge(double squareEdge) {
        this.squareEdge = squareEdge;
    }
    public double getArea(){
        return this.squareEdge*this.squareEdge;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString()+
                "squareEdge=" + squareEdge +", area = " +getArea()+
                '}';
    }

    @Override
    public void resizeable(double percent) {
        this.squareEdge=this.squareEdge+this.squareEdge*percent/100;
    }
}
