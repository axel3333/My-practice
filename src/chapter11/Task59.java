package chapter11;

/* Напишите класс, который читает два целых положительных числа в
переменных А и В и проверяет, действительно ли А меньше, чем В.
Если да, - класс должен вывести на экран А последовательных чисел,
начиная с числа В, если нет, - класс должен вывести на экран В
последовательных чисел, начиная с числа А.
 */

import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое положительное число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое положительное число");
        int number2 = scanner.nextInt();
        int small = 0, big = 0;
        if (number1 < number2) {
            small = number1;
            big = number2;
        }else if (number1 > number2) {
            small = number2;
            big = number1;
        }
        for (int i = 0; i <= small - 1; i++) {
            System.out.print(big + i +" ");
        }
    }
}
