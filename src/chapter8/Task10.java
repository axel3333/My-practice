package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и выводит
на экран его квадрат, но только в случае, если введенное число
отрицательно. В противном случае - на экран выводится сообщение
Ошибка.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println(number * number);
        } else
            System.out.println("Ошибка");
    }
}
