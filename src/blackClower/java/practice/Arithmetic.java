package blackClower.java.practice;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер программы");
        int serialnumber = getNextIntegerNumber(scanner);
        int a;
        int b;
        int c;
        double weightСandies;
        double weightBiscuit;
        double priceBiscuit;
        double priceСandies;
        switch (serialnumber) {
            case 15:
                System.out.println("15.Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа.");
                System.out.println("Введите целое число с клавиатуры");
                a = getNextIntegerNumber(scanner);
                degreeOfnumber(a);
                break;
            case 16:
                System.out.println("16.Пользователь вводит три числа. Увеличьте первое число в два раза, второе числа уменьшите на 3, третье число возведите в квадрат и затем найдите сумму новых трех чисел.");
                System.out.print("Первое число : ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Второе число : ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Третье число : ");
                c = getNextIntegerNumber(scanner);
                numberOperation(a, b, c);
                break;
            case 17:
                System.out.println("17.Пользователь вводит три числа. Найдите среднее арифметическое этих чисел, а также разность удвоенной суммы первого и третьего чисел и утроенного второго числа.");
                System.out.print("Введите первое число : ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число : ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число : ");
                c = getNextIntegerNumber(scanner);
                numberOperation1(a, b, c);
                break;
            case 18:
                System.out.println("18.Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата.");
                System.out.print("Введите сторону квадрата: ");
                a = getNextIntegerNumber(scanner);
                squareAreaPerimetr(a);
                break;
            case 19:
                System.out.println("19.Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость: а) одной покупки из 300 г конфет и 400 г печенья; б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.");
                System.out.print("Введите цену конфет за кг: ");
                priceСandies = getNextDoubleNumber(scanner);
                System.out.println("Введите вес конфет в кг :");
                weightСandies = getNextDoubleNumber(scanner);
                System.out.print("Введите цену печенья за кг: ");
                priceBiscuit = getNextDoubleNumber(scanner);
                System.out.print("Введите вес печенья за кг: ");
                weightBiscuit = getNextDoubleNumber(scanner);
                magazin(priceСandies, weightСandies, priceBiscuit, weightBiscuit);
                break;
            case 24:
                System.out.println("24.Пользователь вводит количество дней, указывает процент скидки и вводит сумму.\n" +
                        "Рассчитать прибыль, если за каждый день сумма увеличивается на 3 $  и затем применяется скидка, то есть итоговая сумма еще увеличивается на данное число процентов.");
                System.out.print("Укажите процент скидки: ");
                int discount = getNextIntegerNumber(scanner);
                System.out.print("Укажите сумму: ");
                int price = getNextIntegerNumber(scanner);
                System.out.print("Укажите количество дней: ");
                int numberOfdays = getNextIntegerNumber(scanner);
                profitCalculation(discount, price, numberOfdays);
                break;
            case 666:
                method();
        }

    }

    private static int getNextIntegerNumber(Scanner scannerInt) {
        while (!scannerInt.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число. Повторите пожалуйста ввод:");
            scannerInt.next();
        }
        return scannerInt.nextInt();
    }

    private static double getNextDoubleNumber(Scanner scannerDouble) {
        while (!scannerDouble.hasNextDouble()) {
            System.out.println("Ошибка! Вы ввели не число. Повторите пожалуйста ввод:");
            scannerDouble.next();
        }
        return scannerDouble.nextDouble();
    }

    /**
     * 15.	Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа.
     */
    public static void degreeOfnumber(int a) {
        System.out.println("Квадрат числа " + a + " равен " + Math.pow(a, 2));
        System.out.println("Куб числа " + a + " равен " + Math.pow(a, 3));
    }

    /**
     * 16.Пользователь вводит три числа. Увеличьте первое число в два раза, второе числа уменьшите на 3, третье число возведите в квадрат и затем найдите сумму новых трех чисел.
     */
    public static void numberOperation(int a, int b, int c) {
        System.out.println("Первое число : " + (a *= 2));
        System.out.println("Второе число : " + (b -= 3));
        System.out.println("Третье число : " + (c *= c));
        System.out.println("Сумма новых трех чисел равна :" + (a + b + c));
    }

    /**
     * 17.	Пользователь вводит три числа. Найдите среднее арифметическое этих чисел, а также разность удвоенной суммы первого и третьего чисел и утроенного второго числа.
     */
    public static void numberOperation1(int a, int b, int c) {
        double average = (a + b + c) / 3;
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Разность удвоенной суммы первого и третьего чисел и утроенного второго числа: " + (2 * (a + c) - 3 * b));
    }

    /**
     * 18.	Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата.
     */
    public static void squareAreaPerimetr(int a) {
        System.out.println("Площадь квадрата: " + (int) (Math.pow(a, 2)));
        System.out.println("Периметр квадрата: " + (4 * a));
    }

    /**
     * 19.	Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость: а) одной покупки из 300 г конфет и 400 г печенья; б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
     */
    public static void magazin(double weightСandies, double weightBiscuit, double priceBiscuit, double priceСandies) {
        double totalPriceOne = weightСandies * priceСandies + weightBiscuit * priceBiscuit;
        System.out.println("Стоимость одной покупки из 300 г конфет и 400 г печенья составляет: " + totalPriceOne);
        double totalPriceThee = 3 * (weightСandies * priceСandies + weightBiscuit * priceBiscuit);
        System.out.println("Стоимость трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет составляет: " + totalPriceThee);
    }

    /**
     * 24.	Пользователь вводит количество дней, указывает процент скидки и вводит сумму.
     * Рассчитать прибыль, если за каждый день сумма увеличивается на 3 $  и затем применяется скидка, то есть итоговая сумма еще увеличивается на данное число процентов.
     */
    public static void profitCalculation(int discount, int price, int numberOfdays) {
        double profit[] = new double[numberOfdays];
        double sumProfit = 0.0;
        for (int i = 0; i < numberOfdays; i++) {
            price += 3;
            profit[i] = price - (price * discount / 100);
            sumProfit = sumProfit + profit[i];
        }
        System.out.println("Прибиль за " + numberOfdays + " дней составит: " + sumProfit);
    }

    public static void method() {
        int a = 10;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }


}
