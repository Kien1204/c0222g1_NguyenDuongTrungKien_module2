package _03_array.exercise;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử ");
        int n = scanner.nextInt();

        int [] array = new int[n];

        System.out.println("nhập vào mảng các phần tử");
        for (int i = 0; i < n ; i++) {
            System.out.print ("Arr["+i +"]" );
            array[i]=scanner.nextInt();
        }
        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.print (array[i] + "\t");

        }
        int min = array[0];
        for (int i = 0; i < n ; i++) {
         if (min> array[i]){
             min = array[i];
         }
        }
        System.out.println();
        System.out.println("số nhỏ nhất là " + min);
    }
}
