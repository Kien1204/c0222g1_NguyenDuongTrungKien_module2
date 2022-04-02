package _03_array.exercise;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(A));
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        int a = 0 ;
        for (int j = 0; j < n ; j++) {
            if (A[j]==k){
                a=j;
                }
            }
        for (int l = a ; l < n ; l++) {
             A[a]=A[a+1];
        }
        A[A.length-1]++;
        System.out.println(Arrays.toString(A));
    }
}


