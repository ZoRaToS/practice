package blackClower.java.practice;

import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер программы");
        int serialNumber = getNextIntegerNumber(scanner);
        int a;

        switch (serialNumber) {
            case 34:
                System.out.print("Введите число: ");
                a = getNextIntegerNumber(scanner);
                task34(a);
                break;
            case 35:
                System.out.print("Введите число: ");
                a = getNextIntegerNumber(scanner);
                task35(a);
            case 36:
                System.out.print("Введите номер месяца: ");
                a = getNextIntegerNumber(scanner);
                task36(a);
                break;
            case 40:
                System.out.print("Введите число: ");
                a = getNextIntegerNumber(scanner);
                task40(a);
                break;
            case 41:
                System.out.print("Введите число: ");
                a = getNextIntegerNumber(scanner);
                task41(a);
                break;
            case 42:
                System.out.print("Введите число: ");
                a = getNextIntegerNumber(scanner);
                task42(a);
                break;
            case 43:
                System.out.print("Введите номер месяца: ");
                a = getNextIntegerNumber(scanner);
                task43(a);
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
     * 34.	Дано число. Если оно больше 3, то увеличить число на 10, иначе уменьшить на 10.
     */
    public static void task34(int a) {
        if (a > 3) {
            a += 10;
            System.out.println("Выполнение блока if, a = " + a);
        } else {
            a -= 10;
            System.out.println("Выполнение блока else, a = " + a);
        }
    }

    /**
     * 35. Дано число. Если оно меньше 7, то вывести Yes, если больше 10, то вывести No, если равно 9, то вывести Error.
     */
    public static void task35(int a) {
        if (a < 7) {
            System.out.println("Yes");
        } else if (a > 10) {
            System.out.println("No");
        } else if (a == 9) {
            System.out.println("Error");
        }
    }

    /**
     * 36.	Пользователь вводит номер месяца, вывести название месяца
     */
    public static void task36(int a) {
        if (a > 0 && a < 12) {
            switch (a) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
            }
        } else System.out.println("Такого месяца не сушествует!!");
    }

    /**
     * 40.	Дано число. Если оно от -10 до 10 не включительно, то увеличить его на 5, иначе уменьшить на 10.
     */
    public static void task40(int a) {
        if (a > -10 && a < 10) {
            a += 5;
            System.out.println("Выполнение блока if, a = " + a);
        } else {
            a -= 10;
            System.out.println("Выполнение блока else, a = " + a);
        }
    }

    /**
     * 41.	Дано число. Если оно более 100 или менее -100, то занулить, иначе увеличить его на 1.
     */
    public static void task41(int a) {
        if (a > 100 || a < -100) {
            a = 0;
            System.out.println("Выполнение блока if, a = " + a);
        } else {
            a += 1;
            System.out.println("Выполнение блока else, a = " + a);
        }
    }

    /**
     * 42.	Дано число. Если оно от 2 до 5 включительно, то увеличить его на 10. Если оно от 7 до 40, то уменьшить на 100.
     * Если оно не более 0 или более 3000, то увеличить в 3 раза (то есть умножить на 3). Иначе занулить это число.
     */
    public static void task42(int a) {
        if (a >= 2 && a <= 5) {
            a += 10;
            System.out.println("Выполнение блока if, a = " + a);
        } else if (a > 7 && a < 40) {
            a -= 100;
            System.out.println("Выполнение блока else if, a = " + a);
        } else if (a <= 0 || a > 3000) {
            a *= 3;
            System.out.println("Выполнение блока else if (2), a = " + a);
        } else {
            a = 0;
            System.out.println("Выполнение блока else , a = " + a);
        }
    }
    /**
     * 43.	Пользователь вводит номер месяца. Вывести название поры года (весна, лето и т.д.)
     */
    public static void task43(int a) {
        if (a > 0 && a < 12) {
            if (a==1||a==2||a==12){
                System.out.println("Winter");
            }else if (a==3||a==4||a==5){
                System.out.println("Spring");
            }else if (a==6||a==7||a==8){
                System.out.println("Summer");
            }else if (a==9||a==10||a==11){
                System.out.println("Autumn");
            }
            switch (a) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
            }
        } else System.out.println("Такого месяца не сушествует!!");
    }

}
