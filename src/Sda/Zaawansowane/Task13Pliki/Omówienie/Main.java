package Sda.Zaawansowane.Task13Pliki.Omówienie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    // !!!!!!!!!!!! STWÓRZ PLIK abc.txt W FOLDERZE Z PROJEKTEM !!!!!!!!!!!!!!!!

    public static void main(String[] args) throws IOException {

        System.out.println("scannerReadExample()");
        scannerReadExample();

        System.out.println("\nfinallyExample()");
        finallyExample();

        System.out.println("\ntryWithResourcesExample()");
        finallyExample();

        System.out.println("\nfilesReadExample()");
        filesReadExample();

        System.out.println("\nfilesWriteExample() - zapisze wiersze do pliku abc.txt");
        filesWriteExample();

        System.out.println("filesAppendExample() - doda wiersze do pliku abc.txt");
        filesAppendExample();
    }

    private static void scannerReadExample() throws IOException {
        //tworzymy strumień wejściowy pracujący na bajtach czytanych z pliku.
        FileInputStream fileInputStream = new FileInputStream("Sda/Zaawansowane/Task13Pliki/Omówienie/abc.txt");

        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
        fileInputStream.close();
    }

    private static void finallyExample() {
        FileInputStream fileInputStream = null;
        Scanner scanner = null;

        try {
            fileInputStream = new FileInputStream("Sda/Zaawansowane/Task13Pliki/Omówienie/abc.txt");
            scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            //obsługa nieistniejącego pliku
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void tryWithResourcesExample() {
        try (FileInputStream fileInputStream = new FileInputStream("Sda/Zaawansowane/Task13Pliki/Omówienie/abc.txt");
             Scanner scanner = new Scanner(fileInputStream)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void filesWriteExample() throws IOException {
        Path filePath = Paths.get("Sda/Zaawansowane/Task13Pliki/Omówienie/abc.txt");
        List<String> fileLines = Arrays.asList("AAAA", "BBBB", "CCCC");
        Files.write(filePath, fileLines);
    }

    private static void filesAppendExample() throws IOException {
        Path filePath = Paths.get("Sda/Zaawansowane/Task13Pliki/Omówienie/abc.txt");
        List<String> newFileLines = Arrays.asList("DDDD", "EEEE");
        Files.write(filePath, newFileLines, StandardOpenOption.APPEND);
    }

    private static void filesReadExample() throws IOException {
        // Utworzymy obiekt klasy Path reprezentujący ścieżkę pliku.
        Path filePath = Paths.get("Sda/Zaawansowane/Task13Pliki/Omówienie/abc.txt");
        // Odczytamy wiersze z pliku za pomocą metody statycznej readAllLines klasy Files.
        // Klasa Files została wprowadzona w 7 wersji Javy. Oferuje bogaty zestaw metod
        // wygodnych, gdy pracujemy z systemem plików.
        List<String> fileLines = Files.readAllLines(filePath);
        System.out.println(fileLines);
    }

}

