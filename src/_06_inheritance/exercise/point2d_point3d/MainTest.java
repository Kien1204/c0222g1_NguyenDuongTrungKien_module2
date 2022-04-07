package _06_inheritance.exercise.point2d_point3d;


import javafx.geometry.Point3D;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10,20);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(30,40,50);
        System.out.println(point3D.toString());
    }
}
