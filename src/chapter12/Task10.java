package chapter12;

/* Контрольная работа считается «провальной», если более половины
учеников получили неудовлетворительные оценки.
Напишите класс, который принимает с клавиатуры число учеников в
группе, а затем - оценку каждого ученика.
Класс должен определить, была ли контрольная «провальной».
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество учеников: ");
        int numberOfStudents = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Введите оценку следующего студента");
            int number = scanner.nextInt();
            if (number == 2) {
                count++;
            }
        }
        double result = (double)numberOfStudents / count;
        if (result < 2) {
            System.out.println("Контрольная работа провалена");
        } else
            System.out.println("Контрольная прошла успешно");
    }
}
