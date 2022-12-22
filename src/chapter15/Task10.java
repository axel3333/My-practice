package chapter15;
import java.util.Scanner;

/*

 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.println("Введите вычитаемое число");
            int temp = scanner.nextInt();
            number -= temp;
        }
        System.out.println("Число " + number + " меньше нуля");
    }
}
