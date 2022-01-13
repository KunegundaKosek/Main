package Zadania.Zad45;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Matrix {

    int n = 10;
    int a[][] = new int[n][n]; // deklaracja tablicy a
    int b[][] = new int[n][n]; // deklaracja tablicy b
    int c[][] = new int[n][n]; // deklaracja tablicy c

    public void czytaj_dane() {
        int i, j;
        System.out.println("Tworzymy tablicę a.");
        for (i = 0; i < n; i++) // tworzymy tablicę 10x10
        {
            for (j = 0; j < n; j++) {
                if (i == 1)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;
                System.out.print(a[i][j] + " ");
            } // j
            System.out.println();
        } // i
    }

    public void przetwórz_dane() {
        int i, j;
        System.out.println();
        System.out.println("Przepisujemy zawartość tablicy a do tablicy b");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b[i][j] = a[j][i]; // przepisujemy zawartość tablicy a do tablicy b
            }
        }
    }

    public void zapisz_dane_do_pliku()
            throws IOException {
        int i, j;
        System.out.println("i zapisujemy tablicę b do pliku.");
        FileWriter fw = new FileWriter("dane.txt"); // tworzymy i otwieramy
        // plik do zapisu
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                fw.write((char) (b[i][j])); // rzutujemy i zapisujemy tablicę b
                // do pliku
                System.out.print(b[i][j] + " ");
            } // j
            System.out.println();
        } // i
        fw.close(); // zamknięcie pliku
    }

    public void czytaj_dane_z_pliku()
            throws IOException {
        int i, j;
        System.out.println();
        System.out.println("Odczytujemy dane z pliku i umieszczamy w tablicy c.");
        FileReader fr = new FileReader("dane.txt");
        BufferedReader br = new BufferedReader(fr);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = (int) br.read(); // odczytujemy dane z pliku
                // i rzutujemy
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }
        fr.close();
    }
}

