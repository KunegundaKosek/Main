package Zadania.Zad43;

import java.io.IOException;

public class Main {

    /*Napisz zgodnie z zasadami programowania obiektowego program, który
wczytuje z klawiatury imię i nazwisko, zapisuje te dane do pliku tekstowego dane.txt, a następnie odczytuje je z tego pliku i wyświetla na ekranie
komputera. Klasa powinna zawierać trzy metody:
 czytaj_dane() — metoda wczytuje z klawiatury imię i nazwisko.
 zapisz_dane_do_pliku() — metoda zapisuje imię i nazwisko
do pliku tekstowego o nazwie dane.txt.
 czytaj_dane_z_pliku() — metoda odczytuje dane z pliku dane.txt
i wyświetla je na ekranie komputera.
     */

    public static void main(String[] args) throws IOException {

        Plik plik1 = new Plik();
        //deklaracja zmiennej, utworzenie obiektu i przypisanie go do zmiennej

        plik1.czytajDane();
        plik1.zapiszDaneDoPliku();
        plik1.czytajDaneZPliku();

    }
}
