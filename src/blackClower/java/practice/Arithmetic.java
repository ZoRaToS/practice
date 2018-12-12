package blackClower.java.practice;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер программы");
        int serialnumber = getNextIntegerNumber(scanner);
        //double firstN, secondN, thirdN;
        int a;
        int b;
        int c;
        double weightСandies;
        double weightBiscuit;
        double priceBiscuit;
        double priceСandies;
        switch (serialnumber) {
            case 1:
                task1();
                break;
            case 2:
                a = 2;
                b = 3;
                System.out.println(task2(a, b));
                break;
            case 3:
                System.out.println("Введите значение х: ");
                a = getNextIntegerNumber(scanner);
                System.out.println(task3(a));
                break;
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
            case 21:
                System.out.println("Поменяйте местами значения двух переменных, не используя дополнительных переменных.");

                method();
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

    private static double getNextDoubleNumber(Scanner scannerDouble) {
        while (!scannerDouble.hasNextDouble()) {
            System.out.println("Ошибка! Вы ввели не число. Повторите пожалуйста ввод:");
            scannerDouble.next();
        }
        return scannerDouble.nextDouble();
    }

    /**
     * 1.Вычислите 1/2+1/4. Ответ: 0.75
     */
    public static void task1() {
        double a = 1, b = 2, c = 4;
        double result = a / b + a / c;
        System.out.println("Результат при данных условиях: " + result);
    }

    /**
     * 2.Вычислите значение выражения (a+4b)(a−3b)+a2 при a=2 и b=3. Ответ:  -94
     */
    public static int task2(int a, int b) {
        int result = (int) ((a + 4 * b) * (a - 3 * b) + Math.pow(a, 2));
        return result;
    }

    /**
     * 3.Вычислите |x|+x5, если x=−2. Ответ: -30
     */
    public static int task3(int x) {
        int result = (int) (Math.abs(x) + Math.pow(x, 5));
        return result;
    }

    /**
     * 4.Вычислите значение выражения (x+1)2+3(x+1) при а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28
     */
    public static double task4(double x) {
        double result = Math.pow((x + 1), 2) + 3 * (x + 1);
        return result;
    }

    /**
     * 5.Вычислите значение выражения |x−5|−sinx/3+√x2+2014*cos2x−3 при x=−2.34. Ответ: -1.76911 (проверено!)
     */
    public static double task5(double x) {
        double result = (Math.abs(x - 5) - Math.sin(x)) / 3 + (Math.sqrt(Math.pow(x, 2) + 2014)) * Math.cos(2 * x) - 3;
        return result;
    }

    /**
     * 6.Вычислите значение выражения e(x−2)+|sin(x)|−x4⋅cos1x при x=3.6 Ответ: -156.1276
     */
    public static double task6(double x) {
        double result = Math.pow(Math.E, (x - 2)) + Math.abs(Math.sin(x)) - Math.pow(x, 4) * Math.cos(1 / x);
        return result;
    }

    /**
     * 7.Пользователь вводит два числа. Найдите сумму и произведение данных чисел.
     */
    public static void sumANDmultiplication(int a, int b) {

        System.out.println("Сумма чисел равна " + (a + b));
        System.out.println("Произведение чисел равно " + (a * b));

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

    /**
     * 21.Поменяйте местами значения двух переменных, не используя дополнительных переменных.
     */
    public static void method() {
        int a = 10;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
/**
 * Дано число a. Не пользуясь никакими арифметическими операциями кроме умножения, получите
 * а)a^4 за две операции; б) a^6 за три операции; в) a^15 за пять операций.
 */
public static void powOperation(int a){
    System.out.println("a^4 ");
}

}
