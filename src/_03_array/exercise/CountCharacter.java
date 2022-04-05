package _03_array.exercise;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String String = "nguyen duong trung kien";
        String Str1 = "i am a development";
//        System.out.println(countCharacter(string));
        System.out.println(countCharacter(Str1));
    }
    public static int countCharacter(String Str){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character " );
        char Keyword = sc.next().charAt(0);
        int Count = 0;
        for (int i = 0; i <Str.length() ; i++) {
            if (Keyword==Str.charAt(i)){
                Count++;
            }
        }
        return Count;
    }
}
