package chapter19;

/*
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными четными
числами.
 */

public class Task9 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        newArray(mass);
        print(mass);
    }

    public static int[] newArray (int[] mass) {
        int down = 10, up = 99;
        for (int i = 0; i < mass.length; i++) {
            int temp = (int) (Math.random() * ((up - down) + 1) + down);
            if (temp % 2 == 0) {
                mass[i] = temp;
            } else if (temp ==99) {
                mass[i] = temp - 1;
            } else {
                mass[i] = temp + 1;
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
