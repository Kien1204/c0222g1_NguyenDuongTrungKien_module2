package _03_array.exercise;

import java.util.Scanner;

public class FindMaxElementIn2dArray {
    public static void main(String[] args) {
        int Column, Row;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter Column");
        Column = scanner.nextInt();
        System.out.println("enter Row");
        Row = scanner.nextInt();
        int [][] Array = new int[Column][Row];
        System.out.println("enter element for column and row");
        for (int i = 0; i < Column; i++) {
            for (int j = 0; j < Row; j++) {
                System.out.print("A[" + i + "] [" + j + "] =");
                Array[i][j] = scanner.nextInt();
            }
        }
         int Max= findMaxElementIn2dArray(Array,Column,Row);
        System.out.println(Max);
    }

    public static int findMaxElementIn2dArray(int[][] Array, int Column, int Row) {
       int Max = Array[0][0];
        for (int i = 0; i < Column; i++) {
            for (int j = 0; j < Row; j++) {
                if (Max < Array[i][j]) {
                    Max = Array[i][j];
                }
            }
        }
        return Max;
    }
}
