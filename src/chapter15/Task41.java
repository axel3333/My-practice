package chapter15;
import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры два целых положительных числа х и у.
Класс преобразует большее из них - в меньшее
следующим образом:
• если преобразуемое число - нечетное, оно уменьшается на 1;
• если преобразуемое число - четное, его делят на два.
Класс должен выполнить преобразование большего числа - к меньшему, указывая все
промежуточные значения; следует указать и общее
количество выполненных преобразований.
 */

public class Task41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        int big = 0, small = 0;
        int count = 0;
        if (first > second) {
            big = first;
            small = second;
        }
        if (first < second) {
            big = second;
            small = first;
        }
        while (big > small) {
            if (big % 2 != 0) {
                count++;
                big--;
                System.out.println(big);
            } else {
                count++;
                big /= 2;
                System.out.println(big);
            }
        }
        System.out.println("Всего преобразований - " + count);
    }
}
