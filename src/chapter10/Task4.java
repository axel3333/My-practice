package chapter10;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное число,
а затем генерирует три целых положительных числа, меньших первого.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        int number1 = (int) (Math.random() * number);
        int number2 = (int) (Math.random() * number);
        int number3 = (int) (Math.random() * number);
        System.out.println(number);
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
