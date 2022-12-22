package chapter13;

/* Напишите класс, который генерирует серию из 20 случайных
положительных двузначных чисел и определяет сумму значений в серии.
 */

public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int up = 99, down = 10;
        for (int i = 1; i <= 20; i++) {
            int number = (int) (down + Math.random() * (up - down));
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println("\nСумма значений составляет - " + sum);
    }
}
