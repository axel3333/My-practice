package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры имя и фамилию
ученика.
Класс должен вывести на экран в одной строке сначала фамилию, а
после нее имя ученика, а во второй строке - сначала имя, а после
него - фамилию ученика.
 */

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ученика: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию ученика: ");
        String surname = scanner.nextLine();
        System.out.println(surname + " " + name);
        System.out.println(name + " " + surname);
    }
}
