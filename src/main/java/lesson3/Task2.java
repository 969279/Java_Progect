// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

package lesson3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        arrayMinMaxAver(createArray());
    }

    private static void arrayMinMaxAver(ArrayList<Integer> array) {
        int numMax = Collections.max(array);
        int numMin = Collections.min(array);
        double average;
        double sum = 0;
            for (int j = 0; j < array.size(); j++) {
                sum += array.get(j);
            }
        average = sum / array.size();
        System.out.printf("Максимум в массиве: %d; минимум в массиве: %d", numMax, numMin);
        System.out.println();
        System.out.println("Среднее арифметическое массива: " + average);
    }
    private static ArrayList<Integer> createArray() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arrayList.add(random.nextInt(10));
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
