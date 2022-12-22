package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное
число и находит его наибольший делитель, отличный от самого числа.
 */

public class Task40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        int count = number - 1;
        while (true) {
            if (number % count == 0) {
                System.out.println(count);
                break;
            }
            count--;
        }
    }
}
