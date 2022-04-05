package _02_loop.exercise;

import java.util.Scanner;

public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        int Count;
        int countPrime = 0;
        int n = 2;
        while (n <100 ) {
             Count = 0;
            for (int i = 2; i < n; i++) {
                if (n%i == 0) {
                    Count++;
                }
            }
            if (Count == 0) {
                countPrime++;
                System.out.println("số nguyên tố nhỏ hơn 100 là " + n);
            }
            n++;
        }
    }
}
