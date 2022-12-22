package chapter11;

/* Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное
число;
• затем выводит на экран (в строку с пробелами) трехзначные целые положительные числа,
в которых предварительно введенное
двузначное число является «внутренней» частью (как, например,
23 для 123 или 623).

 */

import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное двузначное число");
        int number = scanner.nextInt();
        for (int i = 100 + number; i < 1000; i+= 100) {
            System.out.print(i + " ");
        }
    }
}
