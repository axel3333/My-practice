package chapter4;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое положительное
трехзначное число и выводит его на экран в «полном виде»: например,
для числа 364 это будет выглядеть как 300+60+4.
*/

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scan.nextInt();
        int firstNumber = number / 100 * 100;
        int secondNumber = (number - firstNumber) / 10 * 10;
        int thirdNumber = (number - firstNumber) % 10;
        System.out.println(firstNumber + "+" + secondNumber + "+" + thirdNumber);
    }
}
