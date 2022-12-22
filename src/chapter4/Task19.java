package chapter4;
import java.util.Scanner;

// Напишите класс, который выполняет «линейный сдвиг влево» для четырехзначного числа.

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number % 1000;
        int result = firstNumber * 10;
        System.out.println(result);
    }
}
