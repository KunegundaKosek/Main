package Zadania.Zad1do35;

public class Zad31 {

    public static void main(String[] args) {

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

        //dodawnaie macierzy c = a + b

        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c.length; j++) {
               c[i][j] = a[i][j] + b[i][j];
            }
        }

        //wyświetlanie zawartości macierzy c

        System.out.println();
        System.out.println("Macierz c = a + b.\n");

        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
