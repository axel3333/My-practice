package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное число х. Класс должен определить
наибольшее значение в серии 1^2+2^2+3^2+ .. " сумма которой не превышает х.
 */

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int x = 1;
        int summ = 0;
        while (summ < number){
            int temp = x * x;
            x++;
            summ += temp;
//            System.out.println(x + " " + summ);
        }
        System.out.println(x);
    }
}
