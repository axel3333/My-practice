package chapter7;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два числа, первое
из которых - количество учеников в классе, а второе - количество
стульев в классной комнате. Программа должна проверить, всем ли
ученикам будет, где сесть.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество учеников в классе: ");
        int students = scanner.nextInt();
        System.out.println("Введите количество стульев в классе: ");
        int chairs = scanner.nextInt();
        if (students <= chairs) {
            System.out.println("Стульев хватает на всех учеников");
        } else
            System.out.println("Стульев на всех не хватит");
    }
}
