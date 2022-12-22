package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное число
и изменяет его следующим образом:
• для четного числа - увеличивает его до ближайшего «крутлого» и
выводит новое значение на экран вместе с сообщением Up to."
• для нечетного числа - уменьшает его до ближайшего «крутлого» и
выводит новое значение на экран вместе с сообщением Down to".
Например, для введенного значения 433 на экран выводится Down to
430, а для 56 выводится Up to 60.
 */

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int result;
        if (number % 2 == 0) {
            result = (number / 10 + 1) * 10;
            System.out.println("Up to " + result);
        } else {
            result = number / 10 * 10;
            System.out.println("Down to " + result);
        }
    }
}
