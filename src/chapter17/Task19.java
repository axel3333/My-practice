package chapter17;

/*
Напишите метод, который получает в качестве параметров два целых
числа. Метод возвращает значение true, если первая цифра в первом
параметре равна последней цифре во втором параметре.
В ином случае метод возвращает значение false.
 */

public class Task19 {
    public static boolean comparingNumbers (int a, int b) {
        int lastNumber = b % 10;
        int firstNumber = 0;
        while (true) {
            if (a < 10) {
                firstNumber = a;
                break;
            }
            a = a / 10;
        }
        if (firstNumber == lastNumber) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(comparingNumbers(12345, 54322));
    }
}
