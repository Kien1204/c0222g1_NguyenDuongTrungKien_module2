package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class TransMoney {
    public static void main(String[] args) {
        double Vnd =23000 ;
        double Usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("input money ");
         Usd = sc.nextDouble();
        double transUsdToVnd  = Usd * 23000;
        System.out.println(" result " + transUsdToVnd);
    }
}
