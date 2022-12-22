package chapter10;

/* Два человека играют в кости по следующим правилам: в каждом раунде
игры (а она состоит из 10 раундов) каждый из участников бросает
«кость» (кубик, на гранях которого значения от 1 до 6). В каждом раунде
определяется победитель или фиксируется состояние «ничья», в зависимости
от значения, которое выпало на кубике участника.
Напишите класс, который моделирует эту игру, указывая для каждого
раунда, кто из игроков набрал в этом раунде больше очков - или сообщая О СОСТОЯНИИ «НИЧЬЯ».
 */

public class Task13 {
    public static void main(String[] args) {
        int down = 1;
        int up = 6;
        int player1, player2;
        int player1Win = 0, player2Win = 0, draw = 0;
        for (int i = 0; i <= 10; i++) {
            player1 = (int) (down + (up - down + 1) * Math.random());
            player2 = (int) (down + (up - down + 1) * Math.random());
            if (player1 == player2) {
                System.out.println("Ничья");
                draw++;
            } else if (player1 > player2) {
                System.out.println("Выиграл игрок №1");
                player1Win++;
            } else {
                System.out.println("Выиграл игрок №2");
                player2Win++;
            }
        } if (player1Win > player2Win) {
            System.out.println("Игрок №1 победил набрав " + player1Win);
        } else if (player1Win < player2Win) {
            System.out.println("Игрок №2 победил набрав " + player2Win);
        }
    }
}
