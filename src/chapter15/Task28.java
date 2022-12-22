package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое число и подсчитывает
число цифр в нем (количество цифр в числе).
Результат подсчета должен быть выведен на экран. Например,
для числа 534 на экран будет выведено 3 цифры.
 */

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 0;
        while (number % 10 != 0) {
            count++;
            number /= 10;
        }
        if (count == 1) {
            System.out.println("Всего " + count + " цифра");
        }else if (count == 2 || count == 3 || count == 4) {
            System.out.println("Всего " + count + " цифры");
            }   else
            System.out.println("Всего " + count + " цифр");
    }
}
