package chapter6;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и, если
оно положительное, увеличивает его вдвое. Класс должен выводить на
экран новое значение.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if (number > 0) {
            number *= 2;
            System.out.println(number);
        } else if (number == 0){
            System.out.println("Вы ввели 0");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }

    }
}
