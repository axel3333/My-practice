package chapter16;

/*
Напишите класс, который выводит на экран:
в первой строке все четные двузначные числа,
во второй строке - двузначные числа, делящиеся на 3 без остатка,
в третьей строке - двузначные числа, делящиеся на 4 без остатка,
и так далее.
 */

public class Task5 {
    public static void main(String[] args) {
        int up = 100;
        for (int i = 2; i < up; i++) {
            for (int j = 10; j < up; j++){
                if (j % i == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
