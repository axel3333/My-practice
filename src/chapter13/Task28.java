package chapter13;

/* Напишите класс, который принимает с клавиатуры две пары целых чисел:
• первая пара - значение и порядковый номер одного члена арифметической прогрессии;
• вторая пара - значение и порядковый номер другого члена этой
же прогрессии.
Класс должен вывести на экран все члены этой арифметической прогрессии,
расположенные между двумя введенными.
В случае если речь идет о двух соседних членах, на экран следует вывести
соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение и порядковый номер одного члена " +
                "арифметической прогрессии через пробел");
        String firstPair = scanner.nextLine();
        String [] parts = firstPair.split(" ");
        int firstValue = Integer.parseInt(parts[0]);
        int firstNumber = Integer.parseInt(parts[1]);
//        System.out.println(firstNumber + " " + firstValue);
        System.out.println("Введите значение и порядковый номер другого члена " +
                "арифметической прогрессии через пробел");
        String secondPair = scanner.nextLine();
        String [] parts2 = secondPair.split(" ");
        int secondValue = Integer.parseInt(parts2[0]);
        int secondNumber = Integer.parseInt(parts2[1]);
//        System.out.println(secondNumber + " " + secondValue);
        int numberOfValues = 0;
        int differenceOfValues = 0;
        if (firstNumber > secondNumber) {
            numberOfValues = firstNumber - secondNumber;
            differenceOfValues = firstValue - secondValue;
        }
        if (firstNumber < secondNumber) {
            numberOfValues = secondNumber - firstNumber;
            differenceOfValues = secondValue - firstValue;
        }
        if (numberOfValues == 1) {
            System.out.println("Введены соседние члены");
        }
        System.out.println(firstNumber + " " + firstValue);
        for (int i = 2; i <= numberOfValues; i++) {
            int result = differenceOfValues / numberOfValues * i;
            System.out.println(i + " " + result);
        }
        System.out.println(secondNumber + " " + secondValue);
    }
}
