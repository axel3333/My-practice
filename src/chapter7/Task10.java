package chapter7;
import java.util.Scanner;

/* Напишите программу, которая принимает с клавиатуры число и превращает его
в положительное, если оно отрицательное либо в ноль во
всех остальных случаях.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println(number * (-1));
        } else
            System.out.println(0);
    }
}
