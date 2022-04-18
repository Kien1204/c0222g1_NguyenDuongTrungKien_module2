package _10_stack_queue.exercise.count_appearance_word;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi ");
        String str  = scanner.nextLine();
        String [] array = str.toLowerCase().split(" "); // tách chuỗi thành từng từ rồi đưa vào mảng
        System.out.println(Arrays.toString(array));


        Map<String, Integer> element = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!element.containsKey(array[i])) {
                element.put(array[i], 1);
                // nếu phần tử không tồn tại thì thêm phần tử vào mảng arr với giá trị là 1
            } else {
                int strValue = element.get(array[i]) + 1;
                element.put(array[i], strValue);
                // nếu đã tồn tại thì cộng phần tử đó lên 1
            }
        }
        System.out.println(element);

    }
}
