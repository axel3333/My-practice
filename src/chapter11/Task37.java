package chapter11;

/* Напишите класс, который генерирует 20 случайных чисел из диапазона
от-18 до 18.
Для каждого отрицательного числа следует вывести на экран само
число и его квадрат (в одной строке), для положительного - само
число и округленный (по правилам округления, принятым в математике)
корень из числа. Значения, равные нулю, не выводятся на экран
вообще.

 */

public class Task37 {
    public static void main(String[] args) {
        int down = -18, up = 18;
        for (int i = 1; i <= 20; i++) {
            int x = (int) (down + (up - down + 1) * Math.random());
            if (x < 0) {
                int numberSquared = x * x;
                System.out.println(x + " " + numberSquared);
            } else if (x > 0) {
                int rootNumber = (int) Math.round(Math.sqrt(x));
                System.out.println(x + " " + rootNumber);
            } else
                continue;
//            System.out.print(x + " ");
        }
    }
}
