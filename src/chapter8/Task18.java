package chapter8;
import java.util.Scanner;

/* Назовем «степенью четности» числа количество четных цифр в его составе
(например, степень четности для 2346 равна 3).
Напишите класс, который принимает с клавиатуры трехзначное положительное число и
определяет, какова его «степень четностю>. В соответствии с результатом проверки
надо вывести на экран соответствующее текстовое сообщение.
 */

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int x1 = number / 100;
        int x2 = number / 10 % 10;
        int x3 = number % 10;

        if (x1 % 2 == 0 && x2 % 2 == 0 && x3 % 2 == 0) {
            System.out.println("Степень четности равна трем");
        } else if ((x1 % 2 == 0 && x2 % 2 == 0) || (x1 % 2 == 0 && x3 % 2 == 0) || (x2 % 2 == 0 &&
                x3 % 2 == 0)) {
            System.out.println("Степень четности числа равна двум");
        } else if (x1 % 2 == 0 || x2 % 2 == 0 || x3 % 2 == 0) {
            System.out.println("Степень четности числа равна единице");
        }
    }
}
