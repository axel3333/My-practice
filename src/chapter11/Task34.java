package chapter11;

/* Напишите класс, который принимает с клавиатуры целое число и выводит
 на экран 18 последующих ему чисел.
 */

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        System.out.println("Начало");
        for (int i = 1; i <=18; i++) {
            System.out.print(number + i + " ");
        }
        System.out.println("\nКонец");
    }
}
