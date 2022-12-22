package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
• в первой строке - все четные (по значению) цифры этого числа,
через пробел;
• во второй строке - все нечетные (по значению) цифры этого числа, через пробел.
Например, для числа 765873 в первой строке будет выведена серия 6 8,
а во второй строке - 7 5 7 3.
 */

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        StringBuilder sbChet = new StringBuilder();
        StringBuilder sbNechet = new StringBuilder();
        while (number % 10 != 0) {
            int temp = number % 10;
            if (temp % 2 == 0) {
                sbChet.append(temp + " ");
                number = number / 10;
            } else {
                sbNechet.append(temp + " ");
                number = number / 10;
            }
        }
        System.out.println(sbChet.reverse() + "\n" + sbNechet.reverse());
    }
}
