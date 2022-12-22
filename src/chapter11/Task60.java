package chapter11;

/* Напишите класс, который принимает с клавиатуры целое число N,
а затем выводит на экран все степени двойки от 1 до N включительно.
 */

import java.util.Scanner;

public class Task60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++){
            int result = (int) (Math.pow(2, i));
            System.out.print(result + " ");
        }
    }
}
