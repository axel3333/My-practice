package chapter13;
import java.util.Scanner;

/* Назовем «базой» положительного числа Х сумму всех положительных
целых чисел, меньших Х.
Напишите класс, который принимает с клавиатуры положительное
целое число Х и подсчитывает его «базу».
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        System.out.println("База числа " + number + " равна - " + sum);
    }
}
