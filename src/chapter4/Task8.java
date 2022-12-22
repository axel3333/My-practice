package chapter4;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное трехзначное число.
Затем следует построить новое значение, составленное из цифр числа, введенного с клавиатуры,
но в обратном порядке. После этого новое значение следует уменьшить на 20, и окончательный
результат вывести на экран. То есть для числа 327 следует построить число 723 и
вывести на экран 703.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое положительное трехзначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 100;
        int secondNumber = (number - (firstNumber * 100)) / 10 * 10;
        int thirdNumber = number % 10 * 100;
        int result = firstNumber + secondNumber + thirdNumber - 20;
        System.out.println(result);
    }
}
