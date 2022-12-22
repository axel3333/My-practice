package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых числа и
выводит на экран следующие значения (каждое в отдельной строке):
сумму введенных чисел, их произведение, разницу между первым и
вторым, разницу между вторым и первым.
*/

public class Task22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(x - y);
        System.out.println(y - x);
    }
}
