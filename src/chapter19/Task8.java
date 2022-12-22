package chapter19;

/*
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами.
 */

public class Task8 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        newArray(mass);
        print(mass);
    }

    public static int[] newArray (int[] mass) {
        int down = 10, up = 99;
        for (int i = 0; i < mass.length; i++) {
            mass [i] = (int) (Math.random() * ((up - down) + 1) + down);
        }
        return mass;
    }

    public static void print (int mass[]) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
    }
}
