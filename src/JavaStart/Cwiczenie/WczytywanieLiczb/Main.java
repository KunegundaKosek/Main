package JavaStart.Cwiczenie.WczytywanieLiczb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int next = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby i wciśnij enter");

        while ((next = scanner.nextInt()) <= 100) {
            sum += next;
        }

        int mod = sum % 2;
        if (mod == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }
}
