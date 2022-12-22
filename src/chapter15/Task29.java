package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое число и подсчитывает сумму его цифр.
Результат подсчета должен быть выведен на экран. Например, для числа 534 на экран будет выведено 12.
 */

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int summ = 0;
        while (number % 10 != 0) {
            summ += number % 10;
            number /= 10;
        }
        System.out.println(summ);
    }
}
