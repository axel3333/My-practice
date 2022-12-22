package chapter11;

/*
Напишите класс, который выводит на экран (в одну строку) 15 случайных чисел из диапазона -20".+35.
После каждого отрицательного числа следует вывести (вплотную к числу) символ«?» (знак вопроса).
 */

public class Task8 {
    public static void main(String[] args) {
        int down = -20, up = 35;
        for (int i = 1; i < 15; i++) {
            int result = (int) (Math.random() * (Math.abs(down) + up + 1)) - 20;
            if (result < 0) {
                System.out.print(result + "? ");
            } else {
                System.out.print(result + " ");
            }
        }
    }
}
