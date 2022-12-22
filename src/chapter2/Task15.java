package chapter2;

/* Напишите класс, который принимает с клавиатуры целое число и выводит
на экран новое число, которое больше введенного с клавиатуры в 10 раз.
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(x * 10);

    }
}