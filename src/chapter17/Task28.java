package chapter17;

/*
Напишите метод, который принимает в качестве параметра целое положительное число
n и выводит на экран значения факториалов всех
чисел меньших n.
 */

public class Task28 {
    public static void getFactorials(int a) {
        int factorial;
        for (int i = 1; i < a; i++){
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Факториал числа " + i + " равен " + factorial);
        }
    }

    public static void main(String[] args) {
        getFactorials(10);
    }
}
