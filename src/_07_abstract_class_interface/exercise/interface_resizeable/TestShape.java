package _07_abstract_class_interface.exercise.interface_resizeable;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red","small",10);
        shapes[1] = new Rectangle("yellow","small",30,30);
        shapes[2] = new Square("red","small",20);
        for (Shape item: shapes) {
            System.out.println(item);
        }
        System.out.println("kích thước sau khi thay đổi : ");
        for (Shape item: shapes) {
            item.resizeable(50);
            System.out.println(item);
        }
    }
}
