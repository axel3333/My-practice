package chapter4;
import java.util.Scanner;

/* Назовем «обменом» операцию, при которой два числа «обмениваются»
своими правыми цифрами.
Напишите класс, который принимает с клавиатуры два трехзначных
положительных числа и совершает над ними операцию «обмена».
 */

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое трехзначное число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе трехзначное число: ");
        int number2 = scanner.nextInt();
        int number1FirstNumbers = number1 / 10;
        int number1LastNumber = number1 % 10;
        int number2FirstNumbers = number2 / 10;
        int number2LastNumber = number2 % 10;
        int newNumber1 = number1FirstNumbers * 10 + number2LastNumber;
        int newNumber2 = number2FirstNumbers * 10 + number1LastNumber;
        System.out.println("Первое число после замены - " + newNumber1);
        System.out.println("Второе число после замены - " + newNumber2);
    }
}
