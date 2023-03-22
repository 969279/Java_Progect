// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package lesson5;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Map<String, LinkedList<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Сидоров", "1935478, 4568363");
        addContact(phoneBook, "Иванов", "8945678");
        addContact(phoneBook, "Васечкин", "5935478, 24367452, 76485835");
        addContact(phoneBook, "Петров", "7935478");
        addContact(phoneBook, "Кошкина", "4935448");
        addContact(phoneBook, "Кузин", "8935471");

        printPhoneBook(phoneBook);

    }

    private static void printPhoneBook(Map<String, LinkedList<String>> map) {
        for (String key : map.keySet()) {
            System.out.printf("Фамилия: %8s - ", key);
            for (String value : map.get(key)) {
                System.out.printf("телефон: %s", value);
            }
            System.out.println();
        }
    }
    private static void addContact(Map<String, LinkedList<String>> map, String name, String number) {

        if (map.containsKey(name)) {
            map.get(name).add(number);
        } else {
            LinkedList<String> phone = new LinkedList<>();
            phone.add(number);
            map.put(name, phone);
        }
    }
}
