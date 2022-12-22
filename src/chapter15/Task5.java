package chapter15;
import java.util.Scanner;

/*

 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 1;
        while (number != 999) {
            count++;
            System.out.println("Введите число");
            number = scanner.nextInt();
        }
        System.out.println("Всего было введено чисел - " + count);
    }
}
