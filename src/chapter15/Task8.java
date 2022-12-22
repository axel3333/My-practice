package chapter15;
import java.util.Scanner;

/*

 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int summ = 0;
        while (summ < 150) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            count++;
            summ += number;
        }
        System.out.println("Всего введено - " + count + " чисел, их сумма равна - " + summ);
    }
}
