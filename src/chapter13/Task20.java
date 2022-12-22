package chapter13;

/* Напишите класс, который выводит на экран все двузначные числа, у
которых куб суммы его цифр равен квадрату самого числа.
Класс также должен подсчитывать (и выводить на экран с соответствующим
текстовым сообщением) количество и сумму этих чисел.
 */

public class Task20 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            int x1 = i / 10;
            int x2 = i % 10;
            int summ = x1 + x2;
            int degree = 3;
            int result = (int) (Math.pow(summ, degree));
            if (result == (i * i)) {
                System.out.println(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.println("Всего чисел - " + count);
        System.out.println("Сумма чисел - " + sum);
    }
}
