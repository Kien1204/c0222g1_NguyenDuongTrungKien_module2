package _03_array.exercise;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String string = "nguyen duong trung kien";
        String str1 = "i am a development";
//        System.out.println(countCharacter(string));
        System.out.println(countCharacter(str1));
    }
    public static int countCharacter(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character " );
        char keyword = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (keyword==str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
