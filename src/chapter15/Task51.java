package chapter15;
import java.util.Scanner;

/*
Банк готов предоставить клиенту право производить операции на банковском счете при условии,
что банковский овердрафт («минус>>, отрицательная сумма на счету) не превысит определенной суммы.
Напишите класс, который принимает с клавиатуры два значения: первое - величина допустимого овердрафта,
второе - сумма на счету клиента в данный момент.
Затем класс должен принять с клавиатуры серию чисел, каждое из которых - размер операции в рублях,
которую клиент выполняет на своем банковском счете. Положительное значение - клиент вносит деньги на
счет, отрицательное значение - клиент снимает деньги со счета.
Ввод данных завершается либо при превышении клиентом разрешенного овердрафта, либо при введении
нулевого значения.
Класс должен после каждой операции указывать сумму на счете клиента,
а также количество операций вложения и количество операций снятия,
произведенных клиентом.
 */

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите овердрафт");
        int overdraft = scanner.nextInt();
        System.out.println("Введите баланс на счету");
        int balance = scanner.nextInt();
        int fillingUpAccount = 0;
        int withdrawFromTheAccount = 0;
        while (true) {
            System.out.println("Введите операцию");
            int operation = scanner.nextInt();
            if (operation == 0) {
                System.out.println("Работа окончена");
                break;
            }
            if (balance + operation < overdraft) {
                System.out.println("Превышение овердрафта");
                break;
            }
            if (operation < 0) {
                balance += operation;
                withdrawFromTheAccount++;
            }
            if (operation > 0) {
                balance += operation;
                fillingUpAccount++;
            }
            System.out.println("Баланс на счету - " + balance);
            System.out.println("Операций вложения - " + withdrawFromTheAccount);
            System.out.println("Операций снятия - " + fillingUpAccount);
        }
    }
}
