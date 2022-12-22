package chapter11;

/* Напишите класс, который вначале принимает с клавиатуры целое положительное
число (в переменную х). Затем класс выводит на экран в
строку серию из 17 целых положительных чисел, отвечающую следующим условиям:
1) серия начинается с числа, большего хна 1;
2) каждое число в серии (начиная со второго) больше предыдущего на 1.
Числа должны отделяться друг от друга знаком «пробел». Перед началом и
после окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору).

 */

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x = scanner.nextInt();
        for (int i = 1; i <=17; i++) {
            System.out.print(x + i + " ");
        }
        System.out.println("Конец");
    }
}