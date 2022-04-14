package _10_stack_queue.exercise.palidrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalidrome {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner scanner=new Scanner(System.in);
        String inputString = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
            // thêm phần tử từ cuối cùng của mảng đến đầu mảng vào queue
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();//remove :xóa những phần tử nhập vào trước
         // tạo một chuỗi rỗng để thêm các kí tự xóa theo thứ tự ở inputString vào
        }
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}
