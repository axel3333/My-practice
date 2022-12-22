package chapter13;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
• среднюю арифметическую оценку учеников, получивших удовлетворительные оценки;
• среднюю арифметическую оценку учеников, получивших неудовлетворительные оценки.
Что произойдет при исполнении программы, если все 30 учеников получили удовлетворительные оценки?
 */

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumGood = 0;
        double sumBad = 0;
        int countGood = 0;
        int countBad = 0;
        for (int i = 1; i <= 30; i++) {
            System.out.println("Введите оценку следующего ученика");
            int rating = scanner.nextInt();
            if (rating > 2) {
                sumGood += rating;
                countGood++;
            }
            if (rating <= 2) {
                sumBad += rating;
                countBad++;
            }
        }
        System.out.println("Средняя арифметическая оценка учеников, получивших" +
                " удовлетворительные оценки " + sumGood / countGood);
        System.out.println("Средняя арифметическая оценка учеников, получивших" +
                " неудовлетворительные оценки " + sumBad / countBad);
    }
}

/* При вводе только удовлетворительных оценок по неудовлетворительным оценкам выдаст значение NaN
так как происходит деление нуля на нуль
 */
