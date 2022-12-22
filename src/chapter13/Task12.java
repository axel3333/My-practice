package chapter13;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
• среднюю арифметическую оценку класса;
• число учеников, получивших неудовлетворительные оценки.
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberStudents = 0;
        for (int i = 1; i <= 30; i++) {
            System.out.println("Введите оценку следующего ученика");
            int rating = scanner.nextInt();
            sum += rating;
            if (rating <= 2) {
                numberStudents++;
            }
        }
        System.out.println("Средняя арифметическая оценка класса равна - " + sum / 30);
        System.out.println("Число учеников, получивших неудовлетворительные оценки - " + numberStudents);
    }
}
