package chapter6;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых числа и,
если первое больше второго, выводит на экран их сумму, если же наоборот -
выводит на экран их произведение. В случае же, если числа
одинаковы, программа выводит на экран сообщение Числа равны.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        if(number1 > number2) {
            int result = number1 + number2;
            System.out.println(result);
        } else if (number1 < number2) {
            int result = number1 * number2;
            System.out.println(result);
        } else {
            System.out.println("Числа равны");
        }
    }
}
