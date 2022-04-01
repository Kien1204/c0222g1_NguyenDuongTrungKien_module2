package _02_loop.exercise;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("List");
            System.out.println("1. Draw the the rectangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                                System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                case 2 :
                    for (int i = 1; i <=5; i++) {
                        for (int j = 0; j <i ; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                case 3 :
                    for (int i = 7; i >=1 ; i--) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                case 4 :
                    for (int i = 0; i <=5 ; i++) {
                        for (int j = 0; j <=5 ; j++) {
                            if (j<i){
                                System.out.print("  ");
                            }else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                case 5 :
                    for ( int  i = 0; i <= 4; i++) {
                        for ( int j = 1; j <= 9; j++) {
                            if (j >= 5 - i && j <= 5 + i) {
                                System.out.print("*");
                            }else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                case 6 :
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 5; j >=i ; j--) {
                            System.out.print(" ");
                            }
                        for (int k = 1; k <=i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            }
        }

    }
}

