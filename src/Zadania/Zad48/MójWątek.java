package Zadania.Zad48;

class MójWątek implements Runnable {

    int licznik;
    String nazwaWątku;

    MójWątek(String nazwa) {
        licznik = 0;
        nazwaWątku = nazwa;
    }

    //punkt wejścia wątku
    @Override
    public void run() {
        System.out.println(nazwaWątku + " startuje.");

        try {
            do {
                Thread.sleep(500);
                System.out.println(nazwaWątku + ", licznik = " + licznik);
                licznik++;
            } while (licznik < 10);
        } catch (InterruptedException exc) {
            System.out.println(nazwaWątku + " przerwany.");
        }
        System.out.println(nazwaWątku + " zakończony");
    }
}
