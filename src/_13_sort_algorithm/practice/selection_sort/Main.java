package _13_sort_algorithm.practice.selection_sort;

import static _13_sort_algorithm.practice.selection_sort.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
         double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}
