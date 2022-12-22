package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое число и выводит
на экран все числа, которые можно получить из введенного за
счет «стирания последней цифры». Например, для введенного числа
52435 будут выведены на экран 5243, 524, 52, 5, О.
 */

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        while (number % 10 != 0) {
            System.out.println(number / 10);
            number = number / 10;
        }
    }
}
