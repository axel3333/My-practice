package chapter4;
import java.util.Scanner;

/*Назовем «степенью четности» числа количество четных цифр в нем.
Напишите класс, который принимает с клавиатуры положительное
трехзначное число, а затем вычисляет и выводит на экран его «степень
четности».
 */

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 100;
        int secondNumber = (number - firstNumber * 100) / 10;
        int thirdNumber = number % 10;
        int y = 0;
        if (firstNumber % 2 == 0)
            y++;
        if (secondNumber % 2 == 0)
            y++;
        if (thirdNumber % 2 == 0)
            y++;
        System.out.println("Степень четности - " + y);
    }
}
