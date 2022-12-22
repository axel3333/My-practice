package chapter11;

/* Напишите класс, который принимает с клавиатуры целое положительное число,
а затем выводит на экран все целые положительные двузначные числа, сумма цифр
которых равна введенному с клавиатуры значению.
 */

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x = scanner.nextInt();
        System.out.println("Начало прогрессии");
        for (int i = 1; i < x; i++) {
            System.out.print(" " + i + (x - i));
        }
        System.out.println("\nКонец прогрессии");
    }
}
