package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 9, 7, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print (" Mảng ban đầu là: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");
        System.out.println("Nhập số cần chèn");
        int insertNumber = scanner.nextInt();
        int insertIndex = 0;
        do {
            System.out.println("Nhập vị trí cần chèn");
            insertIndex = scanner.nextInt();
        } while (insertIndex <= 0 );

        for (int i = arr.length - 1; i > insertIndex; i--) {
            arr[i] = arr[i-1];
        }
        arr[insertIndex] = insertNumber;
        System.out.printf("%-20s%s", "Mảng sau khi chèn là: ", "");
        System.out.println(Arrays.toString(arr));
        }
    }


