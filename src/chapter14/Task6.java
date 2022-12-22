package chapter14;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры серию из 27 целых
чисел и сравнивает два значения: среднее арифметическое максимума
и минимума, и среднее арифметическое всех значений серии.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minimum = 0, maximum = 0;
        int summ = 0;
        int count = 0;
        for (int i = 1; i <= 27; i++) {
            System.out.println("Введите целое число: ");
            int number = scanner.nextInt();
            summ += number;
            if (i == 1) {
                maximum = number;
                minimum = number;
            }
            if (number < minimum) {
                minimum = number;
                count++;
            }else if (number > maximum) {
                maximum = number;
                count++;
            } else count++;
        }
        System.out.println("Максимум - " + maximum + "\nМинимум + " + minimum + "\nВсего значений + " + count);
        System.out.println("Среднее арифметическое максимума - " + maximum / count);
        System.out.println("Среднее арифметическое минимума - " + minimum / count);
        System.out.println("Среднее арифметическое всей серии - " + summ / count);
    }
}
