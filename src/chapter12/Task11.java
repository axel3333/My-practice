package chapter12;
import java.util.Scanner;

/* Для того чтобы определить, сколько учеников готовы поехать на экскурсию,
в школе провели опрос. Каждый из 200 учеников отметил в опроснике: «1»-
если он готов поехать на экскурсию, «О» - если не готов.
Напишите класс, который принимает с клавиатуры ответы учеников и
определяет количество учеников, готовых поехать на экскурсию.
Кроме того, класс должен определить, поедет ли на экскурсию большинство
участвовавших в опросе учеников или нет.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countYes = 0;
        int countNo = 0;
        for (int i = 1; i <= 200; i++){
            System.out.println("Вы поедете на экскурсию: 1 - Да, 0 - Нет");
            int result = scanner.nextInt();
            if (result == 1) {
                countYes++;
            }
            if (result == 0) {
                countNo++;
            }
        }
        if (countYes > countNo) {
            System.out.println("На экскурсию поедет - " + countYes
            + ", это большинство, экскурсия состоится");
        } else if (countYes < countNo) {
            System.out.println("На экскурсию поедет - " + countYes
                    + ", это меньше половины, экскурсия  не состоится");
        }
    }
}
