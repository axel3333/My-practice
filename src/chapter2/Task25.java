package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры три целых числа,
каждое из которых представляет собой размер одной из сторон параллелепипеда
и выводит на экран следующие значения (каждое - в отдельной строке):
объем, площадь каждой из граней, общую площадь и общий периметр.
 */

public class Task25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println("Объем параллелепипеда равен = " + (x * y * z));
        System.out.println("Площадь левой боковой грани = " + (x * z));
        System.out.println("Площадь правой боковой грани = " + (y * z));
        System.out.println("Площадь основания = " + (x * y));
        System.out.println("Общая площадь = " + (2 * (x * y + x * z + y * z)));
        System.out.println("Периметр равен = " + (4 * x + 4 * y + 4 * z));
        }
}
