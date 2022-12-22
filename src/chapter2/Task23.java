package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых числа и
выводит на экран следующие значения (каждое в отдельной строке):
квадрат каждого числа (отдельно) и сумму квадратов введенных чисел.
*/

public class Task23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(x * x);
        System.out.println(y * y);
        System.out.println((x * x) + (y * y));
    }
}
