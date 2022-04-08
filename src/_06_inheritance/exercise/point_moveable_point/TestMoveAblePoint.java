package _06_inheritance.exercise.point_moveable_point;

public class TestMoveAblePoint {
    public static void main(String[] args) {
        System.out.println("Mảng x, y");
        Point point = new Point(3,4);
        System.out.println(point.toString());
        System.out.println("Mảng  speed");

        MoveAblePoint moveablePoint = new MoveAblePoint(20,10,50,20);
        System.out.println(moveablePoint.toString() + "\n" + moveablePoint.move());
    }
}
