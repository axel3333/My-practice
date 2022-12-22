package chapter16;

/*
Напишите класс, который выводит на экран все положительные четные двузначные числа,
сумма делителей которых тоже является четным числом.
 */

public class Task16 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i = i + 2){
            int summ = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0) {
                    summ += j;
                }
            }
            if ( summ % 2 == 0) {
                System.out.println(i + " " + summ);
            }
        }
    }
}
