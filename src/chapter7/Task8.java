package chapter7;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два числа, первое
из которых - количество учеников в классе, а второе - количество
столов в классной комнате. Программа должна проверить, всем ли
ученикам будет, где сесть.
Предполагается, что за столом могут сидеть два ученика.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество учеников в классе: ");
        int students = scanner.nextInt();
        System.out.println("Введите количество парт в классе: ");
        int desks = scanner.nextInt();
        if (desks * 2 < students) {
            System.out.println("Парт не хватает!");
        } else if (desks * 2 >= students) {
            System.out.println("Парт хватит на всех");
        }
    }
}
