package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static void deleteValue(int [] Array,int addNumber ) {
        int Index = 0 ;
        for (int i = 0; i < Array.length ; i++) {
            if (Array[i]== addNumber){
                Index=i ;
            }
        }
        for (int i = Index; i < Array.length ; i++) {
            if (i==Array.length-1){
                break;
            }
            Array[i]=Array[i+1];
        }
        Array[Array.length-1]=0;
        System.out.println(Arrays.toString(Array));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài cho mảng ");
        int Size  = scanner.nextInt();
        int [] Array = new int[Size];
        System.out.println("nhập giá trị cho mảng");
        for (int i = 0; i < Size; i++) {
            System.out.println("nhập phần tử" +  i );
            Array[i]= scanner.nextInt();
        }
        System.out.println(" nhập vào số muốn xóa ");
        int addNumber = scanner.nextInt();
        deleteValue(Array,addNumber);
    }
}


