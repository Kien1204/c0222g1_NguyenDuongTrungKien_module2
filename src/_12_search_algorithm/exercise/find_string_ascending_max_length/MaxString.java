package _12_search_algorithm.exercise.find_string_ascending_max_length;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        // W : 87, e :101,l:108,c:99,o:111,m:109,

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi :");
        String str = scanner.nextLine();
        LinkedList<Character> maxChar = new LinkedList<>();
        maxChar.add(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > maxChar.getLast()) {
                maxChar.add(str.charAt(i));
            }
        }
        for (Character data : maxChar) {
            System.out.print(data);
        }
        System.out.println();
    }
}

