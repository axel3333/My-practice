package chapter13;
import java.util.Scanner;

/* Дан следующий фрагмент класса:
Проследите за выполнением фрагмента и запишите, какими будут
значения переменных sl и s2 для следующего набора вводимых
данных после его окончания: 5, 12, 6, 8, 9, 7.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;
        for(int i = 1; i <7; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0)
                s1 = s1 + x;
            if (x % 3 == 0)
                s2 = s2 + x;
        }
        System.out.println(s1 + " \n" + s2); // 26 и 27
    }
}
