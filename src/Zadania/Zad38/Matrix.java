package Zadania.Zad38;

import java.util.Random;

public class Matrix {

    public void czytajDane(double[][] macierz, int rozmiar) {

        int i, j;
        Random rand = new Random();

        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                if (i == j) {
                    macierz[i][j] = Math.round(9 * (rand.nextDouble())); //wpisywanie liczb pseudolosowych od 0 do 9 na przekątnej tablicy
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
    }
    public void przetwórzDane(double[][] macierz, int rozmiar) {

        int i;
        double suma = 0;

        for (i = 0; i < rozmiar; i++) {
            suma += macierz[i][i];
        }
        System.out.println("Suma elementów na przekątnej wynosi = " + (int)suma + ".");
    }
    public void wyświetlWynik(double[][] macierz, int rozmiar) {

        int i, j;

        for (i = 0; i < rozmiar; i++){
            for (j = 0; j < rozmiar; j++) {
                System.out.print((int)macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
