package chapter3;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры три числа: длины
двух катетов и гипотенузы прямоугольного треугольника, и выводит
на экран площадь и периметр этого треугольника.
При решении следует предусмотреть возможность того, что размеры
сторон треугольника не выражаются целыми числами.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первого катета: ");
        double firstCatet = scanner.nextDouble();
        System.out.println("Введите значение второго катета: ");
        double secondCatet = scanner.nextDouble();
        System.out.println("Введите значение гипотенузы: ");
        double gipotenuza = scanner.nextDouble();
        double perimetr = firstCatet + secondCatet + gipotenuza;
        double ploshad = (firstCatet * secondCatet) / 2;
        System.out.println("Периметр равен " + perimetr);
        System.out.println("Площадь равна " + ploshad);
    }
}
