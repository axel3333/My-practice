package chapter19;

/*
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами, у
каждого из которых цифра десятков больше цифры единиц.
 */

public class Task12 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        newArray(mass);
        print(mass);
    }

    public static int[] newArray (int[] mass) {
        int down = 10, up = 89;
        for (int i = 0; i < mass.length; i++) {
            int temp = (int) (Math.random() * ((up - down) + 1) + down);
            int x1 = temp / 10;
            int x2 = temp % 10;
            if (x1 > x2) {
                mass[i] = temp;
            } else if (x1 == x2) {
                mass[i] = temp + 10;
            } else {
                mass[i] = (temp - (x2 - x1)) + 10;
            }
        }
        return mass;
    }

    public static void print (int mass[]) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
    }
}
