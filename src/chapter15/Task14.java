package chapter15;
import java.util.Scanner;

/*

 */

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 0, summ = 0;
        while (number % 10 != 0) {
            count++;
            int temp = number % 10;
            summ += temp;
            number = number / 10;
        }
        System.out.println("Всего - " + count);
        System.out.println("Сумма - " + summ);
    }
}
