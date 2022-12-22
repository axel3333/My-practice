package chapter15;
import java.util.Scanner;

/*

 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое двузначное число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе двузначное число");
        int number2 = scanner.nextInt();
        int firstSumm = number1;
        int secondSumm = number2;
        while (number1 != number2) {
            System.out.println("Введите первое двузначное число");
            number1 = scanner.nextInt();
            System.out.println("Введите второе двузначное число");
            number2 = scanner.nextInt();
            firstSumm += number1;
            secondSumm += number2;
            System.out.println(firstSumm + " " + secondSumm);
        }
        System.out.println("Введены одинаковые числа");
    }
}
