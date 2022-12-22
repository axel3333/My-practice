package chapter15;
import java.util.Scanner;

/*
Наибольший общий делитель (НОД) двух целых положительных чисел можно определить
по алгоритму Евклида: НОД чисел а, Ь равен
НОД меньшего из чисел и остатка от деления большего числа на
меньшее.
Напишите класс, который принимает с клавиатуры два целых положительных
числа и определяет их НОД описанным методом.
 */

public class Task44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        int big = 0, small = 0;
        int remain = 0;
        int count = 0;
        if (first > second) {
            big = first;
            small = second;
        }
        if (first < second) {
            big = second;
            small = first;
        }
        if (big % small == 0) {
            remain = small;
        }
        while (big % small != 0) {
            remain = big % small;
            big = small;
            small = remain;
        }
        System.out.println(remain);
    }
}
