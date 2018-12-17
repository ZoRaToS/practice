package blackClower.java.practice;

import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер программы");
        int serialNumber = getNextIntegerNumber(scanner);
        int a, b, c, d, max = 0;

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
                break;
            case 44:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                task44(a, b);
                break;
            case 45:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число: ");
                c = getNextIntegerNumber(scanner);
                task45(a, b, c);
                break;
            case 46:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число: ");
                c = getNextIntegerNumber(scanner);
                task46(a, b, c);
                break;
            case 48:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число: ");
                c = getNextIntegerNumber(scanner);
                task48(a, b, c);
                break;
            case 49:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число: ");
                c = getNextIntegerNumber(scanner);
                System.out.print("Введите четвертое число: ");
                d = getNextIntegerNumber(scanner);
                task49(a, b, c, d, max);
                break;
            case 50:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число: ");
                c = getNextIntegerNumber(scanner);
                task50(a, b, c);
                break;
            case 51:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число: ");
                c = getNextIntegerNumber(scanner);
                task51(a, b, c);
                break;
            case 52:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число: ");
                c = getNextIntegerNumber(scanner);
                System.out.print("Введите четвертое число: ");
                d = getNextIntegerNumber(scanner);
                task52(a, b, c, d);
                break;
            case 53:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                task53(a, b);
                break;
            case 54:
                System.out.print("Введите первое число: ");
                a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                b = getNextIntegerNumber(scanner);
                System.out.print("Введите третье число: ");
                c = getNextIntegerNumber(scanner);
                task54(a, b, c);
                break;
            case 56:
                System.out.println("Выбирете исходное направление движения '11'-север, '12'-запад, '13'-юг, '14'-восток ");
                a = getNextIntegerNumber(scanner);
                System.out.println("Введите действие '0'-продолжить движение, '-1'-вправо, '1'- влево");
                b = getNextIntegerNumber(scanner);
                task56(a, b);
                break;
            case 59:
                System.out.print("Введите четырехзначное число ");
                a = getNextIntegerNumber(scanner);
                task59(a);
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
            if (a == 1 || a == 2 || a == 12) {
                System.out.println("Winter");
            } else if (a == 3 || a == 4 || a == 5) {
                System.out.println("Spring");
            } else if (a == 6 || a == 7 || a == 8) {
                System.out.println("Summer");
            } else if (a == 9 || a == 10 || a == 11) {
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

    /**
     * 44.	Пользователь вводит два числа. Если они не равны 10 и первое число четное, то вывести их сумму, иначе вывести их произведение.
     *
     * @param a
     * @param b
     */
    public static void task44(int a, int b) {
        if (a != 10 && b != 10 && a % 2 == 0) {
            System.out.println("Выполнение блока if.Сумма часел равна: " + (a + b));
        } else System.out.println("Выполнение блока else. Произведение чисел равно: " + (a * b));
    }

    /**
     * 45.	Пользователь вводит три числа. Если все числа больше 10 и первые два числа делятся на 3, то вывести yes, иначе no
     */
    public static void task45(int a, int b, int c) {
        if (a > 10 && b > 10 && c > 10 && a % 3 == 0 && b % 3 == 0) {
            System.out.println("Выполнение блока if: YES");
        } else System.out.println("Выполнение блока else: NO");
    }

    /**
     * 46.	Пользователь вводит три числа. Найти сумму тех чисел, которые делятся на 5. Если таких чисел нет, то вывести error.
     */
    public static void task46(int a, int b, int c) {
        if (a % 5 == 0 && b % 5 == 0 && c % 5 == 0) {
            System.out.println("Выполнение блока if. Сумма чисел которые делятся на 5: " + (a + b + c));
        } else if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("Выполнение блока else if. Сумма чисел которые делятся на 5 равна: " + (a + b));
        } else if (a % 5 == 0 && c % 5 == 0) {
            System.out.println("Выполнение блока else if1. Сумма чисел которые делятся на 5 равна: " + (a + c));
        } else if (b % 5 == 0 && c % 5 == 0) {
            System.out.println("Выполнение блока else if2. Сумма чисел которые делятся на 5 равна: " + (b + c));
        } else System.out.println("Выполнение блока else: Error");
    }

    /**
     * 47. Даны три числа. Найдите те два из них, сумма которых наибольшая.
     */
    public static void task48(int a, int b, int c) {
        if ((a + b) > (b + c) && (a + b) > (a + c)) {
            System.out.println("Самая болшая сумма у чисел " + a + " и " + b);
        } else if ((b + c) > (a + b) && (b + c) > (a + c)) {
            System.out.println("Самая болшая сумма у чисел " + b + " и " + c);
        } else System.out.println("Самая болшая сумма у чисел " + a + " и " + c);
    }

    /**
     * 49.	 Пользователь вводит четыре числа. Найдите наибольшее четное число среди них. Если оно не существует, выведите фразу "not found"
     */
    public static void task49(int a, int b, int c, int d, int max) {
        if (a % 2 == 0) {
            System.out.println("a - четное");
            max = a;
        } else System.out.println("a - не четное");
        if (b % 2 == 0) {
            System.out.println("b - четное");
            if (b > max)
                max = b;
        } else System.out.println("b - не четное");
        if (c % 2 == 0) {
            System.out.println("c - четное");
            if (c > max)
                max = c;
        } else System.out.println("c - не четное");
        if (d % 2 == 0) {
            System.out.println("d - четное");
            if (d > max)
                max = d;
        } else System.out.println("d - не четное");

        if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0 && d % 2 != 0) {
            System.out.println("NOT FOUND");
        }
        System.out.println("Максимальное четное число: " + max);
    }

    /**
     * 50.	Даны три числа. Написать "yes", если среди них есть одинаковые.
     */
    public static void task50(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    /**
     * 51.Даны три числа. Написать "yes", если можно взять какие-то два из них и в сумме получить третье
     */
    public static void task51(int a, int b, int c) {
        if ((a + b) == c || (a + c) == b || (b + c) == a) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    /**
     * 52.	Дано четыре числа, если первые два числа больше 5, третье число делится на 6, четвертое число не делится на 3, то вывести yes, иначе no.
     */
    public static void task52(int a, int b, int c, int d) {
        if (a > 5 && b > 5 && c % 6 == 0 && d % 3 != 0) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    /**
     * 53.	Дано два числа. Если хотя бы одно из них больше 30, то вывести yes, иначе no.
     */
    public static void task53(int a, int b) {
        if (a > 30 || b > 30) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    /**
     * 54.	Дано три числа. Если ровно два из них  меньше 5, то вывести yes, иначе вывести no.
     */
    public static void task54(int a, int b, int c) {
        if ((a < 5 && b < 5) || (b < 5 && c < 5) || (a < 5 && c < 5)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    /**
     * 56.
     *
     * @param napravlenie
     * @param action
     */
    public static void task56(int napravlenie, int action) {
        if (napravlenie == 11) {
            System.out.println("Направление на север");
            switch (action) {
                case -1:
                    System.out.println("Напрвление изменено на Восток");
                    break;
                case 0:
                    System.out.println("Направление не изменилось");
                    break;
                case 1:
                    System.out.println("Напрвление изменено на Запад");
            }
        }
        if (napravlenie == 12) {
            System.out.println("Направление на запад");
            switch (action) {
                case -1:
                    System.out.println("Напрвление изменено на Север");
                    break;
                case 0:
                    System.out.println("Направление не изменилось");
                    break;
                case 1:
                    System.out.println("Напрвление изменено на Юг");
            }
        }
        if (napravlenie == 13) {
            System.out.println("Направление на юг");
            switch (action) {
                case -1:
                    System.out.println("Напрвление изменено на Запад");
                    break;
                case 0:
                    System.out.println("Направление не изменилось");
                    break;
                case 1:
                    System.out.println("Напрвление изменено на Восток");
            }
        }
        if (napravlenie == 14) {
            System.out.println("Направление на восток");
            switch (action) {
                case -1:
                    System.out.println("Напрвление изменено на Юг");
                    break;
                case 0:
                    System.out.println("Направление не изменилось");
                    break;
                case 1:
                    System.out.println("Напрвление изменено на Север");
            }
        }
    }

    /**
     * 59.	Дано четырехзначное число. Верно ли, что цифры в нем расположены по убыванию? Например, 4311 - нет, 4321 - да, 5542 - нет, 5631 - нет, 9871 - да.
     */
    public static void task59(int a) {
        int m1, m2, m3, m4;
        m4 = a % 10;
        m3 = a / 10 % 10;
        m2 = a / 10 / 10 % 10;
        m1 = a / 10 / 10 / 10 % 10;
        System.out.println(m1 + "" + m2 + "" + m3 + "" + m4);
        if (m1 > m2 && m2 > m3 && m3 > m4) {
            System.out.println("Цифры в числе расположены по убыванию");
        } else System.out.println("Цифры в числе расположены не по убыванию");
    }


}



