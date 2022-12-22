package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры серию целых чисел
до тех пор, пока количество четных чисел на нечетных местах в серии
остается меньше 5.
 */


public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int numberIndex = 0;
        while (count < 5) {
            numberIndex++;
            System.out.println("Введите число");
            int number = scanner.nextInt();
            if (number % 2 == 0 && numberIndex % 2 != 0) {
                count++;
            }
        }
        System.out.println("Вы ввели 5 четных числ на нечетных местах");
    }
}
