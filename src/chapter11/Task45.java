package chapter11;

/* Напишите класс, который выводит на экран (в строку с пробелами) все
двузначные целые положительные числа, соответствующие следующему требованию:
и цифра единиц, и цифра десятков делятся на три с
разными остатками.
 */

public class Task45 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int x1 = i / 10;
            int x2 = i % 10;
            int remainsX1 = x1 % 3;
            int remainsX2 = x2 % 3;
            if (remainsX1 != remainsX2) {
                System.out.print(i + " ");
            }
        }
    }
}
