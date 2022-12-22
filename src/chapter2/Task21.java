package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и
выводит на экран следующие значения (каждое в отдельной строке): три
целых числа, следующих за значением, введенным с клавиатуры.
 */

public class Task21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = scan.nextInt();
        System.out.println((x + 1) + "\n" + (x + 2) + "\n" + (x + 3));
    }
}
