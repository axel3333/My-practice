package chapter11;

/* Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное
число;
• затем выводит на экран (в строку с пробелами) четырехзначные
целые положительные числа, в которых предварительно введенное двузначное
число является «внутренней» частью (как, например, 23 для 1523, или 6237, или 4230).

 */

import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное двузначное число");
        int number = scanner.nextInt();
        for (int i = 1000; i < 10000; i++) {
            int x1 = i % 100;
            int x2 = i / 10 % 100;
            if (number == x1 || number == x2) {
                System.out.print(" " + i);
            }
        }
    }
}
