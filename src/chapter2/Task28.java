package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число,
представляющее собой расстояние в единицах, принятых на флоте -
в кабельтовых. После этого следует вывести на экран это же расстояние в
метрах и километрах. Известно, что 1кабельтов=185.2 метра
 */

public class Task28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите расстояние в кабельтовых единицах ");
        int x = scan.nextInt();
        double cabelt = 185.2;
        double y = x * cabelt;
        System.out.println("Расстояние в метрах " + y + "и в километрах " + (y / 1000));
    }
}
