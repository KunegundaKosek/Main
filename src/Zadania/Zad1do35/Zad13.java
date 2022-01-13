package Zadania.Zad1do35;

public class Zad13 {

    public static void main(String[] args) {

        /*Napisz program, który za pomocą instrukcji while dla danych wartości
x zmieniających się od 0 do 10 oblicza wartość funkcji y = 3x.
         */
        int x = 0;
        int y = 0;

        while (x <= 10) {
            y = x * 3;
            System.out.println("x = " + x + '\t' + "y = " + y);
            x++;
        }
    }
}
