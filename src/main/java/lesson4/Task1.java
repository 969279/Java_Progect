// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

package lesson4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        menu();
    }
    private static void menu() {
        LinkedList<String> messegeList = new LinkedList<>();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите команду: ");
            String choice = in.nextLine();
            if (choice.equalsIgnoreCase("exit")) {
                break;
            }
            checkChoice(choice);
            switch (choice) {
                case "input": // ввод строки
                    messegeList.addAll(inputString());
                    continue;
                case "print": // печать
                    printLinkedList(messegeList);
                    continue;
                case "revert": // удаление
                    revertLinkedList(messegeList);
                    continue;
                case "quit":
                    break;
            }
        }
    }
    private static boolean checkSize(LinkedList<String> messege) {
        if (messege.size() == 0) {
            System.out.println("Список строк пуст.");
            return false;
        } else {
            return true;
        }
    }
    private static void checkChoice(String text) {
        if (text.isBlank()) {
            System.out.println("Строка не должна быть пустой");
        }
        if (!text.equalsIgnoreCase("input")) {
            if (!text.equalsIgnoreCase("print")) {
                if (!text.equalsIgnoreCase("revert")) {
                    System.out.println("Команда не распознана!");
                    System.out.println("input - ввод строки;\nprint - печать; \nrevert - удаление; \nexit - выход.");
                }
            }
        }
    }
    private static void revertLinkedList(LinkedList<String> revertText) {
        if (checkSize(revertText)) {
            try {
                revertText.remove(revertText.size() - 2);
            } catch (Exception e) {
                System.out.println("Нет строк для удаления.");
                return;
            }
        System.out.println("Удалена предыдущая строка.");
        }
    }
    private static void printLinkedList(LinkedList<String> printText) {
        if (checkSize(printText)) {
            LinkedList<String> printStr = new LinkedList<>(printText);
            Collections.reverse(printStr);
            for (Object obj : printStr) {
                System.out.println(obj);
            }
        }
    }
    private static LinkedList<String> inputString() {

        Scanner in = new Scanner(System.in);
        LinkedList<String> inputList = new LinkedList<>();
        System.out.print("Введите строку: ");
        Collections.addAll(inputList, in.nextLine());
        System.out.println("Строка добавлена.");
        return inputList;
    }
}
