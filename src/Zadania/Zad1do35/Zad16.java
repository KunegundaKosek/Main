package Zadania.Zad1do35;

public class Zad16 {

    public static void main(String[] args) {

        /*Napisz program, który za pomocą instrukcji for sumuje liczby parzyste
od 1 do 100.
         */
        System.out.println("Program sumuje liczby parzyste z zakresu od 1 do 100 za pomocą pętli for:");

        int i = 1;
        int suma = 0;

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("Suma liczb parzystych od 1 do 100 wynosi " + suma + ".");
        System.out.println();


        /*Napisz program, który za pomocą instrukcji do ... while sumuje liczby
parzyste od 1 do 100
         */
        System.out.println("Program sumuje liczby parzyste z zakresu od 1 do 100 za pomocą pętli do ... while: ");

        int a = 1;
        int sum1 = 0;
        do {
            if (a % 2 == 0)
                sum1 += a;
            a++;

        } while (a <= 100);
        System.out.println("Suma liczb parzystych od 1 do 100 wynosi " + sum1 + ".");
        System.out.println();

        /*Napisz program, który za pomocą instrukcji while sumuje liczby parzyste
od 1 do 100.
         */
        System.out.println("Program sumuje liczby parzyste z zakresu od 1 do 100 za pomocą pętli while: ");

        int b = 1;
        int sum = 0;

        while (b <= 100) {
            if (b % 2 == 0)
                sum += b;
            b++;

        }
        System.out.println("Suma liczb parzystych od 1 do 100 wynosi " + sum + ".");
        System.out.println();

        /*Napisz program, który za pomocą instrukcji for sumuje liczby nieparzyste
od 1 do 100.
         */
        System.out.println("Program sumuje liczby nieparzyste z zakresu od 1 do 100 za pomocą pętli for: ");

        int c = 1;
        int sumaa = 0;

        for (c = 1; c <= 100; c++) {
            if (!(c % 2 == 0))
                sumaa += c;

        }
        System.out.println("Suma liczb nieparzystych od 1 do 100 wynosi " + sumaa + ".");
        System.out.println();

        /*Napisz program, który za pomocą instrukcji do ... while sumuje liczby
nieparzyste w przedziale od 1 do 100.
         */

        System.out.println("Program sumuje liczby parzyste z zakresu od 1 do 100 za pomocą pętli do ... while: ");

        int d = 1;
        int suma2 = 0;

        do {
            if (!(d % 2 == 0))
                suma2 += d;
            d++;
        } while (d <= 100);

        System.out.println("Suma liczb nieparzystych od 1 do 100 wynosi " + suma2 + ".");
        System.out.println();

/*        Napisz program, który za pomocą instrukcji while sumuje liczby nieparzyste
        od 1 do 100.*/

        System.out.println("Program sumuje liczby parzyste z zakresu od 1 do 100 za pomocą pętli while: ");

        int e = 1;
        int suma3 = 0;

        while (e <= 100) {
            if (!(e % 2 == 0))
                suma3 += e;
            e++;
        }
        System.out.println("Suma liczb nieparzystych od 1 do 100 wynosi " + suma3 + ".");


    }


}

