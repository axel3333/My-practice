package chapter16;

/*
Напишите класс, который выводит на экран все простые двузначные
числа, квадрат которых не превышает 999.
 */

public class Task17 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                if (i * i < 999) {
                    System.out.println(i);
                }

            }
        }
    }
}
