package chapter7;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры три числа: два первых
должны быть длинами сторон катетов прямоугольного треугольника, а третье -
длиной гипотенузы. Программа должна проверить,
соответствуют ли введенные значения этому требованию.
Внимание: допустимо предположить, что все вводимые чиО1а - положительные.
 */

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первого катета: ");
        int a = scanner.nextInt();
        System.out.println("Введите длину второго катета: ");
        int b = scanner.nextInt();
        System.out.println("Введите длину гипотенузы: ");
        int c = scanner.nextInt();
        if (c * c == a * a + b * b) {
            System.out.println("Данные введены правильно");
        } else
            System.out.println("Данные некорректны!");
    }
}
