package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры фамилию, имя и
отчество, а затем строит строковое значение по следующему правилу:
первая буква имени, точка, первая буква отчества, точка, пробел, фамилия. Затем это строковое значение следует вывести на экран.
Например, если с клавиатуры были введены значения
Иван
Иванович
Иванов,
то на экран следует вывести значение И. И. Иванов.
 */

public class Task39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите отчество: ");
        String secondName = scanner.nextLine();
        System.out.print(name.charAt(0) + ". ");
        System.out.print(secondName.charAt(0) + ". ");
        System.out.print(surname);
    }
}
