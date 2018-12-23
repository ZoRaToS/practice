package blackClower.java.practice;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер программы ");
        int serialNumber = getNextIntegerNumber(scanner);
        int arr[] = new int[20];

        switch (serialNumber) {
            case 1:
                displayArr(arr);
                break;
            case 2:
                arraySum(arr);
                break;
            case 3:
                maxElement(arr);
                break;
            case 4:
                minElement(arr);
                break;
            case 5:
                findeEvenElement(arr);
                break;
            case 6:
                findeEvenElementInRange(arr);
                break;
        }

    }

    /**
     * Вывеси элементы массива в прямом иобратном порядке
     */
    private static int getNextIntegerNumber(Scanner scannerInt) {
        while (!scannerInt.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число. Повторите пожалуйста ввод:");
            scannerInt.next();
        }
        return scannerInt.nextInt();
    }

    public static void displayArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {// вывод в прямом порядке
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");//
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {// вывод в обратном порядке
            System.out.print(arr[i] + " ");//
        }
    }

    /**
     * вычислить сумму элементов массива
     */
    public static void arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Сумма элементов массива: " + sum);
    }

    /**
     * Найти максимальны элемент массива
     *
     * @param arr
     */
    public static void maxElement(int arr[]) {
        int max = (int) Float.NEGATIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("максимальный элемент массива: " + max);
    }

    /**
     * Найти минимальный элемент массива и его индекс
     *
     * @param arr
     */
    public static void minElement(int arr[]) {
        int index = 0;
        int min = (int) Float.POSITIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] == min)
                index = i;
        }
        System.out.println();
        System.out.println("максимальный элемент массива: " + min);
        System.out.println("Индекс эемента " + index);
    }

    /**
     * Вычислить количество и сумму четных элементов массива
     */
    public static void findeEvenElement(int arr[]) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-100 + Math.random() * 200);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("Количество четных элементов: " + count);
        System.out.println("Сумма четных элементов: " + sum);
    }

    /**
     * Вычислить количество и сумму четных элементов массива нахдящихся в диапазоне 20...30
     */
    public static void findeEvenElementInRange(int arr[]) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-100 + Math.random() * 200);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0 & arr[i] >= 20 & arr[i] <= 30) {
                count++;
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("Количество четных элементов: " + count);
        System.out.println("Сумма четных элементов: " + sum);
    }

}
