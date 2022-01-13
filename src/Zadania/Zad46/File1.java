package Zadania.Zad46;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class File1 {

    double[] tablica = {10.1, 3.5, 89.7, 60.28, 100.12, 0.01}; //pomiary
    double d; // zmienna pomocnicza

    public void zapisDoPliku() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("pomiary.dat", "rw");
        //"rw" - otwarcie pliku o dostępie swobodnym w trybie zapisu i odczytu

        for (int i = 0; i < tablica.length; i++) {
            raf.writeDouble(tablica[i]); //zapis elementów tablicy do pliku
        }

        raf.close();
    }

    public void odczytZPliku() throws IOException {

        RandomAccessFile raf = new RandomAccessFile("pomiary.dat", "r");
        //"r" - otwarcie pliku o dostępie swobodnym tylko w trybie odczytu

        for (int i = 0; i < tablica.length; i +=2) {
            raf.seek(8 * i); //typ double ma 8 bajtów
            d = raf.readDouble();
            System.out.println(d);
        }
        raf.close();
    }
}
