package _03_array.exercise;

import java.util.Scanner;

public class FindMaxElementIn2dArray {
    public static void main(String[] args) {
        int column, row;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter column");
        column = scanner.nextInt();
        System.out.println("enter row");
        row = scanner.nextInt();
        int [][] array = new int[column][row];
        System.out.println("enter element for column and row");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("A[" + i + "] [" + j + "] =");
                array[i][j] = scanner.nextInt();
            }
        }
         int max= findMaxElementIn2dArray(array,column,row);
        System.out.println(max);
    }

    public static int findMaxElementIn2dArray(int[][] array, int column, int row) {
       int max = array[0][0];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
