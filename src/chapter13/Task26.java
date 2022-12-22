package chapter13;

/* Напишите класс, который создает серию из 15 случайных чисел из
диапазона -30 ... + 30.
Класс будет выводить на экран только те числа серии, которые имеют
такой же знак, как и предшествующее им число (значение О считать
положительным для данного задания).
 */

public class Task26 {
    public static void main(String[] args) {
        int down = -30, up = 30;
        int temp = 0;
        for (int i = 1; i <= 15; i++) {
        int number = (int) (Math.random() * (up - down) + down);
        if (i == 1) {
            temp = number;
            System.out.println(temp);
        }
        if (number >= 0 && temp >= 0) {
            System.out.println( temp + " " + number);
            temp = number;
        } else if (number < 0 && temp < 0) {
            System.out.println(temp + " " + number);
            temp = number;
        } else
            temp = number;
        }
    }
}
