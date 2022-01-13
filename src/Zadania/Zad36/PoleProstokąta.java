package Zadania.Zad36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoleProstokąta {

    double a, b, pole;

    public void czytajDane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pole prostokąta");

        System.out.println("Podaj a.");
        a = Double.parseDouble(br.readLine());

        System.out.println("Podaj b.");
        b = Double.parseDouble(br.readLine());

    }

    public void przetwórzDane() {
        pole = a * b;
    }

    public void wyświetlWynik() {
        System.out.print("Pole prostokąta o boku a = ");
        System.out.printf("%2.2f", a);
        System.out.print(" i boku b = ");
        System.out.printf("%2.2f", b);
        System.out.print(" wynosi ");
        System.out.printf("%2.2f.\n", pole);

    }
}
