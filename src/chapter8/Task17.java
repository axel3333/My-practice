package chapter8;
import java.util.Scanner;

/* Трехзначное число называется «дважды четным», если и оно само, и сумма его цифр - четные.
Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет,
является ли оно «дважды четным». В соответствии с результатом проверки надо вывести на экран
соответствующее текстовое сообщение. Обратите внимание: задание имеет решение с использованием
единственного оператора if- без составного условия!
*/

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int x1 = number / 100;
        int x2 = number / 10 % 10;
        int x3 = number % 10;
        int result = x1 + x2 + x3;
        if (number % 2 == 0 && result % 2 == 0) {
            System.out.println("Число является дважды четным");
        } else
            System.out.println("Число не является дважды четным");
    }
}
