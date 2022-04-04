package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static int[] deleteValue(int [] array,int addNumber ) {
        int index = 0 ;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]== addNumber){
                index=i ;
            }
        }
        for (int i = index; i < array.length ; i++) {
            if (i==array.length-1){
                break;
            }
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
        return  array ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài cho mảng ");
        int size  = scanner.nextInt();
        int [] array = new int[size];
        System.out.println("nhập giá trị cho mảng");
        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử" +  i );
            array[i]= scanner.nextInt();
        }
        System.out.println(" nhập vào số muốn xóa ");
        int addNumber = scanner.nextInt();
        System.out.println(Arrays.toString(deleteValue(array,addNumber )));
    }
}


