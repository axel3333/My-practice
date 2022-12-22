package chapter19;

public class Task13 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        newArray(mass);
        print(mass);
    }

    public static int[] newArray (int[] mass) {
        int down = 10, up = 99;
        for (int i = 0; i < mass.length; i++) {
            int temp = (int) (Math.random() * ((up - down) + 1) + down);
                while (temp % 9 != 0){
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
