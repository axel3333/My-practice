package chapter11;

/* Напишите класс, который выводит на экран все целые трехзначные
числа (и положительные, и отрицательные), соответствующие следующему
требованию: эти числа делятся без остатка на сумму собственных цифр.
 */

public class Task42 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x1 = i / 100;
            int x2 = i / 10 % 10;
            int x3 = i % 10;
            if (i % (x1 + x2 + x3) == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
