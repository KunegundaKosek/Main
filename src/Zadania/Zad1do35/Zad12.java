package Zadania.Zad1do35;

public class Zad12 {

    public static void main(String[] args) {

        /*Napisz program, który za pomocą instrukcji do ... while dla danych wartości x zmieniających się od 0 do 10 oblicza wartość funkcji y = 3x
         */

        int x = 0;
        int y = 0;

        do {
            y = 3 * x;
            System.out.println("x = " + x + '\t' + "y = " + y);
            x++;
        } while (x <= 10);

    }
}
