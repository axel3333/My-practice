package chapter13;
import java.util.Scanner;

/* Последовательность Фибоначчи - последовательность целых чисел,
построенная по следующему правилу: каждый член последовательности,
начиная с 3-го, равен сумме двух предыдущих.
Напишите класс, который получает с клавиатуры два первых члена
последовательности и целое положительное число N. Класс подсчитает и
выведет на экран сумму первых N членов последовательности Фибоначчи.
 */

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число последовательности Фибоначи");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число последовательности Фибоначи");
        int number2 = scanner.nextInt();
        System.out.println("Введите число членов последовательности Фибоначи");
        int n = scanner.nextInt();
//        int number3 = number1 + number2;
        int temp = number2;
        int sum = number1 + number2;
        for (int i = 3; i <= n; i++){
            int result = number1 + number2;
            sum += result;
            number1 = number2;
            number2 = result;
        }
        System.out.println("Сумма первых " + n + " членов последовательности Фибоначи равна - "
        + sum);
    }
}
