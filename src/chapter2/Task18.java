package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число
 и затем выводит на экран его квадрат и его же куб, а между ними знак &.
*/

public class Task18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println((x * x) + " & " + (x * x * x));
    }
}
