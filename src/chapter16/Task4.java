package chapter16;

/*
Напишите класс, который выводит на экран построчно таблицу умножения:
в первой строке -умножение чисел от 1 до 9 на 1, во второй -
умножение на 2, и так далее до умножения чисел от 1 до 9 на 12.
 */

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++){
            for (int j = 1; j <=9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
