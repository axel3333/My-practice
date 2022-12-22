package chapter9;
import java.util.Scanner;

/* На каждом этаже многоэтажного дома расположены три квартиры;
счет квартир идет слева направо. Например, на первом этаже квартира
№ 1 расположена слева, квартира № 2 - в центре, квартира № 3 -
справа, и так далее.
Напишите класс, который принимает с клавиатуры номер квартиры и выводит на
экран следующую информацию: на каком этаже она расположена, и какое место
(слева, справа или в центре) она занимает на этом этаже.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры");
        int number = scanner.nextInt();
        int numberOfApartmentsPerFloor = 3;
        int floorNumber = number / numberOfApartmentsPerFloor;
        if (number - floorNumber * numberOfApartmentsPerFloor == 1){
            System.out.println("Квартира расположена слева на " + floorNumber + " этаже");
        } else if (number - floorNumber * numberOfApartmentsPerFloor == 2) {
            System.out.println("Квартира расположена в центре на " + floorNumber + " этаже");
        } else if (number - floorNumber * numberOfApartmentsPerFloor == 3) {
            System.out.println("Квартира расположена справа на " + floorNumber + " этаже");
        }
    }
}
