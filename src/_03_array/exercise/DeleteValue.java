package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int addNumber, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            addNumber = scanner.nextInt();
        } while (addNumber <= 0);

        int [] array = new int[addNumber];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < addNumber; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số nguyên k: ");

        int deleteNumber = scanner.nextInt();
        for (int j = 0; j < addNumber; j++) {
            if (array[j] == deleteNumber) {
                for (int l = j; l < addNumber; l++, j++) {
                    if (l == addNumber - 1) {
                        array[array.length-1]=0;
                        break;
                    }
                    array[j] = array[j + 1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


