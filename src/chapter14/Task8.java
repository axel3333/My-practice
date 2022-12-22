package chapter14;

/* Напишите класс, который генерирует 15 целых положительных трехзначных чисел и
выводит на экран число, сумма цифр которого была
минимальной.
 */

public class Task8 {
    public static void main(String[] args) {
        int result = 0;
        int summ = 0;
        int maximumSumm = 0;
        int up = 100, down = 999;
        for (int i = 1; i <= 15; i++) {
            int number = (int) (Math.random() * (up - down) + down);
            System.out.print(number + " ");
            int first = number / 100;
            int second = number / 10 % 10;
            int third = number % 10;
            summ = first + second + third;
            if (summ > maximumSumm) {
                result = number;
                maximumSumm = summ;
            }
        }
        System.out.println("\nМаксимальная сумма - " + maximumSumm + " у числа " + result);
    }
}
