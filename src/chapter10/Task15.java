package chapter10;

/* Напишите класс, который генерирует и выводит на экран случайное
число из диапазона от 250 до 746, а затем в отдельных строках, - наименьшую
и наибольшую из цифр этого числа.
Класс также должен проверить, были ли в генерированном числе одинаковые цифры,
и вывести на экран соответствующее текстовое сообщение.
 */

public class Task15 {
    public static void main(String[] args) {
        int down = 250;
        int up = 746;
        int min = 0, max = 0;
        int number = (int) (down + (up - down + 1) * Math.random());
        System.out.println(number);
        int x1 = number / 100;
        int x2 = number / 10 % 10;
        int x3 = number % 10;
//        System.out.println(x1 + " " + x2 + " " + x3);
        if (x1 == x2 || x2 == x3 || x3 == x1) {
            System.out.println("В числе есть одинаковые цифры");
        }
        if (x1 >= x2 && x1 >= x3)
            max = x1;
        if (x2 >= x1 && x2 >= x3)
            max = x2;
        if (x3 >= x1 && x3 >= x2)
            max = x3;
        if (x1 <= x2 && x1 <= x3)
            min = x1;
        if (x2 <= x1 && x2 <= x3)
            min = x2;
        if (x3 <= x1 && x3 <= x2)
            min = x3;
        System.out.println( min + " " + max);
    }
}
