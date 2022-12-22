package chapter12;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число х, а
затем - серию из 29 дополнительных целых чисел (вводимых с клавиатуры).
Класс должен определить, сколько чисел в серии были равны значению
переменной х, а сколько - были меньше значения переменной х.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int count = 0;
        int count1 = 0;
        for (int i = 1; i <= 29; i++){
            System.out.println("Введите целое число");
            int number1 = scanner.nextInt();
            if (number == number1) {
                count++;
            }
            if (number > number1) {
                count1++;
            }
        }
        System.out.println("Равных первому значению - " + count
        + "\nМеньше первого значения - " + count1);
    }
}
