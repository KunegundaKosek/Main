package JAVAPODSTAWY;

import java.util.Random;
import java.util.Scanner;

public class Gra {

    public static void main(String[] args) {

        int i = 0;
        int los;
        int odp;


        Random random = new Random();
        los = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do 10!");

        do{
            i++;
            System.out.println("Podaj liczę: ");
            odp = scanner.nextInt();

            if (odp > los) {
                System.out.println("Nie udało ci się zgadnąć, liczba jest mniejsza!");
            } else if (odp < los) {
                System.out.println("Nie udało ci się zgadnąć, liczba jest większa!");
            }
        } while (odp != los);

        System.out.println("Gratulacje, zgadłeś liczbę za " + i + " razem!");
    }
}
