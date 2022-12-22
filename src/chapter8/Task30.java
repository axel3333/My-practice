package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых числа.
Класс должен определить, мoryr ли эти числа быть числителем (первое) и знаменателем (второе) дроби.
В случае если числа выражают неправильную дробь, следует вывести
на экран соответствующую ей правильную сложную дробь, а во всех
остальных случаях - текстовое сообщение Подсчет не производится.
Например, если с клавиатуры введены значения 7 и 12 - на экран
выводится сообщение Подсчет не производится; если введены 12 и 7, то
на экран выводится 1 5/7.
 */

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int number2 = scanner.nextInt();
        int result;
        if (number1 > number2) {
            System.out.println((number1 / number2) + " " + (number1 % number2)
            + "/" + number2);
        } else if (number1 < number2) {
            System.out.println("Подсчет не производится");
        }
    }
}
