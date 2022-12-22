package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное
число и строит из него число с обратным порядком цифр.
Новое значение следует вывести на экран.
 */

public class Task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 0;
        double result = 0;
        while (number % 10 != 0) {
            count++;
            int temp = number % 10;
            result += temp / Math.pow(10, count);
            number /= 10;
            }
        System.out.println((int) (result * Math.pow(10, count)));
    }
}
