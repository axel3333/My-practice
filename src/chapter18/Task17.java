package chapter18;

/*
Напишите класс, который заполняет случайными трехзначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом: в каждой строке выводится значения из двух ячеек,
симметрично расположенных по отношению к середине массива.
В случае если массив имеет нечетный размер, центральную ячейку
следует выводить в отдельной строке.
Например, массив 345, 455, 677, 175, 985 выводится на экран следующим образом:
345 и 985
455и175
677
 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner.nextInt();
        int[] mass = new int[x];
        int down = 100, up = 999;
        for (int i = 0; i < x; i++) {
            int temp = (int) (Math.random() * ((up - down) + 1) + down);
            mass[i] = temp;
        }
        print (x, mass);

    }
    public static void print (int x, int []mass) {
        if (x % 2 != 0) {
            for (int i = 0; i <= x / 2; i++) {
                if (i == (x - 1) - i) {
                    System.out.println(mass[i]);
                    break;
                }
                System.out.println(mass[i] + " и " + mass[(x - 1) - i]);
            }
        }
        if (x % 2 == 0) {
            for (int i = 0; i < x / 2; i++) {
                if (i == (x - 1) - i) {
                    System.out.println(mass[i]);
                    break;
                }
                System.out.println(mass[i] + " и " + mass[(x - 1) - i]);
            }
        }
    }
}
