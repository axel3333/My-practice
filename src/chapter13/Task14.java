package chapter13;
import java.util.Scanner;

/* Школа организовала распродажу в пользу стариков. На распродаже
продавались билеты двух видов:
• обычный билет участника распродажи;
• билет с правом посещения концерта.
Тот, кто приобрел более 10 обычных билетов участника,
получал дополнительно еще один такой же - бесплатно.
Напишите класс, который для каждого из 200 участников распродажи
будет принимать в качестве ввода количество билетов каждого вида,
приобретенных данным участником (два положительных целых числа).
Класс подсчитает и напечатает в качестве вывода число проданных
билетов каждого вида, а также число обычных билетов, выданных бесплатно.
 */

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordinaryTicketCount = 0;
        int vipTicketCount = 0;
        int bonusTicketCount = 0;
        for (int i = 1; i < 20; i++) {
            System.out.println("Количество приобретенных обычных билетов");
            int ordinaryTicket = scanner.nextInt();
            System.out.println("Количество приобретенных ВИП билетов");
            int vipTicket = scanner.nextInt();
            ordinaryTicketCount += ordinaryTicket;
            vipTicketCount += vipTicket;
            if (ordinaryTicket > 10) {
                bonusTicketCount++;
            }
        }
        System.out.println("Число проданных обычных билетов - " + ordinaryTicketCount);
        System.out.println("Число проданных ВИП билетов - " + vipTicketCount);
        System.out.println("Число бонусных билетов - " + bonusTicketCount);
    }
}
