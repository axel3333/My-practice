package chapter11;

/* Напишите класс, который выводит на экран в строку все положительные
двузначные числа (в возрастающем порядке). Числа должны отделяться друг
от друга знаком «пробел». Перед началом вывода на экран
(в отдельной строке) следует вывести слово Старт, а после окончания
вывода чисел (тоже в отдельной строке)- слово Финиш.

 */

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Старт");
        for (int i = 10; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Финиш");
    }
}
