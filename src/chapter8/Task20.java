package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры трехзначное положительное число и
проверяет, содержится ли в нем хотя бы один ноль.
По результатам проверки надо вывести на экран соответствующее текстовое сообщение.
 */

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();
        int x1 = number / 100;
        int x2 = number / 10 % 10;
        int x3 = number % 10;
        if (x1 == 0 || x2 == 0 || x3 == 0) {
            System.out.println("Число содержит цифру 0");
        } else
            System.out.println(" Цифры 0 в числе нет");
    }
}
