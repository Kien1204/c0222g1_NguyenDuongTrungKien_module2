package _10_stack_queue.exercise.convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;
import java.util.function.DoubleBinaryOperator;

public class ConvertDecimalToBinary {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào số thập phân: ");
        int num = scanner.nextInt();
        while (num > 0)
        {
            int d = num % 2;
            stack.push(d); // đưa số dư vào stack
            num /= 2;
        }
        System.out.print("\nGiá trị nhị phân là: ");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
    }
}
