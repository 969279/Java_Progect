// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> textList = new ArrayList<>(generateList());
        System.out.println(textList);
        ArrayList<String> worldsList = new ArrayList<>();

        for (int i = 0; i < textList.size(); i++) {
            try {
                Integer.parseInt(textList.get(i));
            } catch (NumberFormatException e) {
                worldsList.add(textList.get(i));
            }
        }
        System.out.println(worldsList);
    }

    private static ArrayList<String> generateList() {
        List<String> wordsList = List.of("Vena", "23", "14", "Moscow", "5", "wind", "case", "text", "name");
        ArrayList<String> textList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            textList.add(wordsList.get(random.nextInt(wordsList.size())));
        }
        return textList;
    }
}