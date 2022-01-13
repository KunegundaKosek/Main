package Zadania.Zad42;

import java.io.IOException;

public class Main {

    /*Napisz program, w którym zdefiniowano klasę osoba, zawierającą następujące pola: nazwisko, imię, ulica, kod, miasto oraz dwie metody: inicjuj()
i drukuj(). Pierwsza z nich umożliwia wprowadzenie danych, natomiast
druga wyświetla je na ekranie komputera.
     */

    /*Na bazie zadania wyżej napisz program, w którym zostanie zawarty proces
dziedziczenia — klasa nadrzędna kadra będzie dziedziczyć właściwości
po klasie bazowej osoba oraz będzie zawierać dwa dodatkowe pola:
wykształcenie i stanowisko oraz dwie dodatkowe metody: inicjuj1()
i drukuj1().
     */

    public static void main(String[] args) throws IOException {

        /*Osoba osoba = new Osoba();

        osoba.inicjuj();
        osoba.drukuj();*/ //do zadania pierwszego

        Kadra pracownik = new Kadra();
        pracownik.incjuj1();
        pracownik.drukuj1();

    }


}
