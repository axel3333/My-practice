package chapter12;

import java.util.Scanner;

/* Напишите класс, который принимает для каждого из 1234 учеников
района дату его рождения (день, месяц, год). Класс должен подсчитать
и вывести на экран число детей, родившихся зимой, весной, летом и
осенью.
 */

//TODO доделать



public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWinter = 0;
        int countSpring = 0;
        int countSummer = 0;
        int countAutumn = 0;
        String[] dates;
//        for (int i = 1; i <= 12; i++) {
            System.out.println("Введите дату рождения в формате - ДД ММ ГГГГ: ");
            String date = scanner.next();
            dates = date.split(" ");
            System.out.println(dates[1]);
//            if (dates[0].equals("01")) {
//                countWinter++;
//            }
        }
//        System.out.println(countWinter);
    }
//}

