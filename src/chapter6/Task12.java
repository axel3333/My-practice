package chapter6;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры три значения (а, Ь
и с), являющиеся коэффициентами квадратного уравнения.
Класс должен определить, имеется ли у этого уравнения хотя бы один
корень (решение), и вывести на экран соответствующее текстовое сообщение.
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение b: ");
        int b = scanner.nextInt();
        System.out.println("Введите значение с: ");
        int c = scanner.nextInt();
        int d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Да");
        } else
            System.out.println("Нет");
    }
}
