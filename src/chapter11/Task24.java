package chapter11;

/* Напишите класс, который вначале принимает с клавиатуры целое положительное число
(в переменную х). Затем класс выводит на экран в строку серию из 2х убывающих чисел,
начиная с О; разница между соседними значениями в серии равна 8. Числа должны отделяться
друг от друга знаком «пробел». Перед началом и после окончания вывода серии чисел на
экран вывода следует вывести текстовые сообщения (по выбору).
 */

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x = scanner.nextInt();
        int first = 0;
        int progression = 8;
        System.out.println("Начало прогрессии");
        for (int i = 0; i < x * 2; i++){
            int result = first - (progression * i);
            System.out.print(result + " ");
        }
        System.out.println("\nКонец прогрессии");
    }
}
