package chapter19;

/*
Напишите метод, который получает в качестве параметра массив и
заполняет его случайными числами в диапазоне О ... 99.
 */



public class Task7 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        newArray(mass);
        print(mass);
    }

    public static int[] newArray(int [] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass [i] = (int) (Math.random() * 100);
        }
        return mass;
    }

    public static void print (int mass[]) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
    }
}
