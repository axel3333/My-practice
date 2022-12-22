package chapter9;
import java.util.Scanner;

/* Назовем билет с шестизначным номером «счастливым», если сумма
первых трех его цифр равна сумме последних трех его цифр и обе эти
суммы являются четными.
Напишите класс, который принимает с клавиатуры шестизначный номер билета
и проверяет, является ли он «счастливым» или не является.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число");
        int number = scanner.nextInt();
        int number1 = number / 1000;
        int number2 = number % 1000;
        int x1 = number1 / 100;
        int x2 = number1 / 10 % 10;
        int x3 = number1 % 10;
        int x4 = number2 / 100;
        int x5 = number2 / 10 % 10;
        int x6 = number2 % 10;
        int summOfNumber1 = x1 + x2 + x3;
        int summOfNumber2 = x4 + x5 + x6;
        if (summOfNumber1 == summOfNumber2 && summOfNumber1 % 2 == 0 && summOfNumber2 % 2 == 0) {
            System.out.println("Билет счастливый!");
        } else
            System.out.println("Билет не счастливый");
    }
}
