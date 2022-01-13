package Zadania.Zad40;

public class Main {

    /*Napisz program, który rekurencyjnie znajduje 10 pierwszych liczb trójkątnych i wyświetla je na ekranie komputera.
     */

    public static void main(String[] args) {

        int i, n = 10;

        Trójkątne liczby = new Trójkątne();

        System.out.println("Program znajduje 10 pierwszych liczb trójkątnych");

        for (i = 1; i <= n; i++) {
            System.out.println(i + "# = " + liczby.triangle(i));
        }
    }
}
