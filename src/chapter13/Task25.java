package chapter13;

/* Напишите класс, который создает серию из 25 случайных чисел из
диапазона 10 ... 99.
Класс будет выводить на экран только те числа серии, которые делятся
без остатка на первое число в серии.
 */

public class Task25 {
    public static void main(String[] args) {
        int up = 99, down = 10;
        int first = 0;
        for (int i = 1; i <= 25; i++) {
            int number = (int) (Math.random() * (up - down) + down);
            if (i == 1) {
                first = number;
                System.out.println(first);
            }
            if (number % first == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
