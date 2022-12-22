package chapter17;

/*
Напишите метод, который принимает в качестве параметров координаты
точки на плоскости (Х и У) и возвращает расстояние между этой
точкой и началом координат.
 */

public class Task21 {
    public static void distanceBetweenPoints( int a, int b) {
        System.out.printf("%.2f", Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public static void main(String[] args) {
        distanceBetweenPoints(2,3);
    }
}
