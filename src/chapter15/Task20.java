package chapter15;
import java.util.Scanner;

/*
Напишите класс, который вводит с клавиатуры целые положительные
числа до тех пор, пока не будет введено число, сумма цифр которого
равна 5.
 */

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        while(true) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            while (number % 10 != 0) {
                int temp = number % 10;
                summ += temp;
                number = number / 10;
            }
            if (summ == 5){
                System.out.println("Сумма равна 5, работа закончена");
                break;
            }
            System.out.println("Сумма - " + summ);
            summ = 0;
        }
    }
}
