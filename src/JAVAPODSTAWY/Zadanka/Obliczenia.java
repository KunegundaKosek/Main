package JAVAPODSTAWY.Zadanka;

import java.util.Random;
import java.util.Scanner;

public class Obliczenia {
    public static void main(String[] args) {

        String c = "x";
        System.out.println("Podaj znak");

        Scanner scanner = new Scanner(System.in);
        int próby = 0;
        String podajZnak = scanner.nextLine();

        do {
            if (c != podajZnak) {
                System.out.println("Niestety podałeś zły znak! Próbuj dalej");
            }
            próby += próby;

        } while (c == podajZnak);

        System.out.println("Brawo odgadłeś prawidłowy znak za " + próby + " razem.");
        }
    }


