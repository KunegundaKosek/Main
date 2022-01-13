package Zadania.Zad1do35;

import java.util.Random;
import java.util.regex.Pattern;

public class Zad19 {

    public static void main(String[] args) {

        /*Napisz program, który za pomocą instrukcji while znajduje największą
i najmniejszą liczbę ze zbioru n wylosowanych liczb całkowitych od 0 do 99
(w zadaniu n = 5) oraz oblicza średnią ze wszystkich wylosowanych liczb
         */

        int ilośćLiczb = 5, i = 1;
        double min, max, liczba, suma = 0;

        System.out.println("Program losuje " + ilośćLiczb + " liczb całkowitych od 0 do 99, a następnie znajduje najmniejszą i największą oraz oblicza średnią ze wszytskich wylosowanych liczb.");

        Random r = new Random();
        min = Math.round(100 * (r.nextDouble()));
        System.out.println();
        System.out.println("Wylosowane liczby: " + min + ", ");
        max = min;
        suma += max;

        while (i <= ilośćLiczb) {
            liczba = Math.round(100 * (r.nextDouble()));

            System.out.println(liczba + ", ");

            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;

            suma += liczba;
            i++;
        }
        System.out.println();
        System.out.println("największa liczba to: " + max + ", ");
        System.out.println("najmniejsza liczba to: " + min + ", ");
        System.out.println("średnia = " + suma / ilośćLiczb + ".");


    }
}
