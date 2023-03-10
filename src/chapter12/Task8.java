package chapter12;

/* Напишите класс, который выводит на экран все целые положительные
двузначные числа, в которых разница между первой (число десятков) и
последней (число единиц) цифрами не превышает 3.
Класс должен также подсчитать количество этих чисел и вывести результат
на экран вместе с соответствующим текстовым сообщением.
 */

public class Task8 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x1 = i / 10;
            int x2 = i % 10;
            if (x1 - x2 >= 3){
                count++;
            }
        }
        System.out.println("Всего - " + count);
    }
}
