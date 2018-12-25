package blackClower.java.practice;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Cicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер программы ");
        int serialNumber = getNextIntegerNumber(scanner);
        switch (serialNumber) {
            case 79:
                task79();
                break;
            case 81:
                task81();
                break;
            case 82:
                task82();
                break;
            case 83:
                task83();
                break;
            case 84:
                task84();
                break;
        }

    }

    private static int getNextIntegerNumber(Scanner scannerInt) {
        while (!scannerInt.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число. Повторите пожалуйста ввод:");
            scannerInt.next();
        }
        return scannerInt.nextInt();
    }

    /**
     * 79.	Выведите на экран числа 1, 2, 3, 4, ..., 20.
     */
    public static void task79() {
        for (int i = 1; i < 21; i++) {
            System.out.print(i + "\t");
        }
    }

    /**
     * 81.	Вывести на экран числа 100, 96, 92, ... до последнего положительного включительно.
     */
    public static void task81() {
        for (int i = 100; i >= 0; i -= 4) {
            System.out.print(i + "\t");
        }
    }

    /**
     * 82.	Выведите на экран числа 1.2, 1.4, 1.6, ..., 2.8.
     */
    public static void task82() {
        for (float i = 1.2f; i <= 2.9; i += 0.2) {
            System.out.print(i + "\t");
        }
    }

    /**
     * 83.	Выведите следующие строки. Первая: 25  25.5  24.8. Вторая: 26 26.5 25.8.  И так далее. Последняя строка: 35 35.5 34.8.
     */
    public static void task83() {
        for (int i = 25; i < 36; i++) {
            System.out.println(i + " " + (i + 0.5) + " " + (i - 0.2));
        }
    }

    /**
     * 84.	Пользователь вводит курс доллара в рублях.
     * Показать таблицу цен 1$, 2$, ..., 100$ в рублях, третьим столбцом добавить количество кг конфет, которые можно купить на данные суммы, если цена 1 кг конфет равна 20 руб.
     * Пример: 1$ - 70 р - 3.5 кг и так далее (всего 100 строк).
     */
    public static void task84() {

        double rub, weight;
        for (int i = 1; i < 101; i++) {
            rub = i * 70;
            weight = rub / 20;
            System.out.println(i + "$ - " + rub + " руб. - " + weight + " кг ");
        }
    }

}
