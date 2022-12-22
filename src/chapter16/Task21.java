package chapter16;

/*
Напишите класс, который читает с клавиатуры целые положительные
числа и для каждого числа выводит на экран: число цифр в числе, сумму
цифр числа и число делителей введенного числа. Класс также должен
подсчитать и вывести на экран общую сумму всех цифр введенных чисел.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summOfNumbers = 0;
        while (true){
            System.out.println("Введите целое положительное число");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            summOfNumbers += number;
            int count = 0;
            int summ = 0;
            int temp = number;
            while (temp % 10 != 0) {
                count++;
                summ += temp % 10;
                temp = temp / 10;
            }
            System.out.println("Число цифр в числе - " + count);
            System.out.println("Сумма цифр числа - " + summ);
            int numberOfDivisiors = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    numberOfDivisiors++;
                }
            }
            System.out.println("Число делителей - " + numberOfDivisiors);
        }
        System.out.println("Общая сумма всех введенных чисел - " + summOfNumbers);
    }
}
