package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых числа,
каждое из которых представляет собой размер одной из сторон прямоугольника
и выводит на экран следующие значения (каждое в отдельной строке):
площадь прямоугольника и его периметр.
 */

public class Task24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Периметр прямоугольника = " + (2 * (x + y)));
        System.out.println("Площадь прямоугольника = " + (x * y));
    }
}
