package chapter15;
import java.util.Scanner;

/*
Напишите класс, который вводит с клавиатуры 15 целых положительных чисел,
для каждого введенного числа класс напечатает сумму его цифр.
 */

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            while (number % 10 != 0) {
                int temp = number % 10;
                summ += temp;
                number = number / 10;
            }
            System.out.println("Сумма - " + summ);
            summ = 0;
        }
    }
}
