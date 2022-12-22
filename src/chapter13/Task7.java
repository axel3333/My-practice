package chapter13;
import java.util.Scanner;

/* Назовем «дважды четным» целое положительное число, если и оно само,
и сумма его делителей - четные числа.
Напишите класс, который принимает с клавиатуры целое положительное число и
проверяет, является ли оно «дважды четным».
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("Сумма всех делителей равна - " + sum);
        if (number % 2 ==0 && sum % 2 == 0) {
            System.out.println("Число дважды четное");
        } else
            System.out.println("Число не является дважды четным");
    }
}
