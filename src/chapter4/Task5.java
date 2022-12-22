package chapter4;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное двузначное
число и выводит его на экран в «полном виде»: например, для числа 34
это будет выглядеть как 30+4.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 10 * 10;
        int secondNumber = number % 10;
        System.out.println(firstNumber + "+" + secondNumber);
    }
}
