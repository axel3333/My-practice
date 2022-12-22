package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное число, и затем:
• в случае если введено четное число, - принимает с клавиатуры
дробное число и выводит на экран произведение этих двух чисел;
• в противном случае - принимает с клавиатуры целое число и выводит на экран сумму этих двух чисел.
 */

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        double result;
        if (number % 2 == 0) {
            System.out.println("Введите дробное число");
            double number2 = scanner.nextDouble();
            result = number * number2;
            System.out.println(result);
        } else {
            System.out.println("Введите целое число");
            int number2 = scanner.nextInt();
            System.out.println(number + number2);
        }
    }
}
