package chapter14;
import java.util.Scanner;

/* В соревнованиях по бегу принимали участие 150 учеников школы.
Напишите класс, который принимает с клавиатуры время, показанное
в соревнованиях каждым из учеников, и выводит на экран наилучший
результат, а также порядковый номер победителя (можно предположить, что есть только один победитель).
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int result;
        int bestResult = 0;
        int bestCount = 0;
        for (int i = 1; i <= 15; i++){
            System.out.println("Введите результат следующего ученика");
            result = scanner.nextInt();
            if (i == 1) {
                bestResult = result;
                count++;
            }
            if (result < bestResult) {
                bestResult = result;
                bestCount = count;
                count++;
            } else
                count++;
        }
        System.out.println("Лучшее время показал ученик под номером - " + bestCount
        + " с результатом " + bestResult);
    }
}
