package chapter2;
import java.util.Scanner;

/* Напишите класс, который сначала заносит в переменную строковое
значение Привет, а затем принимает с клавиатуры ваше имя.
Класс должен вывести на экран в одной строке сообщение,
составленное из строкового значения Привет, знака «запятая» и вашего имени.
 */

public class Task34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hi = "Привет";
        System.out.println("Введите Ваше имя");
        String name = scan.nextLine();
        System.out.println(hi + ", " + name);
    }
}
