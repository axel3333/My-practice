package chapter7;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два различных числа.
Класс должен вывести на экран эти числа в порядке возрастания -
в одной строке, а в другой - их же, но в порядке убывания.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        if (number1 < number2) {
            System.out.println(number1 + ", " + number2);
            System.out.println(number2 + ", " + number1);
        } else {
            System.out.println(number2 + ", " + number1);
            System.out.println(number1 + ", " + number2);
        }
    }
}
