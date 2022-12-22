package chapter11;

/* Напишите класс, который принимает с клавиатуры целое положительное число,
а затем выводит на экран все целые положительные трехзначные числа, сумма цифр
которых равна введенному с клавиатуры значению.
 */

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x = scanner.nextInt();
        System.out.println("Начало прогрессии");
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < x; j++){
                int x1 = x - i - j;
                if (x1 < 0){
                    continue;
                }
                System.out.print(" " + i + j + x1);
            }
        }
        System.out.println("\nКонец прогрессии");
    }
}
