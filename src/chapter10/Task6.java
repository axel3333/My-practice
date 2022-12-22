package chapter10;

/* Напишите класс, который генерирует случайное положительное двузначное число,
а затем генерирует три целых двузначных числа, не
меньших первого.
 */

public class Task6 {
    public static void main(String[] args) {
        int number = 50;//(int) (10 + Math.random() * 90);
        int number1 = (int) (number + (100 - number)*Math.random());
        int number2 = (int) (number + (100 - number)*Math.random());
        int number3 = (int) (number + (100 - number)*Math.random());
        System.out.println(number);
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
