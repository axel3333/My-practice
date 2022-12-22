package chapter13;
import java.util.Scanner;

/* Определим как «удивительное» целое положительное число Х, для которого
выполняется следующее условие: сумма всех целых положительных чисел, меньших Х
и являющихся делителями Х, равно Х.
Например, число 28 является «удивительным», потому что
1+2+4 + 7 + 14 = 28.
Напишите класс, который принимает в качестве параметра целое
положительное число, проверяет, является ли оно «удивительным», и
выводит на экран соответствующее текстовое сообщение.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nСумма всех делителей равна - " + sum);
        if (number == sum) {
            System.out.println("Число является \"удивительным\"");
        }
        if (number != sum) {
            System.out.println("Число не является \"удивительным\"");
        }
    }
}
