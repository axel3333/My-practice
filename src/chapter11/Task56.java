package chapter11;

/* Напишите класс, который принимает с клавиатуры два целых положительных числа:
N и М (неизвестно, какое из введенных чисел больше).
Класс должен вывести на экран все целые числа, начиная с N и заканчивая М.
 */

import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое положительное число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое положительное число");
        int number2 = scanner.nextInt();
        int small = 0, big = 0;
        if (number1 < number2) {
            small = number1;
            big = number2;
        }else if (number1 > number2) {
            small = number2;
            big = number1;
        }
        for (int i = small; i <= big; i++) {
                System.out.print(i + " ");
            }
        }

    }

