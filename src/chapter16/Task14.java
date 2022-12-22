package chapter16;

/*
Напишите класс, который выводит на экран все простые двузначные
числа.
Класс также должен определить количество и сумму этих чисел.
 */

public class Task14 {
    public static void main(String[] args) {
        int count = 0;
        int summ = 0;
        for (int i = 10; i <= 99; i++) {
            int flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                count++;
                summ += i;
                System.out.println(i);
            }
        }
        System.out.println("Сумма равна " + summ);
        System.out.println("Всего чисел " + count);
    }
}
