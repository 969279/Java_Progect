//1. Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).
package lesson2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String massageStr = in.next();
        //String text = "qwerttrewq";
        System.out.println(stringPalindrome(massageStr));
    }
    private static boolean stringPalindrome(String text) {

        StringBuilder backStr = new StringBuilder();
        String cleanStr = text.replaceAll("\\s+", "");
        char[] tempStr = cleanStr.toCharArray();
        for (int i = tempStr.length - 1; i >= 0; i--) {
            backStr.append(tempStr[i]);
        }
        return (backStr.toString()).equals(cleanStr);
    }
}
