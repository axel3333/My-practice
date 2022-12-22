package chapter3;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и
выводит на экран (в одной строке) три следующих за ним целых числа так,
чтобы разница между каждым числом и следующим за ним составляла 2.
Например: для введенного с клавиатуры числа 6 надо вывести на экран числа 8, 10, 12.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        int b = a + 2;
        int c = b + 2;
        System.out.println(a + " " + b + " " + c);
    }
}
