package chapter11;

/* Напишите класс, который вначале принимает с клавиатуры целое положительное число.
Затем класс выводит на экран в строку положительные трехзначные
числа, в которых последняя цифра такая же, как и последняя цифра в
значении, введенном с клавиатуры. Числа должны отделяться друг от
друга знаком «пробел». Перед началом и после окончания вывода серии чисел на
экран вывода следует вывести текстовые сообщения (по
выбору).
 */

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        int x = number % 10;
        System.out.println("Начало прогрессии");
        for (int i = 100; i < 1000; i++){
            if (i % 10 == x) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nКонец прогрессии");
    }
}
