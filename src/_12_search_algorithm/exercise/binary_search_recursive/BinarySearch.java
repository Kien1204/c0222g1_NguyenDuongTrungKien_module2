package _12_search_algorithm.exercise.binary_search_recursive;

public class BinarySearch {
    public static boolean binarySearch(int[] array, int low, int high, int value) {
        int mid = 0;
        if (high >= low) {
            mid = (high + low) / 2;
            if (value == array[mid]) {
                return true;
            } else if (value > array[mid]) {
                return binarySearch(array, mid + 1, high, value);
            } else {
                return binarySearch(array, low, high - 1, value);
            }
        }
        return false;
    }
}

