package Zadania.Zad1do35;

public class Zad29 {

    public static void main(String[] args) {

        /*Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
umieszcza w pierwszej kolumnie liczby od 0 do 9, w drugiej kwadraty tych
liczb, natomiast w pozostałych kolumnach 0 (interpretacja graficzna tablicy
poniżej). Dodatkowo program powinien obliczać osobno sumę liczb znajdujących się w pierwszej oraz w drugiej kolumnie.
         */

     /*   int n = 10, i, j, suma;
        int[][] tablica = new int[n][n];

        for (i = 0; i < tablica.length; i++) {
            for (j = 0; j < tablica.length; j++) {
                if (j == 0) tablica[i][j] = i;
                if (j == 1) tablica[i][j] = i * i;
                if (j > 1) tablica[i][j] = 0;
            }
        }

        for (i = 0; i < tablica.length; i++) {
            for (j = 0; i < tablica.length; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }*/

      /*  suma = 0;

        for (i = 0; i < tablica.length; i++) {
            suma += tablica[i][j];
        }
        System.out.println("Suma liczb znajdujących się w drugiej kolumnie to " + suma + ".");*/

        int n = 10, i, j, suma;
        int tablica[][] = new int[n][n];
        // wpisywanie liczb do tablicy
        for (i = 0; i < tablica.length; i++)
        {
            for (j = 0; j < tablica.length; j++)
            {
                if (j == 0) tablica[i][j] = i;
                if (j == 1) tablica[i][j] = i*i;
                if (j > 1) tablica[i][j] = 0;
            }
        }
        // wyświetlenie zawartości tablicy
        for (i = 0; i < tablica.length; i++)
        {
            for (j = 0; j < tablica.length; j++)
            {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        // obliczanie sumy
        suma = 0;
        for (i = 0; i < tablica.length; i++)
        {
            suma += tablica[i][0];
        }
        System.out.println("Suma liczb znajdujących się w pierwszej kolumnie to " + suma + ".");
    }
}
