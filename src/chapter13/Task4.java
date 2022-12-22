package chapter13;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры положительное
целое число и выводит на экран все его делители.
Кроме того, класс должен определять количество и сумму делителей и
выводить результаты на экран.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Делитель - " + i);
                count++;
                sum += i;
            }
        }
        System.out.println("Количество делителей - " + count);
        System.out.println("Сумма делителей - " + sum);
    }
}
