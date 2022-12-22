package chapter12;

/* Для того чтобы проверить утверждение «орел и решка, при подбрасывании монеты,
выпадают примерно одинаковое количество раз», ученик подбросил монету сначала 10,
потом 100, потом 1000 раз. В каждой
серии он записывал, сколько раз выпадала «решка», сколько - «орел».
Напишите класс, который моделирует эти три серии и для каждой подсчитывает
количество выпадений «орла» и количество выпадений
«решки», и выводит на экран абсолютное и относительное значение
разницы между этими количествами.
 */

public class Task14 {
    public static void main(String[] args) {
        int tenTimesCoinEagle = 0;
        int tenTimesCoinTails = 0;
        int hundredTimesCoinTails = 0;
        int hundredTimesCoinEagle = 0;
        int thousandTimesCoinEagle = 0;
        int thousandTimesCoinTails = 0;
        for (int i = 1; i <= 10; i++) {
            int number = (int) (Math.random() * 3);
            if (number == 0) {
                tenTimesCoinEagle++;
            } else
                tenTimesCoinTails++;
        }
        for (int i = 1; i <= 100; i++) {
            int number = (int) (Math.random() * 3);
            if (number == 0) {
                hundredTimesCoinEagle++;
            } else
                hundredTimesCoinTails++;
        }
        for (int i = 1; i <= 1000; i++) {
            int number = (int) (Math.random() * 3);
            if (number == 0) {
                thousandTimesCoinEagle++;
            } else
                thousandTimesCoinTails++;
        }
        System.out.println("При десяти бросках орлов выпало - " + tenTimesCoinEagle
        + ", а решек - " + tenTimesCoinTails);
        System.out.println("При ста бросках орлов выпало - " + hundredTimesCoinEagle
                + ", а решек - " + hundredTimesCoinTails);
        System.out.println("При десяти бросках орлов выпало - " + thousandTimesCoinEagle
                + ", а решек - " + thousandTimesCoinTails);
    }
}
