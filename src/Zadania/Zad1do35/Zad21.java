package Zadania.Zad1do35;

public class Zad21 {

    public static void main(String[] args) {

        /*Napisz program, który wyświetla duże litery alfabetu od A do Z i od Z do A
z wykorzystaniem pętli for.
         */

        char znak;

        System.out.println("\nProgram wyświetla duże litery alfabetu od A do Z i od Z do A\n");

        for (znak = 'A'; znak <= 'Z'; znak++) {
            if (znak < 'Z')
                System.out.print(znak + ", ");
            else
                System.out.println(znak + ".");
        }
        for (znak = 'Z'; znak >= 'A'; znak--) {
            if (znak > 'A')
                System.out.print(znak + ", ");
            else
                System.out.println(znak + ". ");
        }

        /*Napisz program, który wyświetla duże litery alfabetu od A do Z i od Z do A
z wykorzystaniem pętli do ... while.
         */

        char litera;

        System.out.println("\nProgram wyświetla duże litery alfabetu od A do Z i od Z do A\n");

        litera = 'A';

        do {
            if (litera < 'Z')
                System.out.print(litera + ", ");
            else
                System.out.println(litera + ".");
            litera++;

        } while (litera <= 'Z');

        litera = 'Z';

        do {
            if (litera > 'A')
                System.out.print(litera + ", ");
            else
                System.out.println(litera + ".");
            litera--;

        } while (litera >= 'A');

        /*Napisz program, który wyświetla duże litery alfabetu od A do Z i od Z do A
z wykorzystaniem pętli while.
         */

        System.out.println("\nProgram wyświetla duże litery alfabetu od A do Z i od Z do A\n");

        char znak2;

        znak2 = 'A';

        while (znak2 <= 'Z') {
            if (znak2 < 'Z')
                System.out.print(znak2 + ", ");
            else
                System.out.println(znak2 + ".");
            znak2++;
        }
        znak2 = 'Z';

        while (znak2 >= 'A') {
            if (znak2 > 'A')
                System.out.print(znak2 + ", ");
            else
                System.out.println(znak2 + ".");
            znak2--;
        }
    }
}
