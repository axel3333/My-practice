package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых числа,
образующих ответ на вопрос «который час?» (первое - часы, второе -
минуты, например, 15 и 42) и выводит на экран следующие значения
(каждое в отдельной строке): сколько секунд прошло с полуночи до
«данного момента» и сколько минут прошло за это же время, а также
сколько минут осталось до полуночи.
 */

public class Task30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Который сейчас час? ");
        int hour = scan.nextInt();
        System.out.println("Сколько сейчас минут? ");
        int minutes = scan.nextInt();
        int secondsInHour = 3600;
        int secondsInMinute = 60;
        int minutesInHour = 60;
        int minutesInDay = 24 * 60;
        System.out.println("С полуночи прошло уже " + (hour * secondsInHour + minutes * secondsInMinute)
        + " секунд, " + "или " + (hour * minutesInHour + minutes) + " минут");
        System.out.println("До полуночи осталось " + (minutesInDay - (hour * minutesInHour + minutes))
                + " минут");
    }
}
