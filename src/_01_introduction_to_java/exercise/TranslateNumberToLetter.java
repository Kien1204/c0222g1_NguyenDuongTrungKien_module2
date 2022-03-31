package _01_introduction_to_java.exercise;

import java.util.Scanner;
public class TranslateNumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your number !");
        String units = "";
        String dozens = "";
        String hundreds = "";
        int number = scanner.nextInt();
        int numberUnits = number % 10;
        int numberDozens = (number % 100) / 10;
        int numberHundreds = number / 100;
        switch (numberUnits) {
            case 1:
                units = "one";
                break;
            case 2:
                units = "two";
                break;
            case 3:
                units = "three";
                break;
            case 4:
                units = "four ";
                break;
            case 5:
                units = "five ";
                break;
            case 6:
                units = "six ";
                break;
            case 7:
                units = "seven ";
                break;
            case 8:
                units = "eight ";
                break;
            case 9:
                units = " nine ";
                break;
        }
        switch (numberHundreds) {
            case 1:
                hundreds = "one hundred " + " and ";
                break;
            case 2:
                hundreds = "two hundreds "  +  " and ";
                break;
            case 3:
                hundreds = "three hundreds"  + " and ";
                break;
            case 4:
                hundreds = "four hundreds"  + " and ";
                break;
            case 5:
                hundreds = "five hundreds" + " and ";
                break;
            case 6:
                hundreds = "six hundreds" + " and ";
                break;
            case 7:
                hundreds = " seven hundreds" + "and";
                break;
            case 8:
                hundreds = " eight  hundreds" + " and  ";
                break;
            case 9:
                hundreds = " nine  hundreds" + " and ";
                break;
        }
        if (numberDozens == 1) {
            switch (numberUnits) {
                case 0:
                    dozens = "ten";
                case 1:
                    dozens = " eleven ";
                    break;
                case 2:
                    dozens = "twelve";
                    break;
                case 3:
                    dozens = "thirteen";
                    break;
                case 4:
                    dozens = "fourteen";
                    break;
                case 5 :
                    dozens = "fifteen";
                    break;
                case 6 :
                    dozens = "sixteen";
                    break;
                case 7:
                    dozens=  "seventeen";
                case 8:
                    dozens=  "eighteen";
                case 9:
                    dozens=  "nineteen";
            }

        } else {
            switch (numberDozens) {
                case 2:
                    dozens = "twenty";
                    break;
                case 3:
                    dozens = "thirty";
                    break;
                case 4:
                    dozens = "forty";
                    break;
                case 5:
                    dozens = "fifty";
                    break;
                case 6:
                    dozens = "sixty";
                    break;
                case 7:
                    dozens = "seventy";
                    break;
                case 8:
                    dozens = "eighty";
                    break;
                case 9:
                    dozens = "ninety";
                    break;
                default:
                    System.out.println("");
            }
        }
        if (numberDozens == 1) {
            System.out.println(hundreds + dozens);
        } else {
            System.out.println(hundreds + dozens + units);
        }
    }
}