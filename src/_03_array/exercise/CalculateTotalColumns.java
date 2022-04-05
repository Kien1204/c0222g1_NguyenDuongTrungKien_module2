package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTotalColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Column, Row;
        System.out.println("nhập Column");
        Column = scanner.nextInt();
        System.out.println("nhập Row ");
        Row = scanner.nextInt();
        int [][] Array = new int[Column][Row];
        System.out.println("nhập phần tử cho column và row");
        for (int i = 0; i < Column; i++) {
            for (int j = 0; j < Row; j++) {
                System.out.print("A[" + i + "][" + j + "]");
                Array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhập vị trí của cột muốn tính");
        int indexColumn = scanner.nextInt();
        int Sum = calculateTotalColumn(indexColumn, Column, Array);
        System.out.println("sum: " + Sum);

    }
    public static int calculateTotalColumn(int indexColumn, int Column, int[][]Array){
        int Sum = 0;
        for (int i = 0; i < Column ; i++) {
            Sum+=Array[i][indexColumn];
        }
        return Sum;
    }



}
