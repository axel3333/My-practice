package chapter9;
import java.util.Scanner;

/* Трехзначное число называется «опускающимся», если оно составлено
из цифр, расположенных в порядке убывания (наибольшая - первая,
наименьшая - последняя, все цифры разные; например, - 321).
Напишите класс, который принимает с клавиатуры трехзначное число
и проверяет, является ли оно «опускающимся». В соответствии с результатом
проверки надо вывести на экран соответствующее текстовое сообщение.
 */

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();
        int firstNumber = number / 100;
        int secondNumber = number / 10 % 10;
        int thirdNumber = number % 10;
        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Число является опускающимся");
        } else System.out.println("Число не является опускающимся");
    }
}
