package _02_loop.exercise;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount number");
        int number = sc.nextInt();
        int countPrime = 0;
        int n = 2;
        while (countPrime <= number) {
            int count=0 ;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                countPrime++;
                System.out.println(n);
            }
            n++;
        }
    }
}
