// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию.
package lesson6;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        List<Laptop> notebook = new ArrayList<>();

        notebook.add(new Laptop("ASUS", "A516JP-EJ461", "15.6", "Core i7 1.3ГГц", 512, 16));
        notebook.add(new Laptop("HP", "15-DW3170", "15.6", "Core i7 2.8ГГц", 512, 8));
        notebook.add(new Laptop("Apple", "MacBook Pro A2338", "13.3", "Apple M2 8 core", 512, 8));
        notebook.add(new Laptop("ASUS", "15-X515EA-EJ1413", "15.6", "Intel Pentium 2.0ГГц", 256, 8));
        notebook.add(new Laptop("ASUS", "19-X19EA-EJ1469", "19", "Intel Pentium 2.0ГГц", 256, 16));

        List<Laptop> choice = filter(notebook, laptopFilter());
        outputChoice((ArrayList) choice);
    }
    private static void outputChoice(ArrayList<Object> dataList) {
        if (dataList.size() != 0) {
            for (Object value : dataList) {
                System.out.println(value);
            }
        } else {
            System.out.println("Нет подходящих вариантов.");
        }
    }
    public static List<Laptop> filter(List<Laptop> notebooks, Map<String, Object> filters) {
        List<Laptop> foundLaptop = new ArrayList<>();
        for (Laptop laptop : notebooks) {
            boolean result = true;
            for (String Key : filters.keySet()) {
                Object filterValue = filters.get(Key);
                switch (Key) {
                    case "brand" -> {
                        if (!laptop.getBrand().equalsIgnoreCase((String) filterValue)) {
                            result = false;
                        }
                    }
                    case "display" -> {
                        if (!laptop.getDisplay().equalsIgnoreCase((String) filterValue)) {
                            result = false;
                        }
                    }
                    case "hdd" -> {
                        if (laptop.getHdd() != (int) filterValue) {
                            result = false;
                        }
                    }
                    case "ram" -> {
                        if (laptop.getRam() != (int) filterValue) {
                            result = false;
                        }
                    }
                }
                if (result) {
                    foundLaptop.add(laptop);
                } else break;
            }
        }
        return foundLaptop;
    }
    private static Map<String, Object> laptopFilter() {
        Map<String, Object> filter = new HashMap<>();
        System.out.println("""
                Бренд: цифра -1-
                Размер дисплея: цифра -2-
                Объем HDD: цифра -3-
                Объем RAM: цифра -4-
                Выберите критерий фильтрации: \s""");
        Scanner scan = new Scanner(System.in);
        int filterNumber = scan.nextInt();
        String key = "";
        switch (filterNumber) {
            case 1 -> {
                key = "brand";
                System.out.println("Введите бренд: ");
                String searchBrand = scan.next();
                filter.put(key, searchBrand);
            }
            case 2 -> {
                key = "display";
                System.out.println("Введите размер дисплея в дюймах: ");
                String displaySize = scan.next();
                filter.put(key, displaySize);
            }
            case 3 -> {
                key = "hdd";
                System.out.println("Введите объем HDD в Гб: ");
                int hddSize = scan.nextInt();
                filter.put(key, hddSize);
            }
            case 4 -> {
                key = "ram";
                System.out.println("Введите объем RAM в Гб: ");
                int ramSize = scan.nextInt();
                filter.put(key, ramSize);
            }
        } return filter;
    }
}



