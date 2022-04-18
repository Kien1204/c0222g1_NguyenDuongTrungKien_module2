package _12_search_algorithm.exercise.binary_search_recursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i <arr.length ; i++) {
        }
            System.out.println("nhập một số muốn tìm :  ");
            Scanner sc = new Scanner(System.in);
            int searchNumber = sc.nextInt();
            if (BinarySearch.binarySearch(arr , 0, arr .length - 1, searchNumber)) {
                System.out.println(searchNumber+ "có trong mảng ");
            } else {
                System.out.println("không có trong mảng");
            }
        }
    }

