package _04_class_object.exercise.class_fan;

public class Fan {
    private static final int SLOW =1 , MEDIUM= 2,FAST= 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    @Override
    public String toString() {
        if (this.on) {
            return "fan is on" +"\t" + this.speed +"\t " + this.color +"\t " + this.radius ;
        } else {
            return "fan is off"+"\t" + this.color +"\t " + this.radius;
        }
    }
}




