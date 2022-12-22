package chapter19;
/*
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами, у
каждого из которых цифра десятков равна цифре единиц.
 */

public class Task11 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        newArray(mass);
        print(mass);
    }

    public static int[] newArray (int[] mass) {
        int down = 10, up = 98;
        for (int i = 0; i < mass.length; i++) {
            int temp = (int) (Math.random() * ((up - down) + 1) + down);
            while (temp % 11 != 0) {
                temp++;
            }
            mass [i] = temp;
        }
        return mass;
    }

    public static void print (int mass[]) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
    }
}
