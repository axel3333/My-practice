package chapter15;
import java.util.Scanner;

/*
Последовательность Фибоначчи определяется как серия чисел, в которой первый и
второй члены равны 1, а любой член, начиная с третьего,
равен сумме двух предыдущих членов.
Напишите класс, который принимает с клавиатуры целое положительное число и
проверяет, является ли оно членом последовательности
Фибоначчи.
 */

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        int result = 0;
        int count = 1;
        int first = 1;
        int second = 1;
        while (result < number) {
            if (count == 1) {
            result = first + second;
            count++;
            }
            result = first + second;
            first = second;
            second = result;
            count++;
            System.out.println(result);
        }
            if (result == number) {
                System.out.println("Да");
            } else System.out.println("Нет");
    }
}
