package chapter9;
import java.util.Scanner;

/* Трехзначное число называется «плоским», если оно составлено из одинаковых цифр.
Напишите класс, который принимает с клавиатуры
трехзначное число и проверяет, является ли оно «плоским». В соответствии с результатом
проверки надо вывести на экран соответствующее
текстовое сообщение.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();
        if (number % 111 == 0) {
            System.out.println("Число является плоским");
        } else {
            System.out.println("Число не является плоским");
        }
    }
}
