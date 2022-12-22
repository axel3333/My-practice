package chapter13;

/* Напишите класс, который создает серию из 20 случайных чисел из
диапазона 30 ... 49. Числа в серии следует вывести на экран в одну строку следующим образом:
• перед значениями, которые меньше первого в серии, вывести знак
«минус»;
• перед значениями, которые больше первого в серии, вывести знак «ПЛЮС».
 */

public class Task24 {
    public static void main(String[] args) {
        int up = 49, down = 30;
        int first = 0;
        for (int i = 1; i <= 20; i++) {
            int number = (int) (Math.random() * (up - down) + down);
            if (i == 1) {
                first += number;
                System.out.println(first);
            }
            if (number < first) {
                System.out.print("-" + number + " ");
            }
            if (number > first) {
                System.out.print("+" + number + " ");
            }
        }
    }
}
