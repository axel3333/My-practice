package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает в качестве параметров два целых
положительных числа и выводит на экран с дополнительным сообщением то из них,
у которого наибольшая последняя цифра (число единиц). Если такого числа нет,
класс должен вывести на экран соответствующее сообщение.
 */

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int number2 = scanner.nextInt();
        if (number1 % 10 > number2 % 10) {
            System.out.println("Последняя цифра больше у первого числа");
        } else if (number1 % 10 < number2 % 10) {
            System.out.println("Последняя цифра больше у второго числа");
        } else
            System.out.println("Последние цифры равны");
    }
}
