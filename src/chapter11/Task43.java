package chapter11;

/* Напишите класс, который выводит на экран (в строку с пробелами) все
двузначные целые положительные числа, в которых и цифра единиц, и
цифра десятков делятся без остатка на три.
 */

public class Task43 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int x1 = i / 10;
            int x2 = i % 10;
            if (x1 % 3 == 0 && x2 % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
