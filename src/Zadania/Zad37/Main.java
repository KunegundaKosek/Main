package Zadania.Zad37;

import java.io.IOException;

public class Main {

    /*Napisz zgodnie z zasadami programowania obiektowego program, który
oblicza pierwiastki równania kwadratowego ax2
+bx+c = 0 z wykorzystaniem
instrukcji wyboru switch ... case. Klasa powinna zawierać trzy metody:
 czytaj_dane() — metoda jest odpowiedzialna za wczytanie danych
do programu oraz obsłużenie sytuacji, kiedy a = 0. Zmienne a, b i c
to liczby rzeczywiste wprowadzane z klawiatury.
 przetwórz_dane() — metoda odpowiada za wykonanie niezbędnych
obliczeń.
 wyświetl_wynik() — metoda jest odpowiedzialna za wyświetlenie
wyników na ekranie monitora. Dla zmiennych a, b, c, x1 oraz x2
należy przyjąć format wyświetlania ich z dwoma miejscami
po przecinku.
     */

    public static void main(String[] args) throws IOException {

        Trójmian trojmian = new Trójmian();

        trojmian.czytajDane();
        trojmian.przetwórzDane();
        trojmian.wyświetlWynik();


    }
}
