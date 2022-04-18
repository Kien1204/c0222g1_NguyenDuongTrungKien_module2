package test;

import _11_java_collection_framework.practice.practice_comparable_comparator.Main;

import java.awt.*;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
//        Stack <Integer> stack = new Stack<>();
//        int [] array = {1,2,3,4,5};
//        for (int i = 0; i <array.length ; i++) {
//            array[i] = stack.push(array[i]);
//
//        }
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=stack.pop();
//        }
//        System.out.println(Arrays.toString(array));
//
//        Stack<String> stack1 = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String [] arr = str.split(" ");
//        for (int i = 0; i <arr.length ; i++) {
//            stack1.push(arr[i]);
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=stack1.pop();
//        }
//        String result = String.join(" ",arr) ;
//        System.out.println(result);
//
//        Stack<Integer> stack =new Stack<>();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số");
//        int number = scanner.nextInt();
//        while (number> 0 ){
//            int d = number%2 ;
//            stack.push(number);
//            number/=2 ;
//        }
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        Stack<String> stack = new Stack<>();
        System.out.println("nhập vào một chuỗi");
        String str = scanner.nextLine();
        String[] array1 = str.toLowerCase().split(" ");
        System.out.println(Arrays.toString(array1));

        Map<String, Integer> myMap = new TreeMap<>();
        for (int i = 0; i < array1.length; i++) {
            if (!myMap.containsKey(array1[i])) {
                myMap.put(array1[i], 1);
            }else{
                int value = myMap.get(array1[i])+1  ;
                myMap.put(array1[i],value);
            }


        }
        System.out.println(myMap);
    }
}
