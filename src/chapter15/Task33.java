package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое число (для
переменной х) и выводит на экран серию значений: х, x2, x3 ••• xn до тех
пор, пока очередное значение остается меньше 1000.
 */

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();;
        int x = 1;
        while(x < 1000) {
            System.out.print(x + " ");
            x  *= number;
        }
    }
}
