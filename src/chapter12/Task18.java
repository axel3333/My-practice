package chapter12;
import java.util.Scanner;

/* Назовем «степенью родства» двух целых положительных чисел
количество их общих делителей.
Напишите класс, который принимает с клавиатуры два целых положительных
числа и определяет их «степень родства».
 */

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int number2 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number1; i++) {
            if (number1 % i ==0 && number2 % i == 0) {
                System.out.println("Общий знаменатель - " + i);
                count++;
            }
        }
        System.out.println("Степень родства - " + count);
    }
}
