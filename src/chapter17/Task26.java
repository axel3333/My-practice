package chapter17;

/*
Напишите класс, который принимает в качестве параметра целое положительное число К.
Метод выводит на экран все простые двузначные
числа, разница между которыми равна К.
 */

public class Task26 {
    public static void findNumbers(int k) {
        int x1 = 0;
        int x2 = 0;
        int count;
        for (int i = 10; i < 100; i++){
            count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                x1 = i;
            }
            if (x1 - x2 == k) {
                System.out.println(x2 + " " + x1 + "; ");
                x2 = x1;
            } else x2 = x1;
        }
    }

    public static void main(String[] args) {
        findNumbers(6);
    }
}
