package chapter13;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры три целых числа и
проверяет, являются ли они тремя последовательными членами арифметической прогрессии.
В случае если являются, класс должен вывести на экран еще 14 следующих членов этой же
прогрессии; в ином случае - вывести на экран
соответствующее текстовое сообщение.
 */

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = scanner.nextInt();
        if (number3 - number2 == number2 - number1) {
            for (int i = 1; i <= 14; i++) {
                System.out.print(number3 + ((number3 - number2) * i) + " ");
            }
        } else
            System.out.println("Арифметической прогрессии нет");
    }
}
