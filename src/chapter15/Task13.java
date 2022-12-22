package chapter15;
import java.util.Scanner;

/*

 */

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int temp = 0;
        int count = 0;
        while (number > temp) {
            temp = number;
            System.out.println("Введите число");
            number = scanner.nextInt();
            count++;
            number +=1;
        }
        System.out.println(count);
    }
}
