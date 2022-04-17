package _10_stack_queue.exercise.reverse_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> str = new Stack<>();
        System.out.println("nhập vào chuỗi");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] arr = string.split(" ");
        for (int i = 0; i < arr.length; i++) {
            str.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.pop();
        }
        String result = string.join(" ", arr);
        System.out.println("mảng sau khi đảo ngược" + " " + result);
    }
}
