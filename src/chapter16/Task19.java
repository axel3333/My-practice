package chapter16;

/*
Напишите класс, который выводит на экран все трехзначные числа,
для которых соблюдаются два условия:
• само число заканчивается на О;
• сумма нечетных делителей этого числа тоже заканчивается на О.
 */

public class Task19 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i = i + 10) {
            int summ = 0;
            for (int j = 1; j < i; j = j + 2) {
                if (i % j == 0) {
                    summ += j;
                }
            }
            if (summ % 10 == 0) {
                System.out.println("Сумма " + summ + " число " + i);
            }
        }
    }
}
