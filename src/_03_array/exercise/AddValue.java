package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;
public class AddValue {
    public static int [] addValue(int [] array,int addNumber,int value  ) {
        for (int i = array.length-1; i >= addNumber ; i--) {
            if(i==addNumber){
                array[i]=value ;
               break;
            }
            array[i]=array[i-1] ;

        }
        return array ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array ={1,2,3,4,5,6,0,0,0,0};

        System.out.print("nhập vào vị trí  muốn thêm");
        int addNumber = scanner.nextInt();
        System.out.print ("nhập vào giá trị muốn thêm");
        int value =scanner.nextInt();
        System.out.println(Arrays.toString(addValue(array,addNumber,value)));
    }
}
