package chapter2;

/* Напишите класс, который присваивает двум переменным значения, а
затем выводит на экран: в первой строке значения обеих переменных
(с поясняющими надписями), во второй - произведение этих переменных
(с поясняющей надписью), в третьей - сумму этих переменных (с поясняющей надписью).
 */

public class Task10 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("x равен " + x + ", y равен " + y);
        System.out.println("Произведение х и у равно " + (x * y));
        System.out.println("Сумма х и у равна " + (x + y));
    }
}
