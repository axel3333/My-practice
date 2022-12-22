package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры оценку ученика
(целое число) и проверяет, не является ли введенное значение ошибочным.
На экран должно выводиться соответствующее текстовое сообщение.
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку ученика: ");
        int number = scanner.nextInt();
        if (number >= 0 || number < 5) {
            System.out.println(number);
        } else
            System.out.println("некорректное значение");
    }
}
