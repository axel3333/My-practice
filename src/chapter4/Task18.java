package chapter4;
import java.util.Scanner;

/* Назовем «линейным сдвигом числа влево» операцию, при которой его
цифры перемещаются на одну позицию влево (единицы - на место
десятков, десятки - на место сотен, сотни - на место тысяч и так далее) -
при этом первая цифра удаляется из числа, а на место единиц
записывается ноль.
Например, из числа 1234 после такой операции получается число 2340.
Напишите класс, который принимает с клавиатуры трехзначное число
и строит новое число, полученное «линейным сдвигом влево».
 */

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number % 100;
        int result = firstNumber * 10;
        System.out.println(result);
    }
}
