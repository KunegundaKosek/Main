package Zadania.Zad1do35;

public class Zad15 {

    public static void main(String[] args) {

        /*Napisz program, który przy użyciu instrukcji for sumuje liczby całkowite
od 1 do 100.
         */

        int i = 1;
        int suma = 0;

        for (i = 1; i <= 100; i++) {
            suma += i;
        }

        System.out.println("Suma liczb całkowitych od 1 do 100 wynosi: " + suma + ".");

        /*Napisz program, który korzystając z instrukcji do ... while, sumuje liczby
całkowite od 1 do 100.
         */

        int a = 1;
        int sum2 = 0;

        do {
            sum2 += a;
            a++;
        } while (a <= 100);

        System.out.println("Suma liczb całkowitych od 1 do 100 wynosi: " + sum2 + ".");

        /*Napisz program, który przy wykorzystaniu instrukcji while sumuje liczby
całkowite od 1 do 100.
         */

        int b = 1;
        int sum = 0;

        while (b <= 100) {
            sum += b;
            b++;
        }
        System.out.println("Suma liczb całkowitych od 1 do 100 wynosi: " + sum + ".");

    }
}
