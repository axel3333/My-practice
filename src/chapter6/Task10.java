package chapter6;
import java.util.Scanner;

/* Напишите программу (класс), которая принимает с клавиатуры двузначное
число и проверяет, что больше: само это число или произведение его цифр.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        int result = firstNumber * secondNumber;
        if (number > result) {
            System.out.println("Число больше произведения своих чисел");
        } else if(number < result) {
            System.out.println("Произведение чисел больше самого числа");
        } else
            System.out.println("Число равно произведению своих чисел");
    }
}
