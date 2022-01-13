package Zadania.Zad38;

public class Main {

    /*Napisz zgodnie z zasadami programowania obiektowego program, który
w tablicy 10×10 umieszcza losowo na przekątnej liczby od 0 do 9, a poza
przekątną zera. Dodatkowo program oblicza sumę liczb znajdujących się
na przekątnej. Klasa powinna zawierać trzy metody z parametrami:
 czytaj_dane(double [][]macierz, int rozmiar) — metoda
umieszcza dane w tablicy.
 przetwórz_dane(double [][]macierz, int rozmiar) — metoda
oblicza i wyświetla sumę liczb znajdujących się na przekątnej.
 wyświetl_wynik(double [][]macierz, int rozmiar) — metoda
wyświetla zawartość tablicy na ekranie monitora.
     */

    public static void main(String[] args) {

        int rozmiar = 10;
        double[][] tablica = new double[rozmiar][rozmiar];

        Matrix matrix = new Matrix();

        matrix.czytajDane(tablica, rozmiar);
        matrix.przetwórzDane(tablica, rozmiar);
        matrix.wyświetlWynik(tablica, rozmiar);
    }
}
