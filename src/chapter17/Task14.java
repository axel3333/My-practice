package chapter17;

/*
Напишите метод, который принимает в качестве параметра два целых
числа и возвращает среднее арифметическое сумм цифр в этих числах.
 */

public class Task14 {
    public static int sumOfNumbers (int a) {
        int summ = 0;
        int count = 0;
        while(true) {
            if (a == 0) {
                break;
            }
            summ += a % 10;
            a = a / 10;
            count++;
        }
        return summ / count;
    }
    public static int arifhmeticMean (int a, int b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(78771));
        System.out.println(sumOfNumbers(1245));
        System.out.println(arifhmeticMean(sumOfNumbers(78771),sumOfNumbers(1245) ));
    }
}
