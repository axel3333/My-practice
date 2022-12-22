package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое трехзначное
положительное число и изменяет его следующим образом:
• для чисел, больших 500, - переставляет местами числа единиц и
сотен (вместо 672 - 276);
• в остальных числах переставляются местами числа десятков и
единиц (вместо 363 - 336).
Программа должна вывести на экран новое значение переменной.
*/

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();
        int x1 = number / 100;
        int x2 = number % 100 / 10;
        int x3 = number % 10;
        int result;
        if (number > 500) {
            result = x3 * 100 + x2 * 10 + x1;
            System.out.println(result);
        } else {
            result = x1 * 100 + x3 * 10 + x2;
            System.out.println(result);
        }
    }
}
