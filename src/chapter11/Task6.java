package chapter11;

import java.util.Scanner;

/*
Напишите класс, который выполняет следующие действия:
1. Принимает с клавиатуры два целых числа.
2. Создает и выводит на экран 20 случайных чисел в диапазоне от
первого, только что введенного с клавиатуры, значения, - до второго значения, также введенного с клавиатуры перед этим. Можно исходить из предположения, что первое из вводимых чисел
всегда меньше второго.
Например, если с клавиатуры были введены значения -8 и 17, то класс
создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти
значения).
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        for (int i = 1; i <=20; i++) {
            int temp = (int) (number1 + (number2 - number1 + 1) * Math.random());
            System.out.println(temp);
        }
    }
}
