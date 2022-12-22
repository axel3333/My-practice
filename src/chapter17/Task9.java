package chapter17;

/*
Напишите метод, который получает в качестве параметра два числа
(А и В) и выводит на экран все четные числа из диапазона А ... В.
 */

public class Task9 {
    public static String metod (int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sb.append(i + " ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(metod(12,57));
    }
}
