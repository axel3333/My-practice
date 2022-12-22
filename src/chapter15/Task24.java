package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
• в первой строке - все четные (по месту) цифры этого числа, через
пробел;
• во второй строке - все нечетные (по месту) цифры этого числа,
через пробел.
Например, для числа 765873 в первой строке будет выведена серия 6 8 3,
а во второй строке - 7 5 7.
 */

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        String number = scanner.nextLine();
        StringBuilder sbChet = new StringBuilder();
        StringBuilder sbNechet = new StringBuilder();
        for (int i = 0; i < number.length(); i++){
            if (i % 2 == 0) {
                sbChet.append(number.charAt(i) + " ");
            } else
                sbNechet.append(number.charAt(i) + " ");
        }
        System.out.println(sbNechet + "\n" + sbChet);
    }
}
