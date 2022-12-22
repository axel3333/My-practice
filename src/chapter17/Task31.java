package chapter17;

/*
Напишите метод, который принимает в качестве параметра два целых
положительных числа (N и М, можно исходить из предположения, что
M>N). Метод возвращает, имеющее самую большую сумму делителей,
число из диапазона N ... М.
 */

public class Task31 {
    public static int sunOfDivisors (int a, int b) {
        int summ;
        int maxSumm = 0;
        int maxNumber = 0;
        for (int i = a; i <= b; i++) {
            summ = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    summ += j;
                }
            }
            if (summ > maxSumm) {
                maxSumm = summ;
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(sunOfDivisors(10, 29));
    }
}
