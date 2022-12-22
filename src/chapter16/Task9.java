package chapter16;

/*
Напишите класс для графического изображения делимости чисел
от 1 до n (значение переменной n вводится с клавиатуры). В каждой
строке надо вывести число и столько плюсов, сколько делителей у этого числа (считая и единицу, и само число). Например, если исходное
данное - число 4, то на экран должно быть выведено:
1+
2++
3++
4+++
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= n; j++){
                if (i % j == 0) {
                    sb.append('+');
                }

            }
            System.out.println(i + "" + sb);
        }
    }
}
