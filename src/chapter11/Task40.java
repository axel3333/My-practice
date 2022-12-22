package chapter11;

/* Напишите класс, который выводит на экран все целые положительные
трехзначные числа, соответствующие следующему требованию: произведение
первой и последней цифр равно квадрату средней.
 */

public class Task40 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x1 = i / 100;
            int x2 = i / 10 % 10;
            int x3 = i % 10;
            if (x1 * x3 == x2 * x2) {
                System.out.println(i + " ");
            }
        }
    }
}
