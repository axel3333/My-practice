package chapter3;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и
выводит на экран три предыдущих ему целых числа, причем каждое - в
отдельной строке.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        int b = a - 1;
        int c = b - 1;
        int d = c - 1;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }
}
