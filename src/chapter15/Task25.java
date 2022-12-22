package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное
число и выводит на экран его первую цифру.
Например, для числа 7659 на экран будет выведено 7.
 */

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        String number = scanner.next();
        System.out.println(number.charAt(0));
    }
}
