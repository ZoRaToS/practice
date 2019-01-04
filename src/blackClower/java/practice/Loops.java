package blackClower.java.practice;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер программы ");
        int serialNumber = getNextIntegerNumber(scanner);
        int arr[] = new int[10];
        int arr2[] = new int[10];
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
            case 13:
                changeMaxMin(arr);
                break;
            case 14:
                removeMaxMin(arr);
                break;
            case 15:
                separateArray(arr);
                break;
            case 16:
                createArrayOfNotEven(arr, arr2);
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
     * 13.В массиве поменять местами максимум и минимум
     */
    public static void changeMaxMin(int arr[]) {
        int indexMin = 0;
        int indexMax = 0;
        int min = (int) Float.POSITIVE_INFINITY;
        int max = (int) Float.NEGATIVE_INFINITY;
        System.out.println("Начальный массив масссив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) { // поиск минимального элемента
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] == min)
                indexMin = i;
        }
        System.out.println("Индекс минимального элемента: " + indexMin);
        System.out.println("Минимальный элемент: " + min);

        for (int i = 0; i < arr.length; i++) { // поиск максимального элемента
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] == max)
                indexMax = i;
        }
        System.out.println("Индекс максимального элемента: " + indexMax);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Массив changeMaxMin");
        for (int i = 0; i < arr.length; i++) { // замена максимального и минимального элемента
            arr[indexMax] = min;
            arr[indexMin] = max;
            System.out.print(arr[i] + "\t");
        }
    }

    /**
     * 14.Вмассиве убрать максимум и минимум
     */
    public static void removeMaxMin(int arr[]) {
        int indexMin = 0;
        int indexMax = 0;
        int min = (int) Float.POSITIVE_INFINITY;
        int max = (int) Float.NEGATIVE_INFINITY;
        System.out.println("Начальный массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] == min)
                indexMin = i;
        }
        System.out.println("Минимальный элемент: " + min);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] == max)
                indexMax = i;
        }
        System.out.println("Максимальный элемент: " + max);

        for (int i = 0; i < arr.length; i++) {
            arr[indexMax] = 0;
            arr[indexMin] = 0;
            System.out.print(arr[i] + "\t");
        }
    }

    /**
     * 15.Массив поделить на два массива: положительных и отрицательных чисел
     */
    public static void separateArray(int arr[]) {
        System.out.println("Начальный массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr[i] + "\t");
        }
        int countNeg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                countNeg++;
        }
        int arrayPos[] = new int[arr.length - countNeg];
        int arrayNeg[] = new int[countNeg];
        int indexPos = 0;
        int indexNeg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arrayNeg[indexNeg] = arr[i];
                indexNeg++;
            } else {
                arrayPos[indexPos] = arr[i];
                indexPos++;
            }
        }
        System.out.println();
        System.out.println("Массив положительных чисел");
        for (int i = 0; i < arrayPos.length; i++) {
            System.out.print(arrayPos[i] + "\t");
        }
        System.out.println();
        System.out.println("Массив отрицательных чисел");
        for (int i = 0; i < arrayNeg.length; i++) {
            System.out.print(arrayNeg[i] + "\t");
        }

    }

    /**
     * 16.Создать третий массив из элементов двух массивов одинаковой длины, которые являются попарно не четными
     */
    public static void createArrayOfNotEven(int arr[], int arr2[]) {
        System.out.println("Первый массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("Второй массив");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr2[i] + "\t");
        }
        int countNotEven = 0;
        for (int i = 0; i < arr2.length; i++) { //поиск количества попарно не четных чисел в массивах
            if (arr[i] % 2 != 0 & arr2[i] % 2 != 0) {
                countNotEven++;
            }
        }
        System.out.println();
        System.out.println(countNotEven);
        int arr3[] = new int[countNotEven * 2];// объявление третьего массива
        int indexForArr3 = 0; //объявление переменной-счетчика для третьего массива
        for (int i = 0; i < arr3.length; i++) { //заполнение массива попарно не четными числами из предыдущих двух массивов
            if (arr[i] % 2 != 0 && arr2[i] % 2 != 0) {
                arr3[indexForArr3] = arr[i];
                arr3[indexForArr3 + 1] = arr2[i];
                indexForArr3 += 2;
            }
        }
        System.out.println();
        System.out.println("Ваш новый массив");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}




