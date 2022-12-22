package chapter8;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры два целых положительных числа.
Класс должен определить, могут ли эти числа быть числителем (первое) и знаменателем (второе) дроби.
В случае если могут, класс должен определить, является ли эта дробь
правильной, неправильной или же она выражает целое число, а также
вывести на экран соответствующее текстовое сообщение.
В случае если числа не могут выражать дробь, следует вывести на экран
соответствующее объяснение.
 */

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число");
        int number2 = scanner.nextInt();
        if (number1 == 0 || number2 == 0){
            System.out.println("Числа не могут выражать дробь");
        } else if (number1 % number2 == 0) {
            System.out.println("Целое число");
        } else if (number1 > number2) {
            System.out.println("Дробь неправильная");
        } else if (number1 < number2) {
            System.out.println("Дробь правильная");
        }
    }
}
