package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры двузначное положительное
число и проверяет, составлено ли оно из одинаковых цифр.
В соответствии с результатом проверки надо вывести на экран
соответствующее текстовое сообщение.
 */

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int number = scanner.nextInt();
        if (number % 11 == 0 ) {
            System.out.println("Число составлено из одинаковых чисел");
        } else
            System.out.println("Число составлено из разных чисел");
    }
}
