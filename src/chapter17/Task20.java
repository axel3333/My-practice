package chapter17;

/*
Напишите метод, который принимает в качестве параметра целое
число и выводит на экран в одну строку через пробел все делители
этого числа (не считая 1 и самого числа). В случае если у числа нет ни
одного делителя - на экран выводится соответствующее текстовое
сообщение.
 */

public class Task20 {
    public static void allDivisors(int a) {
        int count = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("\nУ числа нет ни одного делителя");
        }
    }

    public static void main(String[] args) {
        allDivisors(15);
    }
}
