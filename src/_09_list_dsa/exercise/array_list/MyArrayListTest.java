package _09_list_dsa.exercise.array_list;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Tôi");
        myArrayList.add("có ");
        myArrayList.add("thông minh");
        System.out.println(Arrays.toString(myArrayList.getElements()));
        System.out.println(myArrayList.indexOf("có "));
        myArrayList.remove(1);
        myArrayList.add("rất", 1);
        System.out.println(Arrays.toString(myArrayList.getElements()));


        MyArrayList<String> clone = myArrayList.clone();
        System.out.println(clone.contains("Tôi"));
        System.out.println(clone.contains("không"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());

        
        clone.clear();
        System.out.println(clone.size());
        System.out.println(Arrays.toString(clone.getElements()));
    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
