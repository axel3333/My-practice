package chapter10;

/* Напиши класс, представляющий версию игры из предыдущего задания - только в этом
случае компьютер должен играть сам с собой, то
есть и первое значение должно не вводиться с клавиатуры, а генерироваться классом.
 */

public class Task9 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        int down = number - 5;
        int up = number + 5;
        int result = (int)(down + (up - down + 1) * Math.random());
        System.out.println(number + " " + result);
        if (number > result) {
            System.out.println("Придуманное число меньше");
        } else if (number < result) {
            System.out.println("Придуманное число больше");
        } else {
            System.out.println("Угадал");
        }
    }
}
