// Пусть дан произвольный список целых чисел,
// удалить из него четные числа (в языке уже есть что-то готовое для этого).

package lesson3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        oddArray();
    }

    private static void oddArray() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(30));
        }
        System.out.println(arrayList);
        arrayList.removeIf(i -> (i % 2) == 0);
        System.out.println(arrayList);
    }
}
