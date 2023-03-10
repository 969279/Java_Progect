//2. Напишите метод, который составит строку, состоящую из 100 повторений
// слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task2 {

    public static void main(String[] args) {

        String text = "TEST";
        int replay = 100;
        String PathToSaveFile = "C:\\Users\\Alexandr\\Desktop\\JavaProgect\\" +
                "JavaProgect\\src\\main\\java\\lesson2\\text.txt";
        saveToFile(PathToSaveFile, strBuild(text, replay));
        }
    private static void saveToFile(String way, String message) {

        String pathToFile = checkPathToFile(way);
        try(PrintWriter pw = new PrintWriter(pathToFile)) {
            pw.print(message);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static String checkPathToFile(String path) {

        File dirOfFile = new File(path);
        if (!dirOfFile.isFile()) {
            throw new RuntimeException("Файл для сохранения данных не найден!");
        }
        return path;
    }
    private static String strBuild(String word, int size) {

        StringBuilder stringWord = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringWord.append(word).append(" ");
        }
        return stringWord.toString();
    }
}
