package Zadania.Zad1do35;

public class Zad30 {

    public static void main(String[] args) {

        int n = 10, i, j;
        int[][] a = new int [n][n];
        int[][] b = new int [n][n];

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                a[i][j] = j;
            }
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.println("Wyświetlenie zawartości tablicy a: ");

        for (i = 0; i < a.length; i ++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Wyświetlenie zawartości tablicy b: ");

        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
