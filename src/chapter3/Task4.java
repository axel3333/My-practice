package chapter3;
import java.util.Scanner;

/* Для пересчета суммы в одной валюте - в сумму в другой валюте
(например, между суммой в рублях и этой же суммой, но в евро)
используется так называемый «банковский курс»: числовой коэффициент,
показывающий, чему равна единица одной валюты в единицах другой.
Напишите класс, который принимает с клавиатуры два числа: первое -
сумму в одной валюте (например, в долларах), и второе - «банковский
курс». Класс должен подсчитать и вывести на экран сумму во второй
валюте.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в долларах: ");
        int dollarSumm = scanner.nextInt();
        System.out.println("Введите текущий обменный курс: ");
        double kurs = scanner.nextDouble();
        double euroSumm = dollarSumm * kurs;
        System.out.println("В евро это будет: " + euroSumm);
    }
}
