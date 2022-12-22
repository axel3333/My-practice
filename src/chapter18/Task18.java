package chapter18;

/*
Напишите класс, который заполняет случайными двузначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом:
• в первой строке - значения из первой половины массива, начиная с «начала));
• во второй строке - значения из второй половины массива, начиная с «КОНЦЮ).

 */

import java.util.Arrays;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner.nextInt();
        int[] mass = new int[x];
        int down = 10, up = 99;
        for (int i = 0; i < x; i++) {
            int temp = (int) (Math.random() * ((up - down) + 1) + down);
            mass[i] = temp;
        }
        System.out.println(Arrays.toString(mass));
        print(x, mass);
    }
    public static void print (int x, int []mass) {
        for (int i = 0; i < x / 2; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = x - 1; i >= x / 2; i--) {
            System.out.print(mass[i] + " ");
        }
    }
}
