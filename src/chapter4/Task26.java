package chapter4;
import java.util.Scanner;

/* Назовем «большим обменом» операцию, при которой два числа «обмениваются» своими левыми цифрами.
1. Напишите класс, который принимает с клавиатуры два трехзначных
положительных числа и совершает над ними операцию «обмена».
2. Возможно ли совершить операцию «большого обмена», если два
числа имеют разное количество цифр? Обоснуйте свой ответ.
 */

public class Task26 {
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
        int newNumber1 = number2FirstNumbers * 10 + number1LastNumber;
        int newNumber2 = number1FirstNumbers * 10 + number2LastNumber;
        System.out.println("Первое число позле замены - " + newNumber1);
        System.out.println("Второе число после замены - " + newNumber2);
    }
}
