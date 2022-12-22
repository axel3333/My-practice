package chapter19;

/*
Напишите метод, который получает в качестве параметра массив и
выводит на экран содержащиеся в нем значения в одну строку через
пробел между значениями.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner.nextInt();
        int[] mass = newArray(x);
        print(mass);
    }

    public static int[] newArray(int x) {
        int [] mass = new int[x];
        for (int i = 0; i < x; i++) {
            mass [i] = (int) (Math.random() * 100);
        }
        return mass;
    }

    public static void print (int mass[]) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
    }
}
