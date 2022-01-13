package Zadania.Zad48;

public class Main {

    /*Napisz program, który tworzy nowy wątek poprzez implementację interfejsu Runnable
     */

    public static void main(String[] args) {

        System.out.println("Mój wątek startuje");

        //najpierw tworzymy obiekt typu MójWątek
        MójWątek mw = new MójWątek("Wątek 1");

        //następnie twoerzymy wątek z tego obiektu
        Thread NowyWątek = new Thread(mw);

        NowyWątek.start(); //początek wykonywania się wątku

        do {
            try {
                Thread.sleep(100); //zawieszenie wątku na 100 milisekund
            } catch (InterruptedException exc) {
                System.out.println("Główny wątek został przerwany.");
            }
        } while (mw.licznik != 10);
        System.out.println("Główny wątek został zakończony.");
    }
}
