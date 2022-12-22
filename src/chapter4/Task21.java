package chapter4;
import java.util.Scanner;

// Напишите класс, который выполняет «сдвиг влево по кругу» для четырехзначного числа.

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое четырехзначное число: ");
        int number = scanner.nextInt();
        int firstNumber = number / 1000;
        int middleNumbers = (number % 1000) / 10;
        int thirdNumber = number % 10;
        int result = middleNumbers * 100 + thirdNumber * 10 + firstNumber;
        System.out.println(result);
    }
}
