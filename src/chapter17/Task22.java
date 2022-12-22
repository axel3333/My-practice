package chapter17;

/*
Напишите метод, который принимает в качестве параметра коэффициенты
квадратного уравнения (а, Ь и с) и возвращает значение true,
если уравнение имеет хотя бы одно решение (корень). В ином случае
метод возвращает значение false.
 */

public class Task22 {
    public static boolean isThereASolution (int a, int b, int c) {
        int d = (int) (Math.pow(b, 2) - (4 * a * c));
        if (d >= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isThereASolution(2,12,5));
    }
}
