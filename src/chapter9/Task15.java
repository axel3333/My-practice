package chapter9;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число, которое должно
означать порядковый номер месяца. В случае если полученное значение действительно
соответствует порядковому номеру
одного из месяцев, следует вывести сезон (лето, осень, зима, весна), к
которому относится месяц.
В случае если введенное значение не является порядковым номером месяца,
следует вывести на экран соответствующее текстовое сообщение.
 */

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        if (number == 1 || number == 2 || number == 12) {
            System.out.println("Зимний месяц");
        } else if (number > 2 && number < 6) {
            System.out.println("Весенний месяц");
        } else if (number > 5 && number < 9) {
            System.out.println("Летний месяц");
        } else if (number > 8 && number < 12) {
            System.out.println("Осенний месяц");
        } else
            System.out.println("Введенное число не является порядковым числом месяца");
    }
}
