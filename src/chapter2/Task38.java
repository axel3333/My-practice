package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры фамилию, имя и
отчество, а затем выводит на экран инициалы (без пробела между
инициалами).
 */

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите отчество: ");
        String secondName = scanner.nextLine();
        System.out.print(surname.charAt(0));
        System.out.print(name.charAt(0));
        System.out.print(secondName.charAt(0));
    }
}
