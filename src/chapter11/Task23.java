package chapter11;

/*Напишите класс, который вначале принимает с клавиатуры целое положительное число
(в переменную х), которое будет количеством членов в арифметической прогрессии.
Первый член прогрессии равен 7, а разница между соседними членами
прогрессии равна 4.
Затем класс выводит на экран в строку серию из х членов этой прогрессии.
Числа должны отделяться друг от друга знаком «пробел». Перед началом и после
окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору).

 */

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x = scanner.nextInt();
        int first = 7;
        int progression = 4;
        System.out.println("Начало прогрессии");
        for (int i = 0; i < x; i++) {
            int result = first + (progression * i);
            System.out.print(result + " ");
        }
        System.out.println("\nКонец прогрессии");
    }
}
