package Zadania.Pętle;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę gwiazdek w podstawie: ");
        Scanner scanner = new Scanner(System.in);
        int liczbaGwiazdekWPodstawie = scanner.nextInt();

        int liczbaGwiazdekNaSzczycie = liczbaGwiazdekWPodstawie % 2 == 0 ? 2 : 1;

        for (int gwiazdkiWRzedzie = liczbaGwiazdekNaSzczycie; gwiazdkiWRzedzie <= liczbaGwiazdekWPodstawie; gwiazdkiWRzedzie += 2) {
            int liczbaSpacji = (liczbaGwiazdekWPodstawie - gwiazdkiWRzedzie) / 2;

            for (int i = 0; i < liczbaSpacji + gwiazdkiWRzedzie; i++) {

            }
        }
    }
}