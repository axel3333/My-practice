package chapter16;

/*
Напишите класс, который находит натуральное число от 1 до 10000 с
максимальной суммой делителей.
 */

public class Task12 {
    public static void main(String[] args) {
        int maxsumm = 0;
        int result = 0;
        int up = 10000;
        for (int i = 1; i <= 10000; i++) {
            int summ = 0;
            for (int j = 1; j <= 10000; j++) {
                if (i % j == 0) {
                    summ += j;
                }
            }
            if (summ > maxsumm) {
                maxsumm = summ;
                result = i;
            }
        }
        System.out.println("Сумма делителей " + maxsumm);
        System.out.println("Значение " + result);
    }
}
