package chapter15;
import java.util.Scanner;

/*
Наибольший общий делитель (НОД) двух целых положительных чисел
можно определить при помощи следующего метода: большее число
уменьшается на значение меньшего до тех пор, пока числа не оказываются равными.
Напишите класс, который принимает с клавиатуры два целых положительных
числа и определяет их НОД описанным методом.
 */

public class Task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
    }
}
