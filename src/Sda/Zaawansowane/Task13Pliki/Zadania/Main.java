/*
package Sda.Zaawansowane.Task13Pliki.Zadania;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    }

    private static boolean printFile(String filename) {
        Path filePath = Paths.get(filename);

        try {
            Files.readAllLines(filePath)
                    .forEach(System.out::println);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    private static void saveToFile(String filename, List<String> fileLines, boolean append) {
        Path filePath = Paths.get(filename);

        try {
            if (append) {
                if (!Files.exists(filePath)) {
                    Files.createFile(filePath);
                }
                Files.write(filePath, fileLines, StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, fileLines);
            }
        } catch ()
    }
}
*/
