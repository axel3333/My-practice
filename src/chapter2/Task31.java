package chapter2;
import java.util.Scanner;

/* Кинетическая энергия тела подсчитывается как половина произведения
массы тела на квадрат скорости тела.
Напишите класс, который принимает с клавиатуры два числа, первое
из которых - масса тела, а второе - его скорость.
Класс должен подсчитать и вывести на экран значение кинетической
энергии тела.
 */

public class Task31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите массу тела: ");
        int mass = scan.nextInt();
        System.out.println("Укажите скорость: ");
        int speed = scan.nextInt();
        int kineticEnergy = ((mass * (speed * speed))) /2;
        System.out.println("Значение кинетической энергии состаляет: " + kineticEnergy);
    }
}
