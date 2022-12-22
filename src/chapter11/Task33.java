package chapter11;

/* Напишите класс, который выводит на экран положительные трехзначные числа,
делящиеся без остатка на 11 (начиная с наименьшего).

 */

public class Task33 {
    public static void main(String[] args) {
        for (int i = 110; i < 1000; i +=11) {
            System.out.print(i + " ");
        }
    }
}
