package chapter17;

/*
Напишите метод, который принимает в качестве параметра целое положительное число n
и возвращает значение факториала (n!).
 */

public class Task27 {
    public static int getFactorial (int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Факториал заданного числа равен "
        + getFactorial(6));
    }
}
