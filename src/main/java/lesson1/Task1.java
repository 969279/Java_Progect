// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы.

package lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = in.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        outputIntArray(array);
        rangeIntArray(array);
    }
    static void rangeIntArray(int[] array) {
        int min = array[0];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            else if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.printf("Максимум в массиве: %d; минимум в массиве: %d", max, min);
    }
    static void outputIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
