package _03_array.exercise;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử ");
        int element = scanner.nextInt();
        int [] array = new int[element];
        System.out.println("nhập vào mảng các phần tử");
        for (int i = 0; i < element ; i++) {
            System.out.print ("Arr["+i +"]" );
            array[i]=scanner.nextInt();
        }
//        System.out.println("Mang vua nhap la:");
//        for (int i = 0; i < element; i++) {
//            System.out.print (array[i] + "\t");
//        }
        int min = findMinElement(array,element);
        System.out.println(min);

    }
    public static int findMinElement(int []array,int element){
       int min = array[0];
        for (int i = 0; i < element  ; i++) {
            if (min> array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
