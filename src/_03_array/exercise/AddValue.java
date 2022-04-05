package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;
public class AddValue {
    public static int [] addValue(int [] Array,int addNumber,int Value  ) {
        for (int i = Array.length-1; i >= addNumber ; i--) {
            if(i==addNumber){
                Array[i]=Value ;
               break;
            }
            Array[i]=Array[i-1] ;
        }
        return Array ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] Array ={1,2,3,4,5,6,0,0,0,0};

        System.out.print("nhập vào vị trí  muốn thêm");
        int addNumber = scanner.nextInt();
        System.out.print ("nhập vào giá trị muốn thêm");
        int Value =scanner.nextInt();
        System.out.println(Arrays.toString(addValue(Array,addNumber,Value)));
    }
}
