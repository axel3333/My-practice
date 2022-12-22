package chapter4;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры положительное
четырехзначное число, а затем вычисляет и выводит на экран его «степень четности».
 */

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 1000;
        int secondNumber = (number - firstNumber * 1000) / 100;
        int thirdNumber = (number - (firstNumber * 1000 + secondNumber * 100)) / 10 ;
        int fouthNumber = number % 10;
        int y = 0;
        if (firstNumber % 2 == 0)
            y++;
        if (secondNumber % 2 == 0)
            y++;
        if (thirdNumber % 2 == 0)
            y++;
        if (fouthNumber % 2 == 0)
            y++;
        System.out.println("Степень четности - " + y);
    }
}
