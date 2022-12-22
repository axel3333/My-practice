package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых числа и
изменяет их следующим образом:
• при разных значениях, большее число уменьшается на 1, а меньшее - увеличивается на 1;
• при одинаковых значениях чисел оба увеличиваются на 1.
Программа должна вывести на экран новые значения переменных.
 */

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            number1--;
            number2++;
        } else if (number1 < number2) {
            number1++;
            number2--;
        } else {
            number1++;
            number2++;
        }
        System.out.println(number1 + " " + number2);
    }
}
