package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры оценки, полученные группой учеников,
и определяет среднюю арифметическую оценку в группе.
Ввод данных завершается, когда очередное вводимое с клавиатуры
значение не является оценкой.
 */

public class Task49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int count = 0;
        int estimation = 0;
        while (true) {
            System.out.println("Введите оценку");
            input = scanner.nextInt();
            if (input < 1 || input > 5) {
                break;
            }
            count++;
            estimation += input;
        }
        System.out.println("Средняя арифметическая - " + (estimation / count));
    }
}
