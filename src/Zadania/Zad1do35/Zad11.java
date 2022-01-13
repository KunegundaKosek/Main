package Zadania.Zad1do35;

public class Zad11 {

    public static void main(String[] args) {

        /*Napisz program, który za pomocą instrukcji for dla danych wartości
x zmieniających się od 0 do 10 oblicza wartość funkcji y = 3x.
         */
        int x, y;
        for (x = 0; x <= 10; x++ ) {
            y = 3 * x;
            System.out.println("x = " + x + '\t' + "y = " + y);
        }
    }
}
