package chapter11;

/* Напишите класс, который выводит на экран (в одну строку) 19 случайных чисел
из дr1апазона «однозначные числа». Каждое значение, равное О, следует вывести
на экран «В окружении» (вплотную к числу, перед ним и после него) символов«%» (процент).
 */

public class Task10 {
    public static void main(String[] args) {
        int down = 0, up = 9;
        for (int i = 1; i < 19; i++) {
            int result = (int) (Math.random() * 10);
            if (result == 0) {
                System.out.print("%" + result + "% ");
            } else {
                System.out.print(result + " ");
            }
        }
    }
}
