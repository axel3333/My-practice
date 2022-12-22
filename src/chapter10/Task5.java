package chapter10;

/* Напишите класс, который генерирует случайное положительное двузначное число,
а затем генерирует три целых положительных числа, меньших первого.
 */

public class Task5 {
    public static void main(String[] args) {
        int number = (int) (10 + Math.random() * 90);
        int number1 = (int) (Math.random() * number);
        int number2 = (int) (Math.random() * number);
        int number3 = (int) (Math.random() * number);
        System.out.println(number);
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
