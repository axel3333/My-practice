package chapter15;
import java.util.Scanner;

/*

 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код");
        int code = scanner.nextInt();
        while (code != 123) {
            System.out.println("Код неверный, повторите ввод");
            code = scanner.nextInt();
        }
        System.out.println("Код принят");
    }
}
