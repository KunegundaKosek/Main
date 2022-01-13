package Udemy.Pętle;

public class SumaZmiennych {

    public static void main(String[] args) {

        int[] liczby = {1, 12, 41, 12, 51, 12};

        int suma = 0;

        for (int liczba: liczby) {
            suma += liczba;
        }
        System.out.println(suma);
    }
}
