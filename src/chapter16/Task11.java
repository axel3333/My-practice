package chapter16;

/*
Напишите класс, который принимает с клавиатуры целое число,
а затем проверяет, можно ли представить его в виде суммы квадратов двух
целых чисел.
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                int result = (i * i) + (j * j);
                if (number == result) {
                    System.out.println("Да");
                    System.exit(0);
                }
            }
        }
    }
}
