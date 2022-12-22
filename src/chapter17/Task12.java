package chapter17;

/*
Напишите метод, который принимает в качестве параметра
целое число и возвращает самую большую цифру в этом числе.
 */

public class Task12 {
    public static int biggestNumber(int a) {
        int maxNumber = 0;
        while(true) {
            if (a == 0) {
                break;
            }
            int temp = a % 10;
            if (temp > maxNumber) {
                maxNumber = temp;
            }
            a = a / 10;
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(biggestNumber(9254165));
    }
}
