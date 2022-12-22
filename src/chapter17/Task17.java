package chapter17;

/*
Напишите метод, который получает в качестве параметра целое число
большее или равное 10. Метод возвращает число без его крайней левой
цифры. Например, для параметра 1234 метод вернет 234, а для параметра
104 -4.
 */

public class Task17 {
    public static int lastNumbers (int a) {
        int temp = a;
        int count = 0;
        int result = 0;
        while(temp / 10 != 0) {
            count++;
            temp = temp / 10;
        }
        result = (int) (a % Math.pow(10, count));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lastNumbers(1034));
    }
}
