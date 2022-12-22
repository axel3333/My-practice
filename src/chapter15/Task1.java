package chapter15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        while (a % b != 0)
        {
            a += c;
            System.out.print(a+"; ");
        }
    }
}


//1. 32; 37; 42;
//2. первый же вариант не совпадает с условием while
//3.