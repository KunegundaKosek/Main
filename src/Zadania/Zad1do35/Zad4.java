package Zadania.Zad1do35;

import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        /*Napisz program, który oblicza objętość kuli o promieniu r. Wartość promienia wprowadzamy z klawiatury. W programie należy przyjąć, że zmienne:
        promień r i objętość są typu double (rzeczywistego). Dla tych zmiennych
        należy przyjąć format wyświetlania na ekranie z dokładnością do dwóch
        miejsc po przecinku.*/

        System.out.println("Program oblicza objętość kuli.");

        System.out.println("Podaj promień r: ");

        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double v;
        v = 4 * Math.PI*r*r*r/3;

        System.out.print("Objętość kuli o promieniu r = ");
        System.out.printf("%2.2f", r);
        System.out.println(" wynosi");
        System.out.printf("%2.2f.", v);





    }
}
