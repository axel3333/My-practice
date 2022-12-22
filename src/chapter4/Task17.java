package chapter4;
import java.util.Scanner;

// Напишите программу, которая выполняет перестановку над четырехзначным числом.

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 1000;
        int secondNumber = (number - firstNumber * 1000) / 100;
        int thirdNumber = (number - (firstNumber * 1000 + secondNumber * 100)) / 10;
        int fouthNumber = number % 10;
        int result = fouthNumber * 1000 + secondNumber * 100 + thirdNumber * 10 + firstNumber;
        System.out.println(result);
    }
}
