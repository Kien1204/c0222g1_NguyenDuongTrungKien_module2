package _07_abstract_class_interface.exercise.interface_resizeable;

public  class Circle extends Shape  {
    private  double radius ;

    public Circle(String color, String filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setArea(double radius){}
    public double getArea(){
        return Math.PI* Math.pow(this.radius,2);
    }
    @Override
    public String toString() {
        return "Circle{" +super.toString()+
                "radius=" + radius +", diện tích "+ getArea()+
                '}';
    }
    @Override
    public void resizeable(double percent) {
     this.radius  = this.radius+this.radius* percent/100;
    }
}
