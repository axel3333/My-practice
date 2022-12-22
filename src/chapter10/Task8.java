package chapter10;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры целое число и затем
генерирует («придумывает>>) случайное число из следующего диапазона:
• «центром диапазона» является введенное с клавиатуры число;
• количество чисел в диапазоне равно 11.
Класс должен определять, «угадал» ли компьютер введенное число и
выводить на экран одно из сообщений (в зависимости от соотношения
введенного и «придуманного» чисел):
• угадал - если числа совпали;
• слишком большое - если «придуманное» компьютером число
больше введенного с клавиатуры;
• слишком маленькое - если «придуманное» компьютером число
меньше введенного с клавиатуры.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int down = number - 5;
        int up = number + 5;
        int result = (int)(down + (up - down + 1) * Math.random());
        System.out.println(number + " " + result);
        if (number > result) {
            System.out.println("Придуманное число меньше");
        } else if (number < result) {
            System.out.println("Придуманное число больше");
        } else {
            System.out.println("Угадал");
        }
    }
}
