package chapter4;
import java.util.Scanner;

/*
Назовем «весом числа>> сумму его цифр.
Напишите класс, который принимает с клавиатуры число (двузначное)
и выводит на экран его «вес».
 */

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое двузначное число: ");
        int number = scan.nextInt();
        int secondNumber = number % 10;
        int firstNumber = number / 10;
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }
}
