package chapter4;
import java.util.Scanner;

/* Назовем «степенью четности» числа количество четных цифр в нем.
Например, для числа 4612 степень четности равна 3 (в его составе три четных цифры - 4, 6 и 2).
Напишите класс, который принимает с клавиатуры положительное
двузначное число, а затем вычисляет и выводит на экран его «степень
четности».
 */

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое двузначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        int y = 0;
        if (firstNumber % 2 == 0)
            y++;
        if (secondNumber % 2 == 0)
            y++;
        System.out.println("Степень четности - " + y);
    }
}
