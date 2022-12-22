package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное число.
Класс должен заменить его на сумму его же цифр и продолжать эту замену до тех пор,
пока не получится однозначное число. Все получающиеся значения следует вывести на экран.
 */

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = scanner.nextInt();
        int summ = 0;
        while (number >= 10) {
            while (number % 10 != 0) {
                int temp = number % 10;
                summ += temp;
                number = number / 10;
            }
            System.out.println(summ);
            number = summ;
            summ = 0;
        }
    }
}
