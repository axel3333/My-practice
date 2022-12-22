package chapter17;

/*
Напишите метод, который принимает в качестве параметра целое положительное число N.
Метод возвращает общее количество делителей
для всех чисел из диапазона N ... 2N.
 */

public class Task29 {
    public static int numberOfDivisors (int a) {
        int count = 0;
        for (int i = a; i <= a * 2; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(5));
    }
}
