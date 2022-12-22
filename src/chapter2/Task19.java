package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и выводит
на экран следующие три значения (все - в одной строке, разделенные пробелом):
число, меньше введенного с клавиатуры на 1, число, введенное с клавиатуры, и
число, больше введенного с клавиатуры на 1.
 */

public class Task19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println((x - 1) + " " + x + " " + (x + 1));
    }
}
