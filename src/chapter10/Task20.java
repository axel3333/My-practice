package chapter10;

/*
Напишите класс, который генерирует и выводит на экран сначала случайное положительное
однозначное число (цифру), а затем - случайное целое трехзначное.
Класс должен определить разницу между сгенерированной цифрой и
наибольшей цифрой сгенерированного случайного трехзначного числа.
 */

public class Task20 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int down = 100, up = 999;
        int b = (int) (down + (up - down + 1) * Math.random());
        System.out.println(a + " " + b);
        int x1 = b / 100;
        int x2 = b / 10 % 10;
        int x3 = b % 10;
        System.out.println(x1 + " " + x2 + " " + x3);
        if (x1 > x2 && x1 > x3 || x1 == x2 && x1 > x3 || x1 == x3 && x1 > x2){
            int result = Math.abs(a - x1);
            System.out.println("Разница между значениями равна " + result);
        } else if (x2 > x1 && x2 > x3 || x2 == x1 && x2 > x3 || x2 == x3 && x2 > x1) {
            int result = Math.abs(a - x2);
            System.out.println("Разница между значениями равна " + result);
        } else if (x3 > x1 && x3 > x2 || x3 == x1 && x3 > x2 || x3 == x2 && x3 > x1) {
            int result = Math.abs(a - x3);
            System.out.println("Разница между значениями равна " + result);
        }

    }
}
