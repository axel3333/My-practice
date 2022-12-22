package chapter10;

/* Напишите класс, который генерирует и выводит на экран случайное
целое чисел из диапазона положительных двузначных чисел.
 */

public class Task1 {
    public static void main(String[] args) {
        while (true) {
            int number = (int) (10 + Math.random() * 90);
            System.out.println(number);
        }
    }
}
