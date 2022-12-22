package chapter15;
import java.util.Scanner;

/*

 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 0;
        int summ = 0;
        while (number != 999) {
            count++;
            summ += number;
            System.out.println("Введите число");
            number = scanner.nextInt();
        }
        System.out.println("Всего было введено чисел - " + count);
        System.out.println("Сумма чисел составляет - " + summ);
    }
}
