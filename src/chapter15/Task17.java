package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное
число N и цифру D. Класс должен проверить, есть ли внутри числа
N цифра D, и вывести на экран соответствующее сообщение.
 */

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int n = scanner.nextInt();
        System.out.println("Введите искомое число");
        int d = scanner.nextInt();
        while (n % 10 != 0) {
            int temp = n % 10;
            if (temp == d) {
                System.out.println("Искомое число есть");
                break;
            } else {
                n = n / 10;
            }
        }
    }
}
