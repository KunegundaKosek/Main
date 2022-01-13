package Zadania.Zad1do35;

import java.util.Random;
import java.util.Scanner;

public class Zad10 {

    public static void main(String[] args) {
        /*Napisz program, w którym użytkownik zgaduje losową liczbę z przedziału
od 0 do 9 generowaną przez komputer.

         */

        System.out.println("Zgadnij liczbę z przedziału od 0 do 9");

        Scanner scanner = new Scanner(System.in);
        int zgadujLiczbę = scanner.nextInt();
        int wylosowanaLiczba;

        Random random = new Random();

        wylosowanaLiczba = Math.round(10);

        if (zgadujLiczbę == wylosowanaLiczba) {
            System.out.println("Gratulacje! ");
        } else {
            System.out.println("Bardzo mi przykro ale wylosowana liczba to: " + wylosowanaLiczba);
        }

        }

    }

