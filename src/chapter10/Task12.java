package chapter10;
import java.util.Scanner;

/* Напишите класс, который повторяет предыдущее задание, но предоставляет
игроку получить, если он того захочет, еще и четвертую карту.
Это, например, можно сделать через ввод с клавиатуры значения, и,
если введено значение 1 (единица), то это означает согласие игрока на
получение четвертой карты.
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int down = 2;
        int up = 11;
        int firstCard = (int) (down + (up - down + 1) * Math.random());
        int secondCard = (int) (down + (up - down + 1) * Math.random());
        int thirdCard = (int) (down + (up - down + 1) * Math.random());
        int fouthCard;
        int summOfCards = firstCard + secondCard + thirdCard;
        System.out.println("У Вас - " + summOfCards + ", хотите взять еще карту? (1)");
        int playerChoise = scanner.nextInt();
        if (playerChoise == 1){
            fouthCard = (int) (down + (up - down + 1) * Math.random());
            summOfCards +=fouthCard;
        }
        if (summOfCards > 21) {
            System.out.println("Перебор, вы набрали - " + summOfCards);
        } else if (summOfCards < 21) {
            System.out.println("Недобор, вы набрали - " + summOfCards);
        } else if (summOfCards == 21) {
            System.out.println("Поздравляем, у Вас двадцать одно - " + summOfCards);
        }
    }
}
