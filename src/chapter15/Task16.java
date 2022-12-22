package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое число и выводит
на экран количество четных цифр в нем и сумму его нечетных цифр.
 */

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 0, summ = 0;
        while (number % 10 != 0) {
            int temp = number % 10;
            if (temp % 2 != 0) {
                count++;
                summ += temp;
                number = number / 10;
            } else {
                number = number / 10;
            }
        }
        System.out.println("Всего - " + count);
        System.out.println("Сумма - " + summ);
    }
}
