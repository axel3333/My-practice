package chapter8;
import java.util.Scanner;

/* Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы.
Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет,
является ли оно «симметричным». В соответствии с результатом проверки надо вывести на
экран соответствующее текстовое сообщение.
 */

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();
        int x1 = number / 100;
        int x3 = number % 10;
        if (x1 == x3) {
            System.out.println("Введенное число является симметричным");
        } else  {
            System.out.println("Число не является симметричным");
        }
    }
}
