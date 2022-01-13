package Zadania.Zad49;

public class MójWątek implements Runnable{

    int licznik;
    Thread wtk;

    //tworzenie nowego wątku
    MójWątek(String name) {
        wtk = new Thread(this, name);
        licznik = 0;
        wtk.start(); //rozpoczęcie wątku
    }

    //początek wywoływania nowego wątku
    public void run() {
        System.out.println(wtk.getName() + " startuje.");

        try {
            do {
                Thread.sleep(500);
                System.out.println(wtk.getName() + ", licznik = " + licznik);
                licznik++;
            } while (licznik < 10);
        } catch (InterruptedException exc) {
            System.out.println(wtk.getName() + " przerwany");
        }
        System.out.println(wtk.getName() + " zakończony.");
    }
}
