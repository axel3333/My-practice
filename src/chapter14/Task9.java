package chapter14;

/* Напишите класс, который генерирует 24 целых трехзначных положительных числа
и выводит на экран порядковый номер самого большого
из сгенерированных чисел.
 */

public class Task9 {
    public static void main(String[] args) {
        int count = 0;
        int up = 999;
        int down = 100;
        int maximumCount = 0;
        int maximum = 0;
        for (int i = 1; i <= 24; i++) {
            int number = (int) (Math.random() * (up - down) + down);
            System.out.print(number + " ");
            if (number > maximum) {
                maximum = number;
                maximumCount = count;
                count++;
            } else
                count++;
        }
        System.out.println("\nПорядковый номер самого большого числа - " + maximumCount);
        System.out.println("Самое большое число - " + maximum);
    }
}
