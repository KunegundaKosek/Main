package Zadania.Zad1do35;

public class Zad32 {

    public static void main(String[] args) {

     /*   Dane są dwie macierze o nazwach a i b — ich postać jest taka sama jak
        w zadaniu 31. Napisz program, który oblicza różnicę tych macierzy i wyświetla
        na ekranie komputera wynik odejmowania c = a-b.*/

        int n = 10, i, j;

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        //wpisywanie liczb do macierzy a
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                a[i][j] = 1;
            }
        }
        //wpisywanie liczb do macierzy b

        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                b[i][j] = 2;
            }
        }

        //wyświetlanie zawartości macierzy a

        System.out.println("Macierz a.\n");

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

        //wyświetlanie zawartości macierzy b
        System.out.println();

        System.out.println("Macierz b.\n");

        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        //odejmowanie macierzy c = b - a

        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c.length; j++) {
                c[i][j] = b[i][j] - a[i][j];
            }
        }

        //wyświetlanie zawartości macierzy c

        System.out.println("\nMacierz c = b - a\n");

        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
