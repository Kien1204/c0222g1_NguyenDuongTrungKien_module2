package _05_access_modifier_static_method_static_property.practice;

public class Test {
    void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

    public static void main(String[] args) {
        Test o = new Test();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}
