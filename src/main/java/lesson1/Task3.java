// 3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть
// отличны от заданного, а остальные - равны ему.

package lesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int nums[] = {3, 2, 2, 3, 5, 8, 3, 3, 5, 1};
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        shiftArray(nums, num);
    }
    private static void shiftArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = number;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
    }
}

