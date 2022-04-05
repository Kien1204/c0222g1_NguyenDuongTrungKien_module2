package _03_array.exercise;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử ");
        int element = scanner.nextInt();
        int [] Array = new int[element];
        System.out.println("nhập vào mảng các phần tử");
        for (int i = 0; i < element ; i++) {
            System.out.print ("Array["+i +"]" );
            Array[i]=scanner.nextInt();
        }
//        System.out.println("Mang vua nhap la:");
//        for (int i = 0; i < element; i++) {
//            System.out.print (Array[i] + "\t");
//        }
        int min = findMinElement(Array,element);
        System.out.println(min);

    }
    public static int findMinElement(int []Array,int element){
       int min = Array[0];
        for (int i = 0; i < element  ; i++) {
            if (min> Array[i]){
                min = Array[i];
            }
        }
        return min;
    }
}
