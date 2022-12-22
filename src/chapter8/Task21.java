package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры положительное
целое число и выводит на экран ближайшее к нему «крутлое число».
Например, для введенного значения 433 выводится на экран 430, а для
56 выводится 60.
*/

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int x1 = number % 10;
        int x2;
        if (x1 < 5){
            x2 = number / 10 * 10;
        } else
            x2 = (number / 10 + 1) * 10;
        System.out.println(x2);
    }
}
