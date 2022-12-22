package chapter11;

/* Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное
число (нет необходимости проверять соответствие введенного
значения этому условию);
• затем выводит на экран четырехзначные целые положительные
числа, в которых и сумма двух первых цифр, и сумма двух последних
цифр равны сумме цифр двузначного числа, введенного с
клавиатуры.
 */

import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное двузначное число");
        int number = scanner.nextInt();
        int number1 = number / 10;
        int number2 = number % 10;
        int summOfNumbers = number1 + number2;
        for (int i = 1000; i < 10000; i++) {
            int x1 = i / 1000;
            int x2 = i / 100 % 10;
            int x3 = i / 10 % 10;
            int x4 = i % 10;
            int summOfFirstNumbers = x1 + x2;
            int summOfSecondaryNumbers = x3 + x4;
            if (summOfFirstNumbers == summOfNumbers && summOfSecondaryNumbers == summOfNumbers) {
                System.out.print(i + " ");
            }
        }
    }
}
