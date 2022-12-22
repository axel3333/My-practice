package chapter16;

/*
В классе 35 учеников. В конце учебного года каждый ученик получает
ведомость с оценками по 8 предметам.
Напишите класс, который генерирует по 8 оценок для каждого ученика
и подсчитывает для него среднюю годовую оценку.
Для каждого ученика класс должен выводить на экран в одну строку
оценки каждого ученика и его среднюю годовую оценку.
После завершения вывода на экран оценок всех учеников класс должен
выводить в отдельной строке количество учеников, у которых среднегодовая оценка
выше 4.5, и наивысшую среднегодовую оценку.
 */

public class Task20 {
    public static void main(String[] args) {
        int count = 0;
        double maxAverageRating = 0;
        int up = 5, down = 2;
        int numberOfStudents = 35;
        int numberOfRatings = 8;
        for (int i = 1; i <= numberOfStudents; i++) {
            double averageRating = 0;
            double newRating = 0;
            for (int j = 1; j <= numberOfRatings; j++) {
                int rating = (int)(3 + Math.random() * (up - down));
                newRating += rating;
                System.out.print(rating + " ");
            }
            averageRating = newRating / numberOfRatings;
            if (averageRating > maxAverageRating) {
                maxAverageRating = averageRating;
            }
            System.out.print("Средняя годовая оценка ");
            System.out.printf("%.1f", averageRating);
            System.out.println();
            if (averageRating > 4.5) {
                count++;
            }
        }
        System.out.println("Количество учеников со средней оценкой больше 4,5 "
        + count);
        System.out.print("Максимальная средняя оценка - ");
        System.out.printf("%.1f", maxAverageRating);
    }
}
