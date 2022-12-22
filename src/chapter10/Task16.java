package chapter10;

/* Напишите класс, который генерирует и выводит на экран два случайных числа из диапазона от 17 до 94.
Класс должен проверить, какое из двух чисел, первое или второе, было
больше, и вывести на экран соответствующее текстовое сообщение.
Кроме того, класс должен определить наименьшую цифру из всех фигурирующих в этих числах
и вывести на экран соответствующее текстовое сообщение.
 */

public class Task16 {
    public static void main(String[] args) {
        int down = 17, up = 94;
        int number1 = (int) (down + (up - down + 1) * Math.random());
        int number2 = (int) (down + (up - down + 1) * Math.random());
        System.out.println(number1 + " " + number2);
        if (number1 > number2)
            System.out.println("Больше первое число");
        else if (number1 < number2)
            System.out.println("Больше второе число");
        else {
            System.out.println("Числа равны");
        }
        int x11 = number1 / 10;
        int x12 = number1 % 10;
        int x21 = number2 / 10;
        int x22 = number2 % 10;
        if (x11 < x12 && x11 < x21 && x11 < x22)
            System.out.println("Наименьшее число " + x11);
        if (x12 < x11 && x12 < x21 && x12 < x22) {
            System.out.println("Наименьшее число " + x12);
        } if (x21 < x11 && x21 < x12 && x21 < x22) {
            System.out.println("Наименьшее число " + x21);
        } if (x22 < x11 && x22 < x12 && x22 < x21) {
            System.out.println("Наименьшее число " + x22);
        }
    }
}
