package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное число,
а затем генерирует случайную цифру.
Класс должен определить, встречается ли во введенном с клавиатуры
числе сгенерированная цифра, и вывести на экран соответствующее
сообщение.
 */

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int yes = 0;
        int number = scanner.nextInt();
        int randomNumber = (int) (Math.random() * 10);
        System.out.println(number + " " + randomNumber);
        while (number % 10 != 0) {
            if (number % 10 == randomNumber && yes == 0) {
                yes = 1;
                number = number / 10;
            }
        }
        if (yes == 1) {
                System.out.println("Есть");
            } else {
                System.out.println("Нет");
            }
        }
    }
