package chapter4;
import java.util.Scanner;

/* Назовем «сдвигом числа влево по кругу» операцию, при которой его
цифры перемещаются на одну позицию влево (единицы - на место
десятков, десятки - на место сотен, сотни - на место тысяч и так далее) -
при этом первая цифра перемещается на место единиц.
Например, из числа 1234 получается число 2341.
Напишите класс, который принимает с клавиатуры трехзначное число
и строит новое число, полученное «сдвигом влево по кругу».
 */

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 100;
        int secondNumber = (number / 10) % 10;
        int thirdNumber = number % 10;
        int result = secondNumber * 100 + thirdNumber * 10 + firstNumber;
        System.out.println(result);
    }
}
