package chapter2;
import java.util.Scanner;

/* 1. Укажите, какая информация будет выводиться на экран, если с
клавиатуры введено значение 100? Объясните ответ.
2. Укажите, какая информация будет выводиться на экран, если с
клавиатуры введено значение -1? Объясните ответ.
 */

public class Task7 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt(); //-1
        System.out.println(a-10*a); // -11
    }
}