package Zadania.Zad1do35;

import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {
/*
        Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz dla dwóch liczb
        x i y wprowadzanych z klawiatury. W programie należy założyć, że zmienne
        x i y są typu float (rzeczywistego). Dla zmiennych x, y, suma, różnica,
        iloczyn i iloraz należy przyjąć format ich wyświetlania na ekranie z dokładnością do dwóch miejsc po przecinku.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj x: ");
        float x = scanner.nextFloat();

        System.out.println("Podaj y:");
        float y = scanner.nextFloat();

        float dodaj = x + y;
        float odejmij = x - y;
        float mnożenie = x * y;
        float dzielenie = x / y;

        System.out.printf("Dla liczb: x = " + "%2.2f", x);
        System.out.printf(" i y = " + "%2.2f", y);
        System.out.println(" ");
        System.out.printf("Suma wynosi = " + "2.2f, \n", + dodaj);
        System.out.printf("Różnica wynosi = " + "2.2f, \n", + odejmij);
        System.out.printf("Iloczyn wynosi = " + "2.2f, \n", + mnożenie);
        System.out.printf("Iloraz wynosi = " + "2.2f, \n", + dzielenie);
    }
}
