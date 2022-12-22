package chapter4;
import java.util.Scanner;

/* Назовем «длиной трехзначного числа» разницу между его первой (число сотен) и
последней (число единиц) цифрами, умноженную на его
среднюю (число десятков) цифру.
Напишите класс, который принимает с клавиатуры целое положительное трехзначное число,
вычисляет его «длину» и выводит результат на экран.
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число: ");
        int number = scan.nextInt();
        int firstNumber = number - (number % 100);
        int secondNumber = (number - firstNumber) / 10 * 10;
        int thirdNumber = number % 10;
        int result = (firstNumber - thirdNumber) * secondNumber;
        System.out.println(result);
    }
}
