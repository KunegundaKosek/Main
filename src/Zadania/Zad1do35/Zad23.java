package Zadania.Zad1do35;

public class Zad23 {

    public static void main(String[] args) {

        /*Napisz program, który w 10-elementowej tablicy jednowymiarowej o nazwie
dane umieszcza liczby od 0 do 9 (zobacz reprezentację graficzną tablicy
na sąsiedniej stronie).
         */

        int n = 10, i;
        int[] dane = new int[n];

        for (i = 0; i < dane.length; i++) {
            dane[i] = i;
            System.out.println("dane[" + i + "] = " + dane[i]);

        }

        /*Napisz program, który w 10-elementowej tablicy jednowymiarowej o nazwie
dane2 umieszcza liczby od 9 do 0 (zobacz poniżej reprezentację graficzną tej
tablicy).
         */
        System.out.println();

        int m = 10, j;
        int [] dane2 = new int[m];

        for (j = 0; j < dane2.length; j++) {
            dane2[j] = m - 1 - j;
            System.out.println("dane2[" + j + "] = " + dane2[j]);

        }
    }
}
