package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и
выводит на экран число, которое больше введенного с клавиатуры на 10.
 */

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(x + 10);

    }
}
