package chapter12;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное число Х и выводит на экран все его делители (1 и само число Х
не считать делителями).
Класс должен также подсчитать количество этих делителей и вывести
результат на экран вместе с соответствующим по смыслу текстовым
сообщением.
 */

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int countDivider = 0;
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Делитель " + i);
                countDivider++;
            }
        }
        System.out.println("Всего делителей - " + countDivider);
    }
}
