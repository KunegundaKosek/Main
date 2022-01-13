package Zadania.Zad39;

public class Silnia {

    public long silnia1(int liczba) {
        long zwrot = 1;
        if (liczba >= 2) {
            zwrot = liczba * silnia1(liczba - 1);
        }
        return zwrot;
    }
}
