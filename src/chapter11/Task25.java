package chapter11;

/* Напишите класс, который вначале принимает с клавиатуры целое положительное число
(в переменную х). Затем класс выводит на экран в
строку все целые числа из диапазона O ... lxl (включая крайние значения
диапазона). Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода
следует вывести текстовые сообщения (по выбору).

 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x = scanner.nextInt();
        System.out.println("Начало прогрессии");
        for (int i = 0; i <=x; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nКонец прогрессии");
    }
}
