package chapter13;

/* Назовем «стабильным» положительное двузначное число, которое при
умножении на 2 дает такое двузначное число, в котором сумма цифр
равна сумме цифр в двузначном числе до умножения.
Напишите класс, который выводит на экран все «стабильные» числа, а
также их количество и сумму этих чисел.
 */

public class Task19 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
    for (int i = 10; i <= 49; i++) {
        int y1 = i / 10;
        int y2 = i % 10;
        int number2 = i * 2;
        int x1 = number2 / 10;
        int x2 = number2 % 10;
        if ((y1 + y2) == (x1 + x2)) {
            System.out.print(i + " ");
            count++;
            sum += i;
        }
    }
        System.out.println("\nВсего " + count + " стабильных чисел");
        System.out.println("Сумма стабильных чисел равна - " + sum);
    }
}
