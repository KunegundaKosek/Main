package Zadania.Zad42;

import java.io.IOException;
import java.util.Scanner;

public class Kadra extends Osoba {

    String wykształcenie;
    String stanowisko;

    public void incjuj1() throws IOException {
        Scanner scanner = new Scanner(System.in);

        inicjuj(); //wywołujemy metodę inicjuj

        System.out.println("Podaj wykształcenie");
        wykształcenie = scanner.nextLine();

        System.out.println("Podaj stanowisko");
        stanowisko = scanner.nextLine();

    }

    public void drukuj1() {

        drukuj();
        System.out.println("Wykształcenie: " + wykształcenie + ".");
        System.out.println("Stanowisko: " + stanowisko + ".");
    }
}
