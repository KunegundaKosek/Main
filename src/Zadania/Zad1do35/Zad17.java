package Zadania.Zad1do35;

import java.util.Random;

public class Zad17 {

    public static void main(String[] args) {

        /*Napisz program, który za pomocą instrukcji for znajduje największą i najmniejszą liczbę ze zbioru n wylosowanych liczb całkowitych od 0 do 99
(w zadaniu n = 5) oraz oblicza średnią ze wszystkich wylosowanych liczb.
         */

        int ilośćLiczb = 5, i;
        double liczba = 0;
        double suma = 0;
        double min;
        double max;

        System.out.println("Program losuje " + ilośćLiczb + " liczb całkowitych od 0 do 99, a następnie znajduje najmniejszą i największą oraz oblicza średnią ze wszytskich wylosowanych liczb.");

        Random random = new Random();
        min = Math.round(100*(random.nextDouble()));
        System.out.println();
        System.out.println("Wylosowano liczby: \n" + min + ", ");
        max = min;
        suma += max;

        for (i = 1; i <= ilośćLiczb - 1; i++) {
            liczba = Math.round(100 * (random.nextDouble()));
            System.out.println(liczba + ", ");
            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;
            suma += liczba;
        }

        System.out.println();
        System.out.println("największa liczba to: " + max + ", ");
        System.out.println("najmniejsza liczba to: " + min + ", ");
        System.out.println("średnia = " + suma / ilośćLiczb + ".");




    }
}
