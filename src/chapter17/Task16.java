package chapter17;

/*
Напишите метод, который получает в качестве параметра целое
положительное число. Метод возвращает крайнюю левую цифру числа.
 */

public class Task16 {
    public static int firstNumber(int a) {
        int result = 0;
        while (true) {
            if (a < 10) {
                result = a;
                break;
            }
            a = a / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstNumber(587456));
    }
}
