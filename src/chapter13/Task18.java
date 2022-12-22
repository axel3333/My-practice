package chapter13;
import java.util.Scanner;

/* По правилам банка, на вклад ежемесячно начисляется определенная
сумма, которая зависит от ежемесячного процента на вклад.
Например, на вкладе в 10000 рублей с месячным процентом 10% через
месяц будет сумма 11000 рублей (1000 плюс 10% от 1000), а еще через
месяц - 12100 (11000 плюс 10% от 11000).
Напишите класс, который принимает с клавиатуры три значения:
• сумму на вкладе;
• месячный процент;
• количество месяцев, в течение которых начисляются проценты на
вклад.
Класс подсчитает и выведет на экран итоговую сумму на вкладе.
 */

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму на вкладе");
        double deposit = scanner.nextDouble();
        System.out.println("Введите процентную ставку за месяц");
        double interestRate = scanner.nextDouble();
        System.out.println("Введите количество месяцев");
        int numberOfMonths = scanner.nextInt();
        for (int i = 1; i <= numberOfMonths; i++) {
            double result = deposit + (deposit / 100 * interestRate);
            deposit = result;
        }
        System.out.println("Итоговая сумма вклада " + String.format("%.2f",deposit));
    }
}
