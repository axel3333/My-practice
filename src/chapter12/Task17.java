package chapter12;
import java.util.Scanner;

/* Два положительных целых числа называются «родственными», если у
них есть одинаковое количество делителей.
Напишите класс, который принимает с клавиатуры два целых положительных
числа и проверяет, являются ли они «родственными».
 */

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int number2 = scanner.nextInt();
        int countNumber1 = 0;
        int countNumber2 = 0;
        // Можно цикл for сделать через метод, но по условиям задания, скорее всего так нельзя
        for (int i = 2; i < number1; i++) {
            if (number1 % i == 0) {
                System.out.println("Делитель первого числа " + i);
                countNumber1++;
            }
        }
        for (int i = 2; i < number2; i++) {
            if (number2 % i == 0) {
                System.out.println("Делитель второго числа " + i);
                countNumber2++;
            }
        }
        System.out.println("У первого числа делителей - " + countNumber1);
        System.out.println("У второго числа делителей - " + countNumber2);
        if (countNumber1 == countNumber2) {
            System.out.println("Числа родственные");
        } else
            System.out.println("У чисел разное количество делителей");
    }
}
