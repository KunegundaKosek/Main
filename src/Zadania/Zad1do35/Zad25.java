package Zadania.Zad1do35;

public class Zad25 {

    public static void main(String[] args) {

        /*Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
o nazwie macierz umieszcza na przekątnej liczby od 0 do 9, a poza przekątną
liczbę 0. Dodatkowo program powinien obliczać sumę elementów wyróżnionych w tablicy (znajdujących się na przekątnej).
         */

        int n = 10, i, j, suma;
        int[][] macierz = new int[n][n];

        //wpisywanie do tablicy liczb od 0 do 9 na przekątnej, a 0 poza przekątną.

        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (i == j) {
                    macierz[i][j] = i;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }

        //wyświetlanie zawartości tablicy

        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        suma = 0;

        for (i = 0; i < macierz.length; i++) {
            suma += macierz[i][i];
        }

        System.out.println("suma wyróżnionych elementów tablicy wynosi " + suma + ". ");
    }
}
