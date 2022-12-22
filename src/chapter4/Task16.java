package chapter4;
import java.util.Scanner;

/*
Назовем «перестановкой» операцию над числом, при которой его первая и последняя цифры меняются местами. Например, из числа 1234
получается число 4231. Напишите программу, которая принимает с
клавиатуры трехзначное число и строит из него новое число методом
«перестановки».
 */

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 100;
        int secondNumber = (number - firstNumber * 100) / 10;
        int thirdNumber = number % 10;
        int result = (thirdNumber * 100) + (secondNumber * 10) + firstNumber;
        System.out.println(result);
    }
}
