package chapter17;

/*
Напишите метод, который принимает в качестве параметров
коэффициенты квадратного уравнения (а, Ь и с) и возвращает количество решений этого уравнения.
 */

public class Task23 {
    public static int numberOfSolutions (int a, int b, int c){
        int d = (int) (Math.pow(b, 2) - (4 * a * c));
        if (d > 0) {
            return 2;
        }
        if (d == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Всего решений квадратного уравнения с такими параметрами - "
        + numberOfSolutions(2,4,2));
    }
}
