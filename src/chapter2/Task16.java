package chapter2;

/* Напишите класс, который принимает с клавиатуры целое число и выводит
на экран два новых числа (каждое в отдельное строке): число,
больше введенного с клавиатуры на 6, и число, меньше введенного с
клавиатуры на 12.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(x + 6);
        System.out.println(x - 12);
    }
}
