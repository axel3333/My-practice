package chapter2;
import java.util.Scanner;

/* 1. Укажите, какая информация будет выводиться на экран, если с
клавиатуры введено значение 6? Объясните ответ.
2. Укажите, какая информация будет выводиться на экран, если с
клавиатуры введено значение -6? Объясните ответ.
3. Предложите изменения в программе, чтобы ввод и вывод выглядели более «дружественно».
 */

public class Task5 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt(); // введено значение 6
        System.out.println("aa=" + (a * a)); // на экран выводится аа=36
        System.out.println("a10=" + (a * 10)); // на экран выводится a10=60
    }

}
