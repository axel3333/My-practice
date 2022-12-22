package chapter13;

/* Напишите класс, который выводит на экран все двузначные числа,
равные утроенному произведению его цифр.
Класс также должен подсчитывать (и выводить на экран с соответствующим
текстовым сообщением) количество и сумму этих чисел.
 */

public class Task21 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            int x1 = i / 10;
            int x2 = i % 10;
            int result = (x1 * x2) * 3;
            if (i == result) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.println("Всего чисел - " + count);
        System.out.println("Сумма чисел - " + sum);
    }
}
