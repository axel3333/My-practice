package chapter11;

/* Напишите класс, который принимает с клавиатуры целое число, а затем генерирует 15
случайных чисел из диапазона положительных трехзначных чисел.
Для тех сгенерированных чисел, которые делятся на введенное с клавиатуры значение,
следует вывести на экран округленный в большую сторону квадратный корень из первой
цифры (число сотен), для остальных - округленный в меньшую сторону квадратный корень из
второй цифры (число десятков).
 */

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int down = 100, up = 999;
        for (int i = 1; i <= 15; i++) {
            int x = (int) (down + (up - down + 1) * Math.random());
            if (x % number == 0) {
                int firstNumber = x / 100;
                int result = (int)Math.ceil(Math.sqrt(firstNumber));
                System.out.println(x + " " + result);
            } else {
                int secondNumber = x / 10 % 10;
                int result = (int)Math.floor(Math.sqrt(secondNumber));
                System.out.println(x + " " + result);
            }
        }
        System.out.println("\nКонец");
    }
}
