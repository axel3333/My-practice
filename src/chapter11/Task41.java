package chapter11;

/* Напишите класс, который выводит на экран целые положительные
трехзначные числа, составленные целиком из четных цифр.
 */

public class Task41 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x1 = i / 100;
            int x2 = i / 10 % 10;
            int x3 = i % 10;
            if (x1 % 2 == 0 && x2 % 2 == 0 && x3 % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
