package chapter4;
import java.util.Scanner;

/* Назовем «длиной двузначного числа» разницу между числом десятков
(первая цифра) и числом единиц (вторая цифра).
Напишите класс, который принимает с клавиатуры двузначное число и
выводит на экран его «длину».
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое двузначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 10 * 10;
        int secondNumber = number % 10;
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }
}
