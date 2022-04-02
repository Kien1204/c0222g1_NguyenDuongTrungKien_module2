package _03_array.exercise;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử ");
        int n = scanner.nextInt();

        int [] Arr = new int[n];

        System.out.println("nhập vào mảng các phần tử");
        for (int i = 0; i < n ; i++) {
            System.out.print ("Arr["+i +"]" );
            Arr[i]=scanner.nextInt();
        }
        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.print (Arr[i] + "\t");

        }
        int min = Arr[0];
        for (int i = 0; i < n ; i++) {
         if (min> Arr[i]){
             min = Arr[i];
         }
        }
        System.out.println();
        System.out.println("số nhỏ nhất là " + min);
    }
}
