package chapter11;

/* Напишите класс, который принимает с клавиатуры два целых положительных числа:
N и М (неизвестно, какое из введенных чисел больше).
Класс должен вывести на экран все целые числа между наименьшим и
наибольшим значениями, введенными с клавиатуры.
 */

import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое положительное число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое положительное число");
        int number2 = scanner.nextInt();
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                System.out.print(i + " ");
            }
        } else if (number1 > number2) {
            for (int i = number2; i <= number1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
