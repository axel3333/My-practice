package chapter3;
import java.util.Scanner;

/* Во многих странах для измерения небольших размеров используется
не только единица длины «сантиметр», но и такая единица, как
«дюйм>> (1дюйм=2.54 сантиметра).
Напишите класс, который принимает с клавиатуры значение, равное
размеру в сантиметрах, и затем подсчитывает и выводит на экран это
же значение, но в дюймах.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение длины в сантиметрах: ");
        int santimetr = scanner.nextInt();
        double duim = santimetr / 2.54;
        System.out.println("Данная длина в дюймах будет равна: " + duim);
    }
}
