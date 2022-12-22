package chapter14;

/* Напишите класс, который генерирует серию из 50 случайных целых
чисел из диапазона от -40 до +40, и определяет наибольшее и наименьшее
значение в сгенерированной серии.
 */

public class Task3 {
    public static void main(String[] args) {
        int up = 40, down = -40;
        int maximum = 0, minimum = 0;
        for (int i = 1; i <= 50; i++) {
            int x = (int) (Math.random() * (up - down) + down);
            System.out.print(x + " ");
            if (maximum < x) {
                maximum = x;
            }
            if (minimum > x) {
                minimum = x;
            }
        }
        System.out.println("\nМаксимальное значение - " + maximum
        + "\nМинимальное значение - " + minimum);
    }
}
