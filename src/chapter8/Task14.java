package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры двузначное
положительное число и проверяет, является ли в нем первая цифра
(десятков) больше второй (единиц). В соответствии с результатом проверки
надо вывести на экран соответствующее текстовое сообщение.
 */

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int number = scanner.nextInt();
        int x1 = number / 10;
        int x2 = number % 10;
        if (x1 > x2) {
            System.out.println("Первое число больше второго");
        } else if (x1 < x2) {
            System.out.println("Второе число больше первого");
        }
    }
}
