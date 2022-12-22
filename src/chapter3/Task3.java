package chapter3;
import java.util.Scanner;

/* Во многих странах для измерения небольших размеров используется
не только единица длины «сантиметр», но и такая единица, как
«дюйм» (1 дюйм= 2.54 сантиметра).
Напишите класс, который принимает с клавиатуры значение, равное
размеру в дюймах, и затем подсчитывает и выводит на экран это же
значение, но в сантиметрах.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение длины в дюймах: ");
        int duim = scanner.nextInt();
        double santimetr = duim * 2.54;
        System.out.println("Данная длина в сантиметрах будет равна: " + santimetr);
    }
}
