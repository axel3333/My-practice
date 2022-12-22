package chapter18;

/*
Напишите класс, который заполняет случайными трехзначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива в
одной строке, начиная с «начала» массива (с первой ячейки).
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner.nextInt();
        int[] mass = new int[x];
        int down = 100, up = 999;
        for (int i = 0; i < x; i++) {
            int temp = (int) (Math.random() * ((up - down) + 1) + down);
            mass[i] = temp;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
