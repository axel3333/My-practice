package chapter11;

/* Напишите класс, который выводит на экран все положительные двузначные числа
(выберите самостоятельно - в возрастающем или убывающем порядке), произведение
цифр которых является тоже двузначным числом.
 */

public class Task39 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int x1 = i /10;
            int x2 = i % 10;
            int result = x1 * x2;
            if (result >= 10) {
                System.out.print(i + " ");
            }
        }
    }
}
