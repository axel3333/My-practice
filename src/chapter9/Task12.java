package chapter9;
import java.util.Scanner;

/* Трехзначное число называется «поднимающимся», если оно составлено из цифр,
расположенных в порядке возрастания (наименьшая -
первая, наибольшая - последняя, все цифры разные; например - 123).
Напишите класс, который принимает с клавиатуры трехзначное число
и проверяет, является ли оно «поднимающимся». В соответствии с результатом
проверки надо вывести на экран соответствующее текстовое
сообщение.
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();
        int firstNumber = number / 100;
        int secondNumber = number / 10 % 10;
        int thirdNumber = number % 10;
        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Число является поднимающимся");
        } else System.out.println("Число не является поднимающимся");
    }
}
