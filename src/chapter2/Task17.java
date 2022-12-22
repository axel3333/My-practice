package chapter2;

// Напишите класс, который принимает с клавиатуры целое число и затем выводит на экран его квадрат.

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Квадрат х равен " + x * x);
    }
}
