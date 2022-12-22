package chapter13;
import java.util.Scanner;

/* Производственный участок выпускает стальные шарики, диаметр которых
должен быть равен 24 миллиметрам (допустимое отклонение не
более 2 миллиметров), а вес - 74 граммам (допустимое отклонение не
более 3 грамм).
Напишите класс, который принимает данные 120 шариков, для каждого из
них определяет, соответствуют ли его параметры указанным
стандартам, и выводит на экран для каждого шарика соответствующее
текстовое сообщение.
 */

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 120; i++) {
            System.out.println("Введите диаметр шарика");
            int diameter = scanner.nextInt();
            System.out.println("Введите вес шарика");
            int weigth = scanner.nextInt();
            if (diameter <= 26 && diameter >= 22) {
                System.out.println("Диаметр в пределах допустимых отклонений");
            } else
                System.out.println("Диаметр не соответствует допустимым параметрам");
            if (weigth >= 71 && weigth <= 77) {
                System.out.println("Вес в пределах допустимых отклонений");
            } else
                System.out.println("Вес не соответствует допустимым параметрам");
        }
    }
}
