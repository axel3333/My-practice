package chapter4;
import java.util.Scanner;

/* Назовем «весом числа>> сумму· его цифр.
Напишите класс, который принимает с клавиатуры число (трехзначное) и выводит на экран его «вес».
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 100;
        int secondNumber = (number - firstNumber * 100) / 10;
        int thirdNumber = number % 10;
        int result = firstNumber + secondNumber + thirdNumber;
        System.out.println(result);
    }
}
