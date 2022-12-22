package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два числа: первое -
количество учеников в классе, второе - количество стульев в классной
комнате.
Программа проверит соответствие между этими двумя значениями и
выведет на экран соответствующую информацию (например, для значений
35 и 39 на экран выводится 4 стула лишних).
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество учеников в классе: ");
        int students = scanner.nextInt();
        System.out.println("Количество стульев в классе: ");
        int chairs = scanner.nextInt();
        if (students < chairs) {
            System.out.println((chairs - students) + " стула лишних");
        } else if (students > chairs) {
            System.out.println((students - chairs) + " стула не хватает");
        }
    }
}
