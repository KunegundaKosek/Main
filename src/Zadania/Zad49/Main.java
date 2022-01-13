package Zadania.Zad49;

public class Main {

    /*Napisz program, który tworzy trzy wątki potomne.
     */

    public static void main(String[] args) {

        MójWątek mw1 = new MójWątek("Wątek 1");
        MójWątek mw2 = new MójWątek("Wątek 2");
        MójWątek mw3 = new MójWątek("Wątek 3");

        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Główny wątek został przerwany.");
            }
        } while (mw1.licznik < 10 || mw2.licznik < 10 || mw3.licznik < 10);
        System.out.println("Główny wątek został zakończony.");
    }
}
