package chapter17;

/*
Назовем «большим обменом» операцию, при которой два числа «обмениваются» своими левыми цифрами.
1. Напишите класс, который принимает с клавиатуры два трехзначных
положительных числа и совершает над ними операцию «обмена».
2. Напишите класс, который принимает с клавиатуры два целых положительных числа и совершает
над ними операцию «обмена».
 */

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        exchangingNumbers2();
    }
    public static void exchangingNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое трехзначное число");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе целое трехначное число");
        int x2 = scanner.nextInt();
        int x1First = x1 / 100;
        int newx2 = x1First * 100 + x2 % 100;
        int x2First = x2 / 100;
        int newx1 = x2First * 100 + x1 % 100;
        System.out.println(newx1 + " " + newx2);
    }

    public static int firstNumber(int a) {
        int result = 0;
        while (true) {
            if (a < 10) {
                result = a;
                break;
            }
            a = a / 10;
        }
        return result;
    }

    public static int countNumbers(int a) {
        int count = 0;
        while(true) {
            if (a == 0) {
                break;
            }
            count++;
            a = a / 10;
        }
        return count;
    }

    public static void exchangingNumbers2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int x2 = scanner.nextInt();
        int x1First = firstNumber(x1);
        int x2First = firstNumber(x2);
        int x1Count = countNumbers(x1);
        int x2Count = countNumbers(x2);
        int newX1 = (int) (x2First * Math.pow(10, x1Count-1) + x1 % Math.pow(10, x1Count-1));
        int newX2 = (int) (x1First * Math.pow(10, x2Count-1) + x2 % Math.pow(10, x2Count-1));
        System.out.println(newX1 + " " + newX2);
    }
}
