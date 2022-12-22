package chapter10;

/* Напишите класс, который генерирует два случайных положительных двузначных числа,
обозначающих границы некоторого интервала, а затем
генерирует три целых положительных числа внутри данного интервала.
 */

public class Task7 {
    public static void main(String[] args) {
        int down = 10;
        int up = 99;
        int number1 = (int) (down +(up - down + 1) * Math.random());
        int number2 = (int) (down +(up - down + 1) * Math.random());
        if (number1 > number2) {
            down = number2;
            up = number1;
        } else {
            down = number1;
            up = number2;
        }
        int x1 = (int) (down +(up - down + 1) * Math.random());
        int x2 = (int) (down +(up - down + 1) * Math.random());
        int x3 = (int) (down +(up - down + 1) * Math.random());

        System.out.println(down + " " + up);

        System.out.println(x1 + " " + x2 + " " + x3);
    }
}
