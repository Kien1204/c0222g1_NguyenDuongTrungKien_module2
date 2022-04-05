package _03_array.exercise;

import java.util.Scanner;

public class CalculateSumOfDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Column, Row;
        System.out.println("enter column");
        Column = scanner.nextInt();
        System.out.println("enter row ");
        Row = scanner.nextInt();
        int[][] Array = new int[Column][Row];
        System.out.println("enter m and n");
        for (int i = 0; i < Column; i++) {
            for (int j = 0; j < Row; j++) {
                System.out.print("A[" + i + "][" + j + "]");
                Array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(calculateTotalDiagonals1(Column,Array,Row));
        System.out.println(calculateTotalDiagonals2(Column,Array,Row));
    }

    public static int calculateTotalDiagonals1(int Columns, int[][] Array, int Row) {
        int Sum1 = 0;
        for (int i = 0, j = Columns - 1; i < Row; i++, j--) {
            Sum1 += Array[i][i];
        }
        return Sum1;
    }

    public static int calculateTotalDiagonals2(int Columns, int[][] Array, int Row) {
        int Sum2 = 0;
        for (int i = 0, j = Columns - 1; i < Row; i++, j--) {
            Sum2 += Array[i][j];
        }
        return Sum2;
    }
}
