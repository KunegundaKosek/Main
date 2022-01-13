package Sda.Zaawansowane.Task10LambdaStrumienie.Omówienie;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;

public class LambdaMain {

    public static void main(String[] args) {

        System.out.println("\nPredykat tworzony za pomocą klasy:");
        Predicate<String> shorterThan4 = new ShorterThan4();
        System.out.println(shorterThan4.test("Ala"));
        System.out.println(shorterThan4.test("Darek"));

        /////////////////////////////////////////////////////////////////////
        System.out.println("\nPredykat tworzony za pomocą klasy anonimowej:");
        Predicate<String> shorterThan10 = new Predicate<String>() {
            @Override
            public boolean test(String text) {
                return text.length() < 10;
            }
        };
        System.out.println(shorterThan10.test("Abcdefghij"));
        System.out.println(shorterThan10.test("Abc"));

        //////////////////////////////////////////////////////////////////////
        System.out.println("\nPredykant tworzony za pomocą lambdy:");
        Predicate<String> shorterThan7 = text -> text.length() < 7;
        System.out.println(shorterThan7.test("Warszawa"));
        System.out.println(shorterThan7.test("Opole"));

        /////////////////////////////////////////////////////////////////////////
        System.out.println("\nConsumer");
        Consumer<Integer> integerPrinter = integer -> System.out.println("Wypisuję liczbę: " + integer);
        integerPrinter.accept(123);


    }


}
