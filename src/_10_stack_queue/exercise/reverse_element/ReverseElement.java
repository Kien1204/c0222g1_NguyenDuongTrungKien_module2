package _10_stack_queue.exercise.reverse_element;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        Stack<Integer> number= new Stack<>();
        int [] array={1,2,3,4,5,6,7,8};
        for (int i = 0; i < array.length ; i++) {
            array[i]=number.push(array[i]);
        }
        System.out.println("phần tử trước khi đảo ngược");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length ; i++) {
            array[i]=number.pop();
        }
        System.out.println("phần tử sau khi đảo ngược -");
        System.out.println(Arrays.toString(array));


        Stack<String> str = new Stack<>();
        System.out.println("nhập vào chuỗi");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String [] arr = string.split(" ") ;
        for (int i = 0; i <arr.length ; i++) {
            str.push(arr[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=str.pop();
        }
        String result  = string.join(" ", arr);
        System.out.println("mảng sau khi đảo ngược" +" " + result);
    }

}
