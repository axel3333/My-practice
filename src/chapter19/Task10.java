package chapter19;

/*
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами,
каждое из которых делится на 3 с остатком 1.
 */

public class Task10 {
    public static void main(String[] args) {
        int []mass = new int[10];
        newArray(mass);
        print(mass);
    }
    public static int[] newArray (int[] mass) {
        int down = 10, up = 90;
        for (int i = 0; i < mass.length; i++) {
            int temp = (int) (Math.random() * ((up - down) + 1) + down);
            while (temp % 3 != 1) {
                temp++;
            }
            mass[i] = temp;
        }
        return mass;
    }

    public static void print (int mass[]) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
    }
}
