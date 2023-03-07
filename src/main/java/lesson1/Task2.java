// 2. Написать метод, который определяет, является ли год високосным, и возвращает boolean
// (високосный - true, не високосный - false). Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.

package lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        if (leapYear()) {
            System.out.println("год високосный.");
        }
        else {
            System.out.println("год не високосный.");
        }
    }
    static boolean leapYear() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();
        if (year % 4 == 0 && year != 0 || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
