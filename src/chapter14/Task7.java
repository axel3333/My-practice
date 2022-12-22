package chapter14;

/* Напишите класс, который генерирует 20 целых положительных двузначных чисел и
выводит на экран число, сумма цифр которого была
максимальной.
 */

public class Task7 {
    public static void main(String[] args) {
        int maximum = 0;
        int maximumSumm = 0;
        for (int i = 1; i <= 20; i++) {
            int number = (int) (Math.random() * (100 - 10) + 10);
            System.out.print(number + " ");
            int first = number / 10;
            int second = number % 10;
            int summ = first + second;
            if (summ > maximumSumm) {
                maximum = number;
                maximumSumm = summ;
            }
        }
        System.out.println("Максимальная сумма - " + maximumSumm + " у числа " + maximum);
    }
}
