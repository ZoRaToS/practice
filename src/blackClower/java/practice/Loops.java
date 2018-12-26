package blackClower.java.practice;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер программы ");
        int serialNumber = getNextIntegerNumber(scanner);
        int arr[] = new int[10];
        int arr2[] = new int[5];
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
                findEvenElement(arr);
                break;
            case 6:
                findEvenElementInRange(arr);
                break;
            case 7:
                eventNotEventMaxMin(arr);
                break;
            case 8:
                findMaxThanAverage(arr);
                break;
            case 11:
                gernerateThirdArray(arr, arr2);
                break;
            case 12:
                arrayConcatenation(arr, arr2);
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
     * 1.Вывеси элементы массива в прямом иобратном порядке
     */
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
     * 2.Вычислить сумму элементов массива
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
     * 3.Найти максимальны элемент массива
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
     * 4.Найти минимальный элемент массива и его индекс
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
     * 5.Вычислить количество и сумму четных элементов массива
     */
    public static void findEvenElement(int arr[]) {
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
     * 6.Вычислить количество и сумму четных элементов массива нахдящихся в диапазоне 20...30
     */
    public static void findEvenElementInRange(int arr[]) {
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

    /**
     * 7.Вычислить максимальный из четных и минимальный из не четных элементов массива
     */
    public static void eventNotEventMaxMin(int arr[]) {
        int min = (int) Float.POSITIVE_INFINITY;
        int max = (int) Float.NEGATIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {       //вывод массива случайных чисел на экран
            arr[i] = (int) (-100 + Math.random() * 200);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {      //поиск максимального из четных
            if (arr[i] % 2 == 0 & arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {      //поиск минимального из не четных
            if (arr[i] % 2 != 0 & arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("максимальное число из четных: " + max);
        System.out.println("минимальное число из не четных: " + min);
    }

    /**
     * 10.Определить среднее арифметическое элементов массива и количество элементов которые больше значения среднего арифметического
     */
    public static void findMaxThanAverage(int arr[]) {
        double average;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println();
        average = (double) sum / arr.length;
        System.out.println("Среднее арифметическое: " + average);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        System.out.println("Количество элементов, которые больше сред. арифм.: " + count);
    }

    /**
     * 11.Создать массив как попарную сумму элементов двух массивов одинаковой длины
     */
    public static void gernerateThirdArray(int arr[], int arr2[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int arr3[] = new int[arr.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr[i] + arr2[i];
            System.out.print(arr3[i] + " ");
        }
    }

    /**
     * 12.Создать массив как конкатенацию двух массивов
     */
    public static void arrayConcatenation(int arr[], int arr2[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr2[i] + "\t");
        }
        int arr3[] = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr.length] = arr2[i];
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }

    /**
     * 13.Вмассиве поменять местами максимум и минимум
     */
    public static void changeMaxMin(int arr[]) {
        System.out.println("Начальный массив масссив");
        for (int i=0;i<arr.length;i++){

        }
    }

}



