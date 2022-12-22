package chapter17;

/*
Напишите метод, который принимает в качестве параметра число и
возвращает:
• -1 - в случае если число отрицательное;
• О - в случае если число равно О;
• 1 - в случае если число положительное.
 */


public class Task8 {
    public static int metod(int i) {
        if (i > 0) {
            return 1;
        } else if (i < 0) {
            return -1;
        } else
            return 0;
    }

    public static void main(String[] args) {
        int x = -15;
        int y = 15;
        System.out.println(metod(x));
        System.out.println(metod(y));
    }
}
