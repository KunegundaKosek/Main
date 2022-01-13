package Zadania.Zad1do35;

public class Zad24 {

    public static void main(String[] args) {

        /*Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
o nazwie macierz umieszcza na przekątnej liczbę 1, a poza przekątną — 0
(zobacz reprezentację graficzną tablicy na sąsiedniej stronie). Dodatkowo program powinien obliczać sumę elementów wyróżnionych w tablicy,
tj. tych znajdujących się na jej przekątnej.
         */

        int n = 10, i, j, suma;

        int[][] macierz = new int[n][n];

        for (i = 0; i < macierz.length; i++) {
           for (j = 0; j < macierz.length; j++) {
               if (i == j)
                   macierz[i][j] = 1;
               else
                   macierz[i][j] = 0;
           }
        }
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
        System.out.println("Suma wyróżnionych elementów w tablicy wynosi " + suma + ".");
    }
}
