package Zadania.Zad1do35;

import java.util.Scanner;

public class Zad22 {

    public static void main(String[] args)
        throws java.io.IOException {

        /*Napisz program, który wczytuje znaki z klawiatury, dopóki użytkownik nie wprowadzi kropki. Program powinien
        zliczać wprowadzone znaki spacji i wyświetlać na koniec ich liczbę.
         */

        System.out.println("Wprowadź znak z klawiatury, a następnie wciśnij spację. Aby zakończyć wciśnij kropkę.");

        int space = 0;
        char znak;

        do {
            znak = (char) System.in.read();
            if (znak == ' ')
                space++;
        } while (znak != '.');

        System.out.println("Liczba odstępów: " + space);


    }
}
