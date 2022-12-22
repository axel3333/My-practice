package chapter17;

/*
Напишите метод, который принимает в качестве параметра целое положительное число N.
Метод возвращает количество простых чисел,
находящихся в диапазоне 1 ... N.
 */

public class Task25 {
    public static int numberOfPrimeNumbers (int a) {
        int count;
        int primeNumbers = 0;
        for (int i = 1; i <= a; i++) {
            count = 0;
            for (int j = 1; j <= a; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumbers++;
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        System.out.println("Количество простых чисел в заданном диапазоне равно "
        + numberOfPrimeNumbers(35));
    }
}
