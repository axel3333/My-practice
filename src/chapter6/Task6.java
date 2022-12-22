package chapter6;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и
выводит на экран одно из следующих сообщений: Положительное, или
Отрицательное, или Ноль, - в зависимости от значения числа.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        while (true) {
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Число положительное");
            } else if (number == 0) {
                System.out.println("Ноль");
            } else {
                System.out.println("Отрицательное число");
            }
        }
    }
}
