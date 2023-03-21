// Пусть дан список сотрудников: .......
// Написать программу, которая найдёт и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.

package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> mapNameList = new HashMap<>();
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

        for (int i = 0; i < listNameSurname.length; i += 2){
            mapNameList.put(listNameSurname[i + 1], listNameSurname[i]);
        }
        for (Map.Entry<String, String> ent : mapNameList.entrySet()) {
            System.out.println(ent.getKey() + " " + ent.getValue());
        }

        //System.out.println(mapNameList.values());
//
//         {
//
//        }
//
//







//        Map<String, Integer> nameMap = new HashMap<>();
//        for (int i = 0; i < listNameSurname.length; i += 2) {
//            if (nameMap.containsKey(listNameSurname[i])) {
//                nameMap.replace(listNameSurname[i], nameMap.get(listNameSurname[i]) + 1);
//            } else {
//                nameMap.put(listNameSurname[i], 1);
//            }
//        }
//        System.out.println(nameMap);
//
//        Map<String, Integer> sortedNameMap = new HashMap<>();
//        int max = 1;
//        for (int value : nameMap.values()) {
//            if (value > max) {
//                max = value;
//            }
//        }
//        for (int i = max; i > 0; i--) {
//            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
//                String key = entry.getKey();
//                if (nameMap.get(key) == i) {
//                    sortedNameMap.put(key, nameMap.get(key));
//                }
//            }
//        }
//        System.out.println(sortedNameMap);
    }
}
