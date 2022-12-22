package chapter15;

import java.util.Scanner;

/*
При внесении в компьютерную программу оценок группы из 30 учеников
учитель может допустить ошибку (ввести число, не являющееся
оценкой). Компьютерная программа игнорирует ошибку, а учитель получает
возможность вновь занести с клавиатуры оценку.
Напишите класс, который принимает с клавиатуры оценки 30 учеников до тех пор,
пока все ученики не получат оценки. Класс должен подсчитать среднюю
арифметическую оценку группы, а также количество
ошибок, допущенных при введении оценок.
 */

public class Task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int mistakes = 0;
        int numberOfStudents = 10;
        int estimation = 0;
        while (count <= numberOfStudents) {
            System.out.println("Введите оценку");
            int number = scanner.nextInt();
            count++;
            if (number < 1 || number > 5) {
                mistakes++;
                number = scanner.nextInt();
            }
            estimation += number;
            }
        System.out.println("Средняя арифметическая - " + (estimation / count)
        + "\nВсего ошибок - " + mistakes);
    }
}
