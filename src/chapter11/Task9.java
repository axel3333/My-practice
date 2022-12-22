package chapter11;

/* Напишите класс, который выводит на экран (в одну строку) 20 случайных
чисел из диапазона 27". 73. Перед каждым значением, делящимся на 3
без остатка, следует вывести (вплотную к числу) символ «#» (решетка).
 */

public class Task9 {
    public static void main(String[] args) {
        int down = 27, up = 73;
        for (int i = 1; i < 20; i++) {
            int result = (int) (down + (up - down + 1) * Math.random());
            if (result % 3 == 0) {
                System.out.print(result + "# ");
            } else {
                System.out.print(result + " ");
            }
        }
    }
}
