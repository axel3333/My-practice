package chapter14;

/* Напишите класс, который генерирует 25 целых положительных трехзначных чисел
и выводит на экран порядковый номер числа, сумма
цифр которого была максимальной.
 */

public class Task10 {
    public static void main(String[] args) {
        int count = 1;
        int up = 999;
        int down = 100;
        int maximumCount = 0;
        int maximum = 0;
        int summ = 0;
        int maximumSumm = 0;
        for (int i = 1; i <= 24; i++) {
            int number = (int) (Math.random() * (up - down) + down);
            System.out.print(number + " ");
            int first = number / 100;
            int second = number / 10 % 10;
            int third = number % 10;
            summ = first + second + third;
            if (summ > maximumSumm) {
                maximum = number;
                maximumSumm = summ;
                maximumCount = count;
                count++;
            } else
                count++;
        }
        System.out.println("\nПорядковый номер самого большого числа - " + maximumCount);
        System.out.println("Самая большая сумма - " + maximumSumm);
        System.out.println("Само число - " + maximum);
        }
}
