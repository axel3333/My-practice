package chapter10;

/* Напишите класс, который генерирует и выводит на экран 2 случайных
целых числа из диапазона «однозначные» (включая и положительные,
и отрицательные).
После этого в отдельной строке класс должен вывести наибольшее из
этих двух чисел - с соответствующим текстовым сообщением.
 */

public class Task2 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 20 - 10);
        int number2 = (int) (Math.random() * 20 - 10);
        System.out.println(number1 + " " + number2);
        if (number1 > number2) {
            System.out.println("Первое число больше второго");
        } else if (number1 < number2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}
