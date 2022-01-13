package Zadania.Zad1do35;

import java.util.Scanner;

public class Zad34 {

    public static void main(String[] args) {

        /*Napisz program, który umożliwia odczytywanie długości łańcucha zapamiętanego w odpowiedniej zmiennej. Skorzystaj z metody length(), a wynik
wyświetl na ekranie monitora.
         */

        String imie, nazwisko;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        imie = scanner.nextLine();

        System.out.println("Podaj nazwisko: ");
        nazwisko = scanner.nextLine();

        System.out.println("Imię " + imie + " zawiera " + imie.length() + " liter/y");

        System.out.println("Nazwisko " + nazwisko + " zawiera " + nazwisko.length() + " liter/y.");
    }
}
