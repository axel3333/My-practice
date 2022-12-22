package chapter15;

import java.util.Scanner;

/*
Напишите класс, который вводит с клавиатуры 15 целых положительных чисел,
для каждого введенного числа класс должен напечатать
сумму его цифр.
После окончания ввода класс выведет на экран порядковый номер
числа с самой большой суммой цифр.
 */

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        int count = 0;
        int maxSumm = 0;
        int maxCount = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            count++;
            while (number % 10 != 0) {
                int temp = number % 10;
                summ += temp;
                number = number / 10;
            }
            if (summ > maxSumm) {
                maxSumm = summ;
                maxCount = count;
            }
            System.out.println("Сумма - " + summ);
            summ = 0;
        }
        System.out.println("Максимальная сумма - " + maxSumm
                + " у числа с порядковым номером " + maxCount );
    }
}
