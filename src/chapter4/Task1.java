package chapter4;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное двузначное
число и выводит на экран его цифры, разделенные
знаком «пробел».
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        System.out.println(firstNumber + " " + secondNumber);
    }
}
