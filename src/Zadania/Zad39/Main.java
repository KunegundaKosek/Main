package Zadania.Zad39;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    /*Napisz program, który rekurencyjnie oblicza kolejne wartości n! dla n = 10
i wynik wyświetla na ekranie komputera.
     */

    public static void main(String[] args) throws IOException {

        int i, n;

        Scanner scanner = new Scanner(System.in);
        Silnia s = new Silnia();

        System.out.println("Obliczanie silni dla dowolnej liczby całkowitej.");
        System.out.println("Podaj n.");

        n = Integer.parseInt(scanner.nextLine());

        for (i = 1; i <= n; i++) {
            System.out.println(i + "! = " + s.silnia1(i));
        }
    }
}
