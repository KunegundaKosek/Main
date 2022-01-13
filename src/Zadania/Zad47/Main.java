package Zadania.Zad47;

public class Main {

    public static void main(String[] args) {

        /*Napisz program, który tworzy jeden wątek i go uruchamia. Tworzenie wątku
odbywa się poprzez poszerzenie klasy Thread.
         */

        Thread NowyWątek = new MójWątek();
        NowyWątek.start();
    }
}
