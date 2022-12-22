package chapter9;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры три целых числа и
определяет, в каких соотношениях с точки зрения значений (равны,
больше, меньше) они находятся. На экран следует вывести сообщение с
точным указанием результатов проверки: например, Первое и третье
равны, второе больше них или Все значения одинаковы.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = scanner.nextInt();
            if (number1 == number2 && number2 == number3) {
                System.out.println("Все значения одинаковы");
            } else if (number1 > number2 && number2 == number3) {
                System.out.println("Второе и третье число равны, первое больше их");
            } else if (number1 < number2 && number2 == number3) {
                System.out.println("Второе и третье число равны, первое меньше их");
            } else if (number1 > number2 && number2 > number3) {
                System.out.println("Первое число больше второго, второе больше третьего");
            } else if (number1 > number2 && number2 < number3) {
                System.out.println("Первое число больше второго, второе число меньше третьего");
            } else if (number1 < number2 && number2 > number3) {
                System.out.println("Первое число меньше второго, второе число больше третьего");
            } else if (number1 < number2 && number2 < number3) {
                System.out.println("Первое число меньше второго, второе меньше третьего");
            } else if (number1 == number2 && number2 < number3) {
                System.out.println("Первое и второе число равны, оба меньше третьего");
            } else if (number1 == number2 && number2 > number3) {
                System.out.println("Первое и второе число равны, оба больше третьего");
            }
        }
    }

