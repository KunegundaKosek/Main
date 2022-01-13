package Zadania.Zad42;

import java.io.IOException;
import java.util.Scanner;

public class Osoba {

    String nazwisko;
    String imię;
    String ulica;
    String kod;
    String miasto;

    public void inicjuj() throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź dane");

        System.out.println("Podaj nazwisko: ");
        nazwisko = scanner.nextLine();

        System.out.println("Podaj imię: ");
        imię = scanner.nextLine();

        System.out.println("Podaj ulicę: ");
        ulica = scanner.nextLine();

        System.out.println("Podaj kod pocztowy: ");
        kod = scanner.nextLine();

        System.out.println("Podaj miasto: ");
        miasto = scanner.nextLine();
    }

    public void drukuj() {

        System.out.println("Wyświetlanie danych");
        System.out.println("===================");
        System.out.println("Pan/Pani " + nazwisko + " " + imię + ", ");
        System.out.print("mieszka na ulicy " + ulica + ", ");
        System.out.print("w miejscowości " + miasto + " z kodem pocztowym " + kod + ".");
    }
}
