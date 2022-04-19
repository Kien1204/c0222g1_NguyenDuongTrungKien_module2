package _13_sort_algorithm.exercise.insertion_sort_setting;

public class InsertionSort {
    public static int[] array = {15,11,9,12,2,3,6,29,17};

    public static void insertionSort(int[] array) {
        int temp, j;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];

            j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(" Mảng trước khi sắp xếp: ");
        for (int elements : array){
            System.out.print(elements+" ");
        }

        System.out.println("\nMảng sau khi sắp xếp : ");
        insertionSort(array);
        for (int elements : array){
            System.out.print(elements+" ");
        }
    }
}
