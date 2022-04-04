package _03_array.exercise;

import java.util.Scanner;

public class CalculateSumOfDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column, row;
        System.out.println("enter column");
        column = scanner.nextInt();
        System.out.println("enter row ");
        row = scanner.nextInt();
        int[][] array = new int[column][row];
        System.out.println("enter m and n");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("A[" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(calculateTotalDiagonals1(column,array,row));
        System.out.println(calculateTotalDiagonals2(column,array,row));
    }

    public static int calculateTotalDiagonals1(int columns, int[][] array, int row) {
        int sum1 = 0;
        for (int i = 0, j = columns - 1; i < row; i++, j--) {
            sum1 += array[i][i];
        }
        return sum1;
    }

    public static int calculateTotalDiagonals2(int columns, int[][] array, int row) {
        int sum2 = 0;
        for (int i = 0, j = columns - 1; i < row; i++, j--) {
            sum2 += array[i][j];
        }
        return sum2;
    }
}
