package chapter6;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два значения: первое - числитель
дроби, второе - ее знаменатель. Класс должен определить, является ли эта дробь
«законной» (существующей), и вывести на экран соответствующее текстовое сообщение.
 */
public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение числителя дроби: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение знаменателя дроби: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Дробь неправильная");
        } else if (a < b) {
            System.out.println("Дробь правильная");
        }
    }
}
