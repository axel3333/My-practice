package chapter10;

/* Напишите класс, который генерирует и выводит на экран 3 случайных целых положительных
трехзначных числа.
Затем класс должен определить разницу между наибольшим и наименьшим из сгенерированных чисел
и вывести ее на экран вместе с соответствующим текстовым сообщением.
 */

public class Task18 {
    public static void main(String[] args) {
        int down = 100, up = 999;
        int number1 = (int) (down + (up - down + 1) * Math.random());
        int number2 = (int) (down + (up - down + 1) * Math.random());
        int number3 = (int) (down + (up - down + 1) * Math.random());
        System.out.println(number1 + " " + number2 + " " + number3);
        if (number1 > number3 && number2 < number3) {
            System.out.println("Разница между " + number1 + " и " + number2 + " равна "
                    + (number1 - number2));
        } else if (number1 > number2 && number1 > number3 && number2 > number3) {
            System.out.println("Разница между " + number1 + " и " + number3 + " равна "
                    + (number1 - number3));
        } else if (number2 > number3 && number2 > number1 && number3 > number1) {
            System.out.println("Разница между " + number2 + " и " + number1 + " равна "
                    + (number2 - number1));
        } else if (number2 > number1 && number2 > number3 && number3 < number1) {
            System.out.println("Разница между " + number2 + " и " + number3 + " равна "
                    + (number2 - number3));
        } else if (number3 > number1 && number3 > number2 && number1 > number2) {
            System.out.println("Разница между " + number3 + " и " + number2 + " равна "
                    + (number3 - number2));
        } else if (number3 > number2 && number1 < number2)
            System.out.println("Разница между " + number3 + " и " + number2 + " равна "
                + (number3 - number2));
    }
}
