package chapter15;
import  java.util.Scanner;


/*
Напишите класс, который принимает с клавиатуры целое положительное число х.
Класс должен найти наименьшее целое положительное
двузначное число, сумма цифр которого равна х.
Если такого двузначного числа не существует, следует вывести на экран
соответствующее текстовое сообщение.
 */


public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int count = 10;
        int flag = 0;
        while (count < 100) {
            int first = count / 10;
            int second = count % 10;
            int result = first + second;
            if (number == result) {
                System.out.println("Сумма цифр " + count + " равна " + number);
                flag++;
                break;
            }
            count++;
        }
        if (flag == 0) {
            System.out.println("Такого двузначного числа не существует");
        }
    }
}
