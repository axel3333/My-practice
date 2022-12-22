package chapter11;

/* Напишите класс, который выводит на экран (в одну строку) 11 случайных чисел из диапазона
«положительные двузначные». После каждого числа, делящегося на 5 без остатка, следует вывести
(в обычных скобках, вплотную к числу) сумму его цифр; для остальных чисел следует вывести
произведение его цифр (в квадратных скобках, вплотную к числу).
 */

public class Task11 {
    public static void main(String[] args) {
        int down = 10, up = 99;
        int number;
        for (int i = 1; i < 11; i++){
            number = (int) (down + (up - down + 1) * Math.random());
            int x1 = number / 10;
            int x2 = number % 10;
            if (number % 5 == 0) {
                System.out.print(number + "(" + (x1 + x2) + ") ");
            } else
                System.out.print(number + "(" + (x1 * x2) + ") ");

        }

    }
}
