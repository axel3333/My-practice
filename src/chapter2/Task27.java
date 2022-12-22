package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число,
представляющее собой массу тела в граммах, и выводящую на экран массу
этого тела в килограммах.
 */

public class Task27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите массу тела в граммах: ");
        int x = scan.nextInt();
        System.out.println("Масса тела в килограммах: " + (x / 1000) + "," + (x % 1000 / 100));
    }
}
