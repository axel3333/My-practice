package chapter11;

/* Напишите класс, который принимает с клавиатуры целое число а,
а затем выводит на экран серию из 15 целых чисел, начиная с 1 так, что
каждое следующее число в серии на а больше предыдущего числа (между числами
должен быть знак#): l#l +a#l +2а# ...
 */

import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        for (int i = 1; i <= 15; i++) {
            if (i == 1) {
                System.out.print(i + "#");
            }
            int result = 1 + (i * number);
            System.out.print(result + "#");
        }
    }
}
