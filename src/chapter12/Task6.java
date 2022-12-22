package chapter12;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и проверяет,
на какое количество двузначных чисел оно делится.
Результат проверки класс должен вывести на экран вместе с соответствующим текстовым сообщением.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (number % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Всего двузначных чисел - " + count);
    }
}
