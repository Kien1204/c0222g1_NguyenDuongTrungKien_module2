package _13_sort_algorithm.practice.bubble_sort;

public class Main {
    public static void main(String[] args) {
         int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        BubbleSort bubbleSort = new BubbleSort() ;
        BubbleSort.bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
