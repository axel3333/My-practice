package chapter12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i <=10; i++) {
            System.out.println("Введите целое число");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("Всего положительных чисел " + count);
    }
}
