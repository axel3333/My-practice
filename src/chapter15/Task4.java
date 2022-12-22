package chapter15;
import java.util.Scanner;
/*

 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number != 0) {
            System.out.println("Введите число:");
            number = scanner.nextInt();
            if(number > 0) {
                System.out.println("Плюс");
            }
            if(number < 0) {
                System.out.println("Минус");
            }
        }
        System.out.println("Введено значение 0, работа программы закончена");
    }
}
