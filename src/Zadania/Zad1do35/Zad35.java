package Zadania.Zad1do35;

import java.util.Scanner;

public class Zad35 {

    public static void main(String[] args) {

       /* Napisz program, który składa dwa łańcuchy, a wynik tej operacji wyświetla
        na ekranie monitora*/

        String łańcuch1, łańcuch2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program składa dwa łańcuchy");

        System.out.println("Podaj pierwszy łańcuch.");
        łańcuch1 = scanner.nextLine();

        System.out.println("Podaj drugi łańcuch.");
        łańcuch2 = scanner.nextLine();

        System.out.println(łańcuch1 + " + " + łańcuch2 + " = " + łańcuch1.concat(łańcuch2));
        System.out.println(łańcuch2 + " + " + łańcuch1 + " = " + łańcuch2.concat(łańcuch1));

        if (łańcuch1.equals(łańcuch2)) {
            System.out.println("Składanie dwóch różnych łańcuchów jest przemienne");
        } else {
            System.out.println("Składanie dwóch różnych znaków nie jest przemienne");
        }
    }
}
