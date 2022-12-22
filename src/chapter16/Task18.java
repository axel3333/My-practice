package chapter16;

/*
Напишите класс, который принимает с клавиатуры целое
положительное число и выводит на экран все его делители,
которые являются простыми числами.
 */

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            int flag = 0;
            if (number % i == 0) {
                for (int j = 1 ; j <= i; j++) {
                    if (i % j == 0) {
                        flag++;
                    }
                }
                if (flag == 2) {
                    System.out.println(i);
                }
            }
        }
    }
}
