package chapter14;

/* В соревнованиях по бегу принимали участие 150 учеников школы.
Напишите класс, который принимает с клавиатуры время, показанное
в соревнованиях каждым из учеников, и выводит на экран наилучший
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int bestResult = 0;
        for (int i = 1; i <= 150; i++) {
            if (i == 1) {
                bestResult = i;
            }
            System.out.println("Введите результат следующего ученика");
            result = scanner.nextInt();
            if (result < bestResult) {
                bestResult = result;
            }
        }
        System.out.println("Лучший результат - " + bestResult);
    }
}
