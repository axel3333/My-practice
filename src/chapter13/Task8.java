package chapter13;
import java.util.Scanner;

/* Назовем «дважды делимым» целое положительное число, если и оно
само, и сумма его делителей - делятся (без остатка, разумеется) на
количество делителей числа.
Напишите класс, который принимает с клавиатуры целое положительное число и
проверяет, является ли оно· «дважды делимым».
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                count++;
                sum +=i;
            }
        }
        System.out.println("\nВсего делителей - " + count);
        System.out.println("Сумма делителей - " + sum);
        if (number % count == 0 && sum % count == 0) {
            System.out.println("Число дважды делимое");
        } else
            System.out.println("Число не является дважды делимым");
    }
}
