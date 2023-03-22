// Пусть дан список сотрудников: .......
// Написать программу, которая найдёт и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.

package lesson5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        String nameList = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] listNameSurname = nameList.split(" ");
        //createMapNameList(listNameSurname);
        Map<String, Integer> quantityName;
        quantityName = quantitySortedNameMap(listNameSurname);
        printMapNameList(quantityName);
        System.out.println();
        printMapNameList(sortByValue(quantityName));
    }

    private static Map<String, Integer> quantitySortedNameMap(String[] nameList) {
        Map<String, Integer> quantityName = new HashMap<>();
        for (int i = 0; i < nameList.length; i += 2) {
            if (quantityName.containsKey(nameList[i])) {
                quantityName.replace(nameList[i], quantityName.get(nameList[i]) + 1);
            } else {
                quantityName.put(nameList[i], 1);
            }
        }
        return quantityName;
    }

    private static void printMapNameList(Map<String, Integer> mapList) {

        for (Map.Entry<String, Integer> entryList : mapList.entrySet()) {
            System.out.println(entryList.getKey() + " -> " + entryList.getValue());
        }
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    private static Map<String, String> createMapNameList(String[] strNameSurname) {

        Map<String, String> mapNameList = new HashMap<>();
        for (int i = 0; i < strNameSurname.length; i += 2) {
            mapNameList.put(strNameSurname[i + 1], strNameSurname[i]);
        }
        System.out.println(mapNameList);
        return mapNameList;
    }

}
