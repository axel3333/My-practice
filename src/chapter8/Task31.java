package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры трехзначное число
и изменяет его следующим образом:
• для четных чисел - все четные цифры увеличиваются на 1, а нечетные
уменьшаются на 1; в случае если это невозможно, они остаются неизменными;
• в нечетных числах все изменения производятся «наоборот».
Программа должна вывести на экран новое значение переменной.
 */

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();
        int x1 = number / 100;
        int x2 = number / 10 % 10;
        int x3 = number % 10;
        if (number % 2 == 0) {
            if(x1 % 2 == 0) {
                x1++;
            } else x1--;
            if(x2 % 2 == 0) {
                x2++;
            } else x2--;
            if(x3 % 2 == 0) {
                x3++;
            } else x3--;
            System.out.println(x1 * 100 + x2 * 10 + x3);
        } else {
            if(x1 % 2 == 0) {
                x1--;
            } else x1++;
            if(x2 % 2 == 0) {
                x2--;
            } else x2++;
            if(x3 % 2 == 0) {
                x3--;
            } else x3++;
            System.out.println(x1 * 100 + x2 * 10 + x3);
        }
    }
}
