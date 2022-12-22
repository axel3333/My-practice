package chapter16;

/*
Напишите класс, который будет выводить на экран суммы делителей
каждого числа от 1 до 75.
 */

public class Task8 {
    public static void main(String[] args) {
        int down = 1, up = 75;
        for (int i = down; i <= up; i++){
            int summ = 0;
            System.out.println("Сумма делителей " + i + ":");
            for (int j = down; j <= up; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    summ += j;
                }
            }
            System.out.println();
            System.out.println("Сумма = " + summ);
        }
    }
}
