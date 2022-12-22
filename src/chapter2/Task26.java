package chapter2;
import java.util.Scanner;

/* апишите класс, который принимает с клавиатуры два целых числа,
первое из которых представляет собой год рождения, а второе - нынешний
(текущий) год. Класс должен вывести на экран возраст (в целых годах).
 */

public class Task26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        int x = scan.nextInt();
        System.out.println("Введите текущий год: ");
        int y = scan.nextInt();
        System.out.println("Возраст составляет: " + (y - x));
    }
}
