package chapter11;

/* Напишите класс, который принимает с клавиатуры целое число и выводит
на экран 25 последующих ему нечетных чисел.

 */

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        System.out.println("Начало");
        for (int i = 1; i <=50; i++) {
            if ((number + i) % 2 != 0 ){
                System.out.print(number + i + " ");
            }
        }
        System.out.println("\nКонец");
    }
}
