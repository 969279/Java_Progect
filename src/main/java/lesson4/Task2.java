//  Пусть дан LinkedList с несколькими элементами.
//  Реализуйте метод, который вернет “перевернутый” список.

package lesson4;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<String> words = List.of("1", "two", "3", "4", "five", "6", "7", "8");
        LinkedList<String> textList = new LinkedList<>();
        textList.addAll(words);
        System.out.println("Исходный список: " + textList);
        System.out.println("Метод 1: " + reversListOne(textList));
        System.out.println("Метод 2: " + reversListTwo(textList));
    }

    private static LinkedList<String> reversListTwo(LinkedList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++){
            wordList.addFirst(wordList.getLast());
            wordList.removeLast();
        }
        return wordList;
    }

    private static LinkedList<String> reversListOne(LinkedList<String> text) {
        Collections.reverse(text);
        return text;
    }

}
