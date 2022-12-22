package chapter11;

/* Напишите класс, который вначале принимает с клавиатуры целое положительное число.
Затем класс выводит на экран в строку положительные двузначные
числа, произведение цифр которых меньше введенного с клавиатуры
значения. Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода
следует вывести текстовые сообщения (по выбору).
 */

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        System.out.println("Начало");
        for (int i = 10; i < 99; i++) {
            int x1 = i / 10;
            int x2 = i % 10;
            if (x1 * x2 < number) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Конец");
    }
}
