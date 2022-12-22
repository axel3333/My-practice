package chapter6;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное число и,
если оно как минимум трехзначное и положительное,
уменьшает его на 1.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if(number > 99) {
            number--;
        }
        System.out.println(number);
    }
}
