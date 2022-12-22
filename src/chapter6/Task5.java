package chapter6;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и, если
оно равно нулю, выводит на экран сообщение Ноль.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Ноль!");
        }
    }
}
