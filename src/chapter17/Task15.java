package chapter17;

/*
Напишите метод, который принимает в качестве параметра целое число
и возвращает значение true, если это число простое; в ином случае
метод возвращает значение false.
 */

public class Task15 {
    public static boolean isSimple (int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSimple(14));
    }
}
