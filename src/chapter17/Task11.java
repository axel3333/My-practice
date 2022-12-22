package chapter17;

/*
Напишите метод, который принимает в качестве параметра целое
число и возвращает количество цифр в этом числе.
 */

public class Task11 {
    public static int metod (int a) {
        int count = 1;
        while(true) {
            if (a / 10 != 0) {
                count++;
            }
            if (a == 0) {
                break;
            }
            a = a / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(metod(1254254));
    }
}
