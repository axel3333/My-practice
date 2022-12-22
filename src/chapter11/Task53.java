package chapter11;

/* Напишите класс, который принимает с клавиатуры два целых положительных числа:
N и М (можно считать, что M<N).
Класс должен вывести на экран серию М+(М+ 1)+(М+2)+ ... +N.
 */

import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое положительное число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое положительное число");
        int number2 = scanner.nextInt();
        for (int i = number2; i <= number1; i++) {
            if (i != number1) {
                System.out.print(i + "+");
            } else
                System.out.print(i);
        }
    }
}
