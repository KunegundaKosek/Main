package Zadania.Zad44;

import java.awt.color.ICC_ColorSpace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class matrix {

    int rozmiar = 10;

    public void czytajDane(int tablica[][], int rozmiar) {
        int i, j;

        System.out.println("Tworzymy tablicę 10X10");

        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                if (i == j) {
                    tablica[i][j] = 1;
                } else {
                    tablica[i][j] = 0;
                    System.out.print(tablica[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void zapiszDaneDoPliku(int tablica[][], int rozmiar) throws IOException {
        int i, j;

        System.out.println();
        System.out.println("Zapisujemy tablicę 10X10 do pliku.");

        FileWriter fw = new FileWriter("tablica.txt");

        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                fw.write((char) (tablica[i][j])); //rzutujemy i zapisujemy tablicę do pliku

                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        fw.close(); //zamykamy plik
    }

    public void czytajDaneZPliku(int tablica1[][], int rozmiar) throws IOException {
        int i, j;

        System.out.println();
        System.out.println("Odczytujemy tablicę 10X10 z pliku.");

        FileReader fr = new FileReader("tablica.txt");
        BufferedReader br = new BufferedReader(fr);

        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                tablica1[i][j] = (int) br.read();

                System.out.print(tablica1[i][j] + " ");
            }
            System.out.println();
        }
        fr.close(); //zamykamy plik
    }
}
