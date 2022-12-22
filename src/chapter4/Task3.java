package chapter4;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное
двузначное число и выводит на экран его цифры, разделенные
знаком «пробел», но в обратном порядке. То есть для числа 45 будет
выведено на экран 5 4.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        System.out.println(secondNumber + " " + firstNumber);
    }
}
