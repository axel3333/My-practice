package chapter4;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное
трехзначное число и выводит на экран его цифры, разделенные
знаком «пробел», но в обратном порядке. То есть для числа 415 будет
выведено на экран 5 1 4.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 100;
        int secondNumber = (number - firstNumber * 100) / 10;
        int thirdNumber = (number - firstNumber * 100) % 10;
        System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
    }
}
