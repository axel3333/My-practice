package chapter11;

/* Напишите класс, который принимает с клавиатуры целое число N,
а затем принимает с клавиатуры N целых чисел.
Для каждого вводимого с клавиатуры неотрицательного числа следует
вывести на экран его квадрат, а для остальных чисел - текст Пропускаем.

 */

import java.util.Scanner;

public class Task58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("Введите целое число");
            int result = scanner.nextInt();
            if (result > 0) {
                System.out.println(result * result + " ");
            } else
                System.out.println("Пропускаем");
        }
    }
}
