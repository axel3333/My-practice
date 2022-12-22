package chapter12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number1 = 0;
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.println("Введите целое число");
                number1 = scanner.nextInt();
            } else {
                System.out.println("Введите целое число");
                int number2 = scanner.nextInt();
                if (number2 > number1) {
                    count++;
                }
            }
        }
        System.out.println("Бсего чисел, которые больше первого числа - " + count);
    }
}
