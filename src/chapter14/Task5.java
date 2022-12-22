package chapter14;

/* Напишите класс, который принимает с клавиатуры серию из 12 целых
чисел и определяет среднее арифметическое максимума и минимума
для этой серии.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minimum = 0, maximum = 0;
        int count = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Введите целое число: ");
            int number = scanner.nextInt();
            if (i == 1) {
                maximum = number;
                minimum = number;
            }
            if (number < minimum) {
                minimum = number;
                count++;
            }else if (number > maximum) {
                maximum = number;
                count++;
            } else count++;
        }
        System.out.println("Максимум - " + maximum + "\nМинимум + " + minimum + "\nВсего значений + " + count);
        System.out.println("Среднее арифметическое максимума - " + maximum / count);
        System.out.println("Среднее арифметическое минимума - " + minimum / count);
    }
}
