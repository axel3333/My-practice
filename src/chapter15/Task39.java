package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное число
и находит его наименьший делитель, отличный от 1.
 */

public class Task39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        int count = 2;
        while (true) {
            if (number % count == 0) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
