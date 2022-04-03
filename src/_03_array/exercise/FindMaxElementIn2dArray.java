package _03_array.exercise;

import java.util.Scanner;

public class FindMaxElementIn2dArray {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số m");
        m = scanner.nextInt();
        System.out.println("nhập số n");
        n = scanner.nextInt();
        int array[][] = new int[m][n];
        System.out.println ("nhập các phần tử cho m,n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print ("A[" + i + "] [" + j + "] =");
                array[i][j] = scanner.nextInt();
            }
        }
            int max = array[0][0];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (max < array[i][j]) {
                      max = array[i][j];
                    }
                }
            }
        System.out.println("giá trị lớn nhất trong mảng là " + max);
        }
    }
