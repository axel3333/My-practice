package chapter12;

/* Напишите класс, который генерирует 15 целых чисел в интервале от
-25 до 25, печатает их, а затем выводит на экран информацию о том,
сколько из них были:

• положительными;
• четными;
• однозначными.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int countPositive = 0;
        int countEven = 0;
        int countSingleDigit = 0;
        int up = 25;
        int down = -25;
        for (int i = 1; i <= 15; i++) {
            int number = (int) (Math.random() * 50 - 25);
            System.out.println(number);
            if (number > 0) {
                countPositive++;
            }
            if (number % 2 == 0) {
                countEven++;
            }
            if (number < 10 && number > - 10) {
                countSingleDigit++;
            }
        }
        System.out.println("Положительных - " + countPositive + "\nЧетных - " + countEven
        + "\nОднозначных - " + countSingleDigit);
    }
}
