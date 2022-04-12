package _07_abstract_class_interface.exercise.interface_colorable;

import java.util.Arrays;

public class ShapeTest {
    public static void main(String[] args) {
        Shape [] shapes = new  Shape[2];
        shapes[0]=new Circle ("red","small",15);
        shapes[1]=new Square("yellow","big",20);
        for (Shape item: shapes) {
            System.out.println(item);
            if (item instanceof Colorable ){
                Square square = (Square) item ;
                square.howToColor();
            }
        }

    }
}
