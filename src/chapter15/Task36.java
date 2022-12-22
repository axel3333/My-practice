package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с
клавиатуры целое число и определяет,
является ли оно точным квадратом целого числа.
 */

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        double count = 1;
        int flag = 0;
        while (count < number / 2) {
            if (number / count == count) {
                System.out.println(number + " является точным квадратом целого числа " + (int) count);
                flag++;
            }
            count++;
        }
        if (flag == 0) {
            System.out.println("Число не является точным квадратом целого числа");
        }
    }
}
