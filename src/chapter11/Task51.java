package chapter11;

/* Напишите класс, который принимает с клавиатуры целое положительное
число N и выводит на экран серию 1+2+3+ ... +N, то есть серию целых
положительных последовательных чисел, начиная с 1 и до введенного с
клавиатуры значения (числа при выводе на экран должны разделяться знаком + ).
 */

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            System.out.print(i + "+");
        }
        System.out.print(number);
    }
}
