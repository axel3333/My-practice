package chapter11;

/* Напишите класс, который принимает с клавиатуры целое число и
выводит на экран 10 предшествующих ему чисел, причем разница между
значениями этих чисел должна быть равна 6.
 */

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        System.out.println("Начало");
        int difference = 6;
        for (int i = 1; i <= 10; i++){
            int result = number - (i * difference);
            System.out.print(result + " ");
        }
        System.out.println("\nКонец");
    }
}
