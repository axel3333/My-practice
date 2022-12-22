package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два строковых значения: ваше имя и вашу фамилию.
Класс должен вывести на экран сообщение Вас зовут, а рядом с ним
(через пробел) ваше имя и фамилию, введенные с клавиатуры.
 */

public class Task35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String name = scan.nextLine();
        System.out.println("Введите Вашу фамилию: ");
        String surname = scan.nextLine();
        System.out.println("Вас зовут, " + name + " " + surname);
    }
}
