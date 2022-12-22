package chapter17;

/*
Напишите метод, который принимает в качестве параметра два целых
числа и возвращает значение true, если в числах одинаковое количество
цифр; в ином случае метод возвращает значение false.
 */

public class Task13 {
    public static int metod (int a) {
        int count = 1;
        while (a / 10 != 0) {
            count++;
            a = a / 10;
        }
        return count;
    }
    public static boolean areTheyEqual (int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
        }

    public static void main(String[] args) {
        int countA = metod(123);
        int countB = metod(142);
        System.out.println(areTheyEqual(countA, countB));
    }
}

