package chapter4;
import java.util.Scanner;

/* Назовем «сдвигом числа вправо по кругу» операцию, при которой все
цифры числа сдвигаются вправо, а число единиц (последняя цифра)
перемещается в старший разряд числа (первая цифра).
Например, из числа 1234 получается число 4123.
Напишите класс, который принимает с клавиатуры трехзначное число
и строит новое число, полученное «сдвигом вправо по кругу».
 */

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 100;
        int secondNumber = number % 100 / 10;
        int thirdNumber = number % 10;
        int result = thirdNumber * 100 + firstNumber * 10 + secondNumber;
        System.out.println(result);
    }
}
