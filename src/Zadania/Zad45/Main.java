package Zadania.Zad45;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Matrix matrix = new Matrix();

        matrix.czytaj_dane();
        matrix.przetwórz_dane();
        matrix.zapisz_dane_do_pliku();
        matrix.czytaj_dane_z_pliku();

    }
}
