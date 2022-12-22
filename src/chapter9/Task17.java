package chapter9;
import java.util.Scanner;

/*  Напишите класс, который принимает с клавиатуры три числа и проверяет,
являются ли эти числа углами одного и того же треугольника.
По результатам проверки следует вывести на экран соответствующее
текстовое сообщение.
 */

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = scanner.nextInt();
        if (number1 + number3 + number2 == 180){
            System.out.println("Числа являются углами одного треугольника");
        } else {
            System.out.println("Числа не являются углами одного треугольника");
        }
    }
}
