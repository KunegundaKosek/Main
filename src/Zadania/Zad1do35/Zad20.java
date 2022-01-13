package Zadania.Zad1do35;

public class Zad20 {

    public static void main(String[] args) {

        /*Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100
z wykorzystaniem podwójnej pętli for.
         */

        int n = 10, wiersze, kolumny;

        System.out.println("Program wyświetla tabliczkę mnożenia dla liczb od 1 do 10");

        for (wiersze = 1; wiersze <= n; wiersze++) {
            for (kolumny = 1; kolumny <= n; kolumny++) {
                System.out.print(wiersze * kolumny + "\t");
            }
            System.out.println();
        }

        /*Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100
z wykorzystaniem podwójnej pętli do ... while.
         */

        int i = 10, wiersze2 = 1, kolumny2;

        System.out.println("\nProgram wyświetla tabliczkę mnożenia dla liczb od 1 do 10\n");

        do {
            kolumny2 = 1;
            do {
                System.out.print(wiersze2 * kolumny2 + "\t");
                kolumny2++;
            } while (kolumny2 <= i);
            wiersze2++;
            System.out.println();
        } while (wiersze2 <= i);

        /*Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100
z wykorzystaniem podwójnej pętli while.
         */

        int j = 10, wiersze3, kolumny3 = 1;

        System.out.println("\nProgram wyświetla tabliczkę mnożenia dla liczb od 1 do 10\n");

        wiersze3 = 1;

        while (wiersze3 <= j) {
            kolumny3 = 1;

            while (kolumny3 <= j) {
                System.out.print(wiersze3 * kolumny3 + "\t");
                kolumny3++;
            }
            wiersze3++;
            System.out.println();


        }
    }
}
