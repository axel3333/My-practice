package chapter3;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два значения: первое -
длина основания равнобедренного треугольника, второе - высоту
этого треугольника. Затем класс должен подсчитать и вывести на экран:
• площадь этого треугольника;
• периметр прямоугольника, сторонами которого являются основание и высота
описанного в задаче треугольника.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину основания равнобедренного треугольника: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите высоту треугольника: ");
        int x2 = scanner.nextInt();
        int area = (x1 * x2) / 2;
        int perimeter = 2 * (x1 + x2);
        System.out.println("Площадь треугольника равна: " + area);
        System.out.println("Периметр прямоугольника равен: " + perimeter);
    }
}
