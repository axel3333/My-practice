package chapter11;

 /* Напишите класс, который принимает с клавиатуры целое положительное число N
 и выводит на экран серию N+(N-l)+(N-2)+ ... + 1, то есть серию целых положительных
 последовательных чисел, начиная с введенного с клавиатуры значения и до 1 (числа при
 выводе на экран должны разделяться знаком+).
  */

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        for (int i = number; i > 1; i--) {
            System.out.print(i + "+");
        }
        System.out.println(1);
    }
}
