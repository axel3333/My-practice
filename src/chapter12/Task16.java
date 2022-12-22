package chapter12;
import  java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное
число и определяет, является ли оно простым.
Класс должен вывести на экран соответствующее текстовое сообщение.
 */

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Делитель - " + i);
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Введенное число простое");
        } else
            System.out.println("Введенное число сложное");
    }
}
