package Zadania.Zad44;

import Zadania.Zad38.Matrix;

import java.io.IOException;

public class Main {

    /*Napisz zgodnie z zasadami programowania obiektowego program, który
tablicę 10×10 o postaci *** zapisuje do pliku tekstowego dane.txt, a następnie odczytuje z niego zapisane dane i wyświetla je na ekranie komputera. Klasa powinna zawierać
trzy metody z parametrami: czytaj_dane(int tablica[][], int rozmiar) — tworzy tablicę
10×10.
 zapisz_dane_do_pliku(int tablica[][], int rozmiar) — metoda
zapisuje tablicę 10×10 do pliku tekstowego o nazwie dane.txt.
 czytaj_dane_z_pliku(int tablica1[][], int rozmiar) — odczytuje
tablicę 10×10 z pliku dane.txt i wyświetla ją na ekranie komputera.
     */

    public static void main(String[] args) throws IOException {

        int rozmiar = 10;
        int tab[][] = new int[rozmiar][rozmiar];
        int tab1[][] = new int[rozmiar][rozmiar];
        matrix matrix1 = new matrix();

        matrix1.czytajDane(tab, rozmiar);
        matrix1.zapiszDaneDoPliku(tab, rozmiar);
        matrix1.czytajDaneZPliku(tab1, rozmiar);


    }

}
