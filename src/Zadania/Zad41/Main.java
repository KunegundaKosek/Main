package Zadania.Zad41;

public class Main {

    public static void main(String[] args) {

        /*Napisz program, który znajduje 10 pierwszych liczb Fibonacciego i wyświetla
je na ekranie komputera.
         */
        int i, n = 10;
        fib1 liczby = new fib1();

        System.out.println("Program znajduje rekurencyjnie " + n + "pierwszych liczb Fibonacciego.");
        System.out.println();

        for (i = 0; i < n; i++) {
            System.out.println(liczby.fib(i) + "");
        }
    }
}
