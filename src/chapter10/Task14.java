package chapter10;

/* Напишите класс, который создает и выводит на экран 5 случайных
целых чисел, заканчивающихся на ноль, и принадлежащих к диапазону
двузначных чисел.
 */

public class Task14 {
    public static void main(String[] args) {
        int x1 = (int) (Math.random() * 10) * 10;
        int x2 = (int) (Math.random() * 10) * 10;
        int x3 = (int) (Math.random() * 10) * 10;
        int x4 = (int) (Math.random() * 10) * 10;
        int x5 = (int) (Math.random() * 10) * 10;
        System.out.println(x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5);
    }
}
