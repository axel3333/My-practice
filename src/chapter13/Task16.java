package chapter13;
import java.util.Scanner;

/* Математическая последовательность задана формулой ее любого члена:
an = (2n-1)0·5
Напишите класс, который принимает с клавиатуры число членов
последовательности (n) и вычисляет сумму этой последовательности.
 */

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число членов последовательности (n)");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += ((2 * i - 1) / 2);
        }
        System.out.println("Сумма последовательности равна - " + sum);
    }
}
