package chapter15;

/*
Напишите класс, который находит наибольшее положительное двузначное число,
которое делится на произведение своих цифр.
 */

public class Task38 {
    public static void main(String[] args) {
        int end = 99;
        while (end >= 10) {
            int first = end / 10;
            int second = end % 10;
            int result = first * second;
            if (result == 0) {
                end--;
                continue;
            }
            if (end % result == 0) {
                System.out.println(end);
                break;
            }
            end--;
        }
    }
}
