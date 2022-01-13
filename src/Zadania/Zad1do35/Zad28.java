package Zadania.Zad1do35;

public class Zad28 {

    public static void main(String[] args) {

        /*Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10
o nazwie macierz umieszcza liczby od 0 do 9 zgodnie z załączoną poniżej
interpretacją graficzną. Program dodatkowo powinien obliczać sumę wyróżnionych elementów.
         */
        int n = 10;
        int i;
        int j;
        int suma;
        int[][] macierz = new int[n][n];

        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (n == i + j + 1) {
                    macierz[i][j] = i;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j]);
            }
            System.out.println();
        }
        suma = 0;

        for (i = 0; i < macierz.length; i++) {
            suma += macierz[i][n - i - 1];
        }

        System.out.println("Suma wyróżnionych elementów w tablicy wynosi" + suma + ".");
    }
}
