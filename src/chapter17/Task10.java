package chapter17;

/*
Напишите метод, который принимает в качестве параметров целое
число и возвращает сумму его цифр.
 */

public class Task10 {
    public static int metod(int a) {
        int sum = 0;
        while(true) {
            if (a == 0) {
                break;
            }
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(metod(123));
    }
}
