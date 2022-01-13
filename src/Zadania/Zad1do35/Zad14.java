package Zadania.Zad1do35;

public class Zad14 {

    public static void main(String[] args) {

        /*Napisz program, który za pomocą instrukcji for wyświetla liczby całkowite
od 1 do 20.
         */

        int i;

        for (i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        /*Napisz program, który za pomocą instrukcji do ... while wyświetla liczby
całkowite od 1 do 20.
         */

        int a = 1;

        do {
            if (a > 20) {
                System.out.println(a + ", ");
            } else {
                System.out.println(a + ".");
                a++;
            }
        } while (a <= 20);

        /*Napisz program, który za pomocą instrukcji while wyświetla liczby całkowite od 1 do 20
         */
        int b = 1;
        while (b <= 20) {
            if (b > 20) {
                System.out.println(b + ", ");
            } else {
                System.out.println(b + ".");
                b++;
            }
        }

    }
}
