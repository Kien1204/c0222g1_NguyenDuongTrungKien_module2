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
            int [] Array1= new int[length1];
            int [] Array2= new int[length2];

            for (int i = 0; i <Array1.length ; i++) {
                System.out.print("element "+i+" Array1: ");
                Array1[i]=input.nextInt();
            }
            for (int j = 0; j <Array2.length ; j++) {
                System.out.print(" "+j+" array2: ");
                Array2[j]=input.nextInt();
            }
            mergeArray(Array1,Array2);
        }
        public static void mergeArray(int [] Array1, int []Array2){
            int [] mergeArray= new int[Array1.length+Array2.length];
            for (int i = 0; i <mergeArray.length ; i++) {
                if (i<Array1.length){
                    mergeArray[i]=Array1[i];
                }else {
                   mergeArray[i]=Array2[i-Array1.length];
                }
            }
            System.out.println(Arrays.toString(mergeArray));
        }
    }

