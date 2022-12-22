package chapter16;

/*
Старинная задача: сколько можно купить быков и коров на 100 рублей,
если плата за быка 10 рублей, за корову - 5 рублей (во всех вариантах).
Напишите класс, который выводит на экран все возможные варианты
решения задачи.
 */

public class Task6 {
    public static void main(String[] args) {
        int up = 100;
        int cowPrice = 5;
        int bullPrice = 10;
        System.out.println("Не покупая быков можно купить "
                + (up / cowPrice) + " коров");
        for (int bull = 1; bull < (up / bullPrice); bull++) {
            int cow = (up - (bullPrice * bull)) / cowPrice;
            System.out.println("Можно купить " + bull + " быков и " + cow
            + " коров");
        }
        System.out.println("Не покупая коров можно купить "
                + (up / bullPrice) + " быков");
    }
}
