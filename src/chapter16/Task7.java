package chapter16;

/*
Напишите класс, который будет выводить на экран делители каждого
числа от 1до75.
 */

public class Task7 {
    public static void main(String[] args) {
        int down = 1, up = 75;
        for (int i = down; i <= up; i++){
            System.out.println("Делители " + i + ":");
            for (int j = down; j <= up; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
