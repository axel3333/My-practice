package chapter15;
import java.util.Scanner;

/*

 */

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int summ = 0;
        int numberSquared = number * number;
        while (numberSquared > summ) {
            for (int i = 1; i < number; i++) {
                int temp = number + i;
                System.out.print(temp + " ");
                summ += temp;
            }
        }
    }
}
