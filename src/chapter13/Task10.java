package chapter13;
import java.util.Scanner;

/* Назовем «степенью близости» двух целых положительных чисел сумму
их общих делителей.
Напишите класс, который принимает с клавиатуры два целых положительных
числа и определяет их «степень близости».
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int number2 = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("Сумма общих делителей равна - " + sum);
    }
}
