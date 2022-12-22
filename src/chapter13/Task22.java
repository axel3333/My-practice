package chapter13;

/* Трехзначное число называется «числом Армстронга», если куб суммы
цифр числа равен самому числу.
Напишите класс, который выводит на экран все трехзначные «числа
Армстронга».
Класс также должен подсчитывать (и выводить на экран с соответствующим
текстовым сообщением) количество и сумму этих чисел.
 */

public class Task22 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 100; i <= 999; i++) {
            int x1 = i / 100;
            int x2 = i / 10 % 10;
            int x3 = i % 10;
            int summ = x1 + x2 + x3;
            int degree = 3;
            int result = (int) (Math.pow(summ, degree));
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
