package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное число,
а затем генерирует случайную цифру.
Класс должен определить, встречается ли во введенном с клавиатуры
числе сгенерированная цифра (сколько раз и на каких позициях), и
вывести на экран соответствующую информацию.
 */

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int randomDigit = (int) (Math.random() * 10);
        int count = 0;
        int countNumber = 0;
        int numberSize = 1;
        int numberClone = number;
        while (numberClone % 10 != 0) {
            numberSize++;
            numberClone /= 10;
        }
        while (number % 10 != 0) {
            int temp = number % 10;
            if (temp == randomDigit) {
                countNumber++;
                System.out.println("Найдена на позиции - " + (numberSize - count));
                number /= 10;
            } else number /= 10;
            count++;
        }

        System.out.println("Случайное число - " + randomDigit);
//        System.out.println(numberSize);
        System.out.println("Всего - " + countNumber);
    }
}

