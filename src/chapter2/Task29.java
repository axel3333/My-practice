package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число,
представляющее собой промежуток времени в часах, и выводит на экран
этот же промежуток времени, но выраженный в секундах.
 */

public class Task29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите промежуток времени в часах");
        int x = scan.nextInt();
        int secondInHour = 3600;
        System.out.println("В секундах этот промежуток времени равен " + x * secondInHour);
    }
}
