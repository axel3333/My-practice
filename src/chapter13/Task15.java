package chapter13;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры двузначное
положительное целое число Х, составленное из разных цифр, и возвращает
сумму однозначных чисел, заключенных между цифрами этого числа Х
(включая сами цифры, из которых составлено число Х).
Например, и для числа 52, и для числа 25 будет возвращено значение
14 (2 + 3 + 4 + 5 = 14).
 */

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое двузначное число");
        int number = scanner.nextInt();
        int x1 = number / 10;
        int x2 = number % 10;
        int up = 0, down = 0;
        if (x1 > x2) {
            up = x1;
            down = x2;
        }
        if (x1 < x2) {
            up = x2;
            down = x1;
        }
        int sum = 0;
        for (int i = down; i <= up; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел равна - " + sum);
    }
}
