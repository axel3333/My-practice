package chapter18;

/*
Напишите класс, который заполняет случайными трехзначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом:
• в первой строке - первую половину массива;
• во второй строке - вторую половину массива.
В случае если массив имеет нечетный размер, центральную ячейку
следует выводить в первой строке.

 */

import java.util.Scanner;

public class Task14 {
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
        print (x, mass);

    }
    public static void print(int x, int [] mass) {
        if (x % 2 != 0) {
            for (int i = 0; i <= (x / 2); i++) {
                System.out.print(mass[i] + " ");
            }
            System.out.println();
            for (int i = (x / 2) + 1; i < x; i++) {
                System.out.print(mass[i] + " ");
            }
        }
        if (x % 2 == 0) {
            for (int i = 0; i < (x / 2); i++) {
                System.out.print(mass[i] + " ");
            }
            System.out.println();
            for (int i = (x / 2); i < x; i++) {
                System.out.print(mass[i] + " ");
            }
        }
    }
}
