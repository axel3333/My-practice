package chapter15;
import java.util.Scanner;

/*

 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int temp = number + 1;
        int summ = number;
        while (number != temp) {
            temp = number;
            System.out.println("Введите число");
            number = scanner.nextInt();
            if (number == temp) {
                continue;
            }
            summ += number;
            System.out.println("Сумма - " + summ);
        }
        System.out.println("Сумма - " + summ);
    }
}
