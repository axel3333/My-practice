package chapter16;

/*
Целое число называется <<Полноценным», если сумма делителей (включая 1, но, не включая само число) числа равна самому числу.
Напишите класс, который выводит на экран все «полноценные» числа
ОТ 1 ДО 100000.
 */

public class Task10 {
    public static void main(String[] args) {
        int up = 100000;
        for (int i = 1; i <= up; i++){
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
