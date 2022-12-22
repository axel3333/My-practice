package chapter15;
import java.util.Scanner;

/*
На прогулочном пароходе есть определенное количество мест для
взрослых и определенное количество мест для детей.
Напишите класс, который принимает с клавиатуры два целых положительных числа:
количество мест для взрослых и количество мест для детей. Затем класс должен принять
пары целых чисел: первое число в паре -
количество билетов для взрослых, второе - количество билетов для детей, которое покупает
очередная группа. Продажа билетов заканчивается
либо когда очередная пара содержит хотя бы одно неположительное значение,
либо когда нет возможности выполнить очередной заказ.
Класс должен вывести на экран следующую итоговую информацию:
• число групп, купивших билеты;
• количество взрослых и количество детей на пароходе;
• количество непроданных взрослых и детских мест.
 */

public class Task48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество мест для взрослых");
        int adult = scanner.nextInt();
        System.out.println("Количество мест для детей");
        int children = scanner.nextInt();
        int count = 0;
        int adultTickets = 0;
        int childrenTickets = 0;
        int adultOnBoard = 0;
        int childrenOnBoard = 0;
        while (true) {
            System.out.println("Сколько билетов Вы хотите купить");
            System.out.println("Взрослые");
            adultTickets = scanner.nextInt();
            System.out.println("Дети");
            childrenTickets = scanner.nextInt();
            if (adultTickets < 0 || childrenTickets < 0) {
                System.out.println("Введено отрицательное значение");
                break;
            }
            if (adult - adultTickets < 0 || children - childrenTickets < 0) {
                System.out.println("Билеты не хватит");
                break;
            }
            adult -= adultTickets;
            children -= childrenTickets;
            adultOnBoard += adultTickets;
            childrenOnBoard += childrenTickets;
            count++;
        }
        System.out.println("Всего групп, купивших билеты - " + count
        + "\nВзрослых на борту - " + adultOnBoard + "\nДетей на борту - " + childrenOnBoard
        + "\nНепроданных взрослых билетов - " + adult + "\nНепроданных детских билетов - "
        + children);
    }
}
