package chapter9;
import java.util.Scanner;

/* Определим «текстовую форму оценки» следующим образом: 1 или 2 -
«неудовлетворительно», 3 - «удовлетворительно», 4 - «хорошо», 5 -
«ОТЛИЧНО».
Напишите класс, который принимает с клавиатуры целое число и, если
оно соответствует оценке, выводит на экран соответствующую «текстовую
форму оценки». В случае если число не является оценкой, следует вывести на
экран соответствующее текстовое сообщение.
 */

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку");
        int number = scanner.nextInt();
        if (number == 1 || number == 2) {
            System.out.println("Неудовлетворительно");
        } else if (number == 3) {
            System.out.println("Удовлетворительно");
        } else if (number == 4) {
            System.out.println("Хорошо");
        } else if (number == 5) {
            System.out.println("Отлично");
        } else if (number > 5 || number <= 0) {
            System.out.println("Число не является оценкой");
        }
    }
}
