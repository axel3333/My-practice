package chapter6;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых числа и,
если оба имеют одинаковый знак, на экран выводится сообщение
Один и тот же знак, а если разный, то на экран выводится сообщение
Разные знаки. Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        if ((number1 > 0 && number2 > 0) || (number1 < 0 && number2 < 0)) {
            System.out.println("Один и тот же знак");
        } else if ((number1 > 0 && number2 < 0) || (number1 < 0 && number2 > 0)) {
            System.out.println("Разные знаки");
        } else {
            System.out.println("Некорректно");
        }
    }
}
