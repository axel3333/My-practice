package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое число и подсчитывает количество нулей в этом числе.
Результат подсчета надо вывести на экран.
 */

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 0;
        while (number > 0) {
            int temp = number % 10;
            if (temp == 0) {
                count++;
            }
            number /= 10;
        }
        System.out.println(count);
    }
}
