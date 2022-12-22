package chapter12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int unevenCount = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println("Введите целое число");
            int number = scanner.nextInt();
            if (number % 2 == 0){
                evenCount++;
            } else {
                unevenCount++;
            }
        }
        System.out.println("Четных чисел - " + evenCount + "\nНечетных чисел - " + unevenCount);
    }
}
