package chapter13;

/* Напишите класс, который генерирует серию из 20 случайных
положительных двузначных чисел и определяет сумму четных значений в серии.
 */

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int up = 99, down = 10;
        for (int i = 1; i <= 20; i++) {
            int number = (int) (down + Math.random() * (up - down));
            System.out.print(number + " ");
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("\nСумма четных значений равна " + sum);
    }
}
