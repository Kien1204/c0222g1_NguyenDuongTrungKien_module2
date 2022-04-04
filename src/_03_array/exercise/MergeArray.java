package _03_array.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class MergeArray {
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.println("enter length 1");
            int length1= input.nextInt();
            System.out.println("enter length 2");
            int length2 = input.nextInt();
            int [] arr1= new int[length1];
            int [] arr2= new int[length2];

            for (int i = 0; i <arr1.length ; i++) {
                System.out.print("element "+i+" array1: ");
                arr1[i]=input.nextInt();
            }
            for (int j = 0; j <arr2.length ; j++) {
                System.out.print(" "+j+" array2: ");
                arr2[j]=input.nextInt();
            }
            mergeArrray(arr1,arr2);
        }
        public static void mergeArrray(int []array1, int []array2){
            int [] mergeArr= new int[array1.length+array2.length];
            for (int i = 0; i <mergeArr.length ; i++) {
                if (i<array1.length){
                    mergeArr[i]=array1[i];
                }else {
                   mergeArr[i]=array2[i-array1.length];
                }
            }
            System.out.println(Arrays.toString(mergeArr));
        }
    }

