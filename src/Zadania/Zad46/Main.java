package Zadania.Zad46;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*Napisz program, który zamieszcza w pliku o dostępie swobodnym tablicę
przeprowadzonych pomiarów, a następnie wyświetla z pliku co drugi pomiar
na ekranie monitora.
         */

        File1 plik = new File1();

        System.out.println("Program wyświetla co drugi pomiar zapisany wcześniej w pliku pomiary.dat");

        plik.zapisDoPliku();
        plik.odczytZPliku();
    }
}
