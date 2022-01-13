package Sda.Zaawansowane.Task13Pliki.Zadania;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Person {

    private String firstName;
    private String lastName;
    private int yearOfBirth;


    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public void saveToFile(String filename) {
        Path path = Paths.get(filename);
        String fileLine = firstName + ", " + lastName + ", " + yearOfBirth;

        try {
            Files.writeString(path, fileLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
