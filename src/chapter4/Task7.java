package chapter4;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное двузначное число.
Затем следует построить новое значение, составленное из цифр числа, введенного с клавиатуры,
но в обратном порядке. После этого новое значение следует увеличить на 8, и окончательный
результат вывести на экран. То есть для числа 37 следует построить число 73 и вывести на экран 81.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 10;
        int secondNumber = number % 10 * 10;
        int result = firstNumber + secondNumber + 8;
        System.out.println(result);

    }
}
