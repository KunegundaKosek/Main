package Zadania.Zad37;

import java.io.IOException;
import java.util.Scanner;

public class Trójmian {

    double a, b, c, delta, x1, x2;
    char liczbaPierwiastków;

    public void czytajDane() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program oblicza pierwiastki równania kwadratowego dla dowolnych wartości a, b oraz c.");

        System.out.println("Podaj a.");
        a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Niedozwolona wartość współczynnika a.");
            System.exit(1); //wyjście z programu
        } else {
            System.out.println("Podaj b.");
            b = scanner.nextDouble();

            System.out.println("Podaj c.");
            c = scanner.nextDouble();
        }
    }
    public void przetwórzDane() {
        delta = b * b - 4 * a * c;

        if (delta < 0) {
            liczbaPierwiastków = 0;
        }
        if (delta == 0) {
            liczbaPierwiastków = 1;
        }
        if (delta > 0) {
            liczbaPierwiastków = 2;
        }

        switch (liczbaPierwiastków) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
            }
            break;
        }
    }

    public void wyświetlWynik() {
        System.out.println("Dla wprowadzonych liczb: ");
        System.out.printf("a = " + "%2.2f,", a);
        System.out.printf(" b = " + "%2.2f,", b);
        System.out.printf(" c = " + "%2.2f,", c);

        switch (liczbaPierwiastków) {
            case 0:
                System.out.print(" brak pierwiastków rzeczywistych.\n");
                break;
            case 1:
                System.out.printf(" trójmian ma jeden pierwiastek podwójny: " + "x1 = " + "%2.2f, x1");
                break;
            case 2: {
                System.out.println(" trójmian ma dwa pierwiastki: ");
                System.out.printf("x1 = " + "%2.2f", x1);
                System.out.printf(", x2 = " + "%2.2f.\n", x2);
                break;
            }
        }

    }

}
