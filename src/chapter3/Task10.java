package chapter3;
import java.util.Scanner;

/* Подрабатывая в течение года, Вася собрал себе определенную сумму на
поездку за границу, а родители добавили ему от себя еще некоторую
сумму.
Напишите класс, который принимает с клавиатуры три значения: первое -
сумма в рублях, заработанная Васей, второе - сумма в рублях,
которую ему дали родители, третье - курс рубля по отношению к евро.
Класс должен подсчитать и вывести на экран сумму в евро, которая
имеется у Васи для поездки за границу.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько заработал Вася: ");
        int moneyVasya = scanner.nextInt();
        System.out.println("Сколько дали родители: ");
        int moneyParents = scanner.nextInt();
        System.out.println("Курс рубля к евро:");
        double courseEuro = scanner.nextDouble();
        double budgetInEuro = (moneyVasya + moneyParents) / courseEuro;
        System.out.println("Всего у Васи денег в евро на поездку " + budgetInEuro);
    }

}
