package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1,size2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input length of Array1");
            size1 = sc.nextInt();
        }while (size1<=0);
        int[] array1 = new int[size1];
        System.out.println ("nhập các phần tử cho mảng");
        for (int i = 0; i < size1; i++) {
            System.out.print ("nhập các phần tử thứ " +i + ": ");
            array1[i] = sc.nextInt();
        }
        do {
            System.out.println("Input length of Array2");
            size2 = sc.nextInt();
        }while (size2<=0);
        int[] array2 = new int[size2];
        System.out.println("nhập các phần tử cho mảng");
        for (int j = 0; j < size2; j++) {
            System.out.print ("nhập các phần tử thứ " + j + ": ");
            array2[j] = sc.nextInt();
        }
        int length = array1.length + array2.length;
        int[] result = new int[length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
            }
        for (int j = 0; j < array2.length; j++) {
            result[j +array1.length]   = array2[j];
        }
        System.out.println(" Mảng sau khi được nối ");
        System.out.println(Arrays.toString(result));
    }

}
