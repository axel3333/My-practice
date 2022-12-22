package chapter3;
import java.util.Scanner;

/* Связь между температурой по шкале Цельсия и температурой по шкале
Фаренгейта выражается формулой: C=S(F-32)/9, где С - температура
по шкале Цельсия, F - температура по шкале Фаренгейта.
Напишите класс, который принимает с клавиатуры температуру по
шкале Фаренгейта, а затем выводит на экран эту же температуру, но по
шкале Цельсия.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int farengeitTemp = scanner.nextInt();
        int celsiyTemp = 5 * (farengeitTemp - 32) / 9;
        System.out.println("Температура по Цельсию равна " + celsiyTemp);
    }
}
