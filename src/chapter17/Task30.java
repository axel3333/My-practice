package chapter17;

/*
Напишите метод, который принимает в качестве параметра два целых
положительных числа (N и М, можно исходить из предположения, что
M>N). Метод возвращает, имеющее самое большое число делителей,
число из диапазона N ... М.
 */

public class Task30 {
    public static int maxNumberOfDivisors (int a, int b) {
        int count;
        int max = 0;
        int maxNumber = 0;
        for (int i = a; i <= b; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfDivisors(13, 31));
    }
}
