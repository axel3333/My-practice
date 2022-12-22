package chapter10;

/* Как известно, при игре в «двадцать одно» («очко») у каждой карты есть
численное значение. Напишите класс, который «выбрасывает три карты» (генерирует три
случайных числа - в каких пределах?) и определяет, какой из вариантов (недобор, перебор,
«очко») реализовался.
 */

public class Task11 {
    public static void main(String[] args) {
        int down = 2;
        int up = 11;
        int firstCard = (int) (down + (up - down + 1) * Math.random());
        int secondCard = (int) (down + (up - down + 1) * Math.random());
        int thirdCard = (int) (down + (up - down + 1) * Math.random());
        int summOfCards = firstCard + secondCard + thirdCard;
        if (summOfCards > 21) {
            System.out.println("Перебор, вы набрали - " + summOfCards);
        } else if (summOfCards < 21) {
            System.out.println("Недобор, вы набрали - " + summOfCards);
        } else {
            System.out.println("Поздравляем, у Вас двадцать одно - " + summOfCards);
        }
    }
}
