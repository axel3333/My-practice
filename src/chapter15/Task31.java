package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры серию целых чисел
до тех пор, пока количество четных чисел в серии остается меньше 5.
 */

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("Вы ввели 5 четных чисел, программа остановлена");
    }
}
