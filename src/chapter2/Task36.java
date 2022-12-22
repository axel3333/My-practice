package chapter2;
import java.util.Scanner;

/* Напишите класс, который принимает с клавиатуры фамилию пассажира и город, в который он вылетает.
Класс должен построить строковую переменную, которая будет содержать сообщение
Пассажир ... вылетает в ... , в котором вместо многоточий будут фигурировать
фамилия пассажира и название города, в который он вылетает.
Эту строковую переменную следует вывести на экран.
 */

public class Task36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Фамилия пассажира: ");
        String surname = scan.nextLine();
        System.out.println("Место назначения: ");
        String address = scan.nextLine();
        String message = "Пассажир " + surname + " вылетает в " + address;
        System.out.println(message);
    }
}
