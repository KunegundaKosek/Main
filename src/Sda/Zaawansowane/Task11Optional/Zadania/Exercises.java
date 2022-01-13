package Sda.Zaawansowane.Task11Optional.Zadania;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Exercises {

    public static void main(String[] args) {

        exercise1and2();
        exercise3();
        exercise4();
        exercise5();

    }

    private static void exercise3() {
        System.out.println("\n---------- Zadanie 3 -----------");
        Collection<String> strings = Set.of("kubek", "grzebień", "abażur");
        strings.stream()
                .filter(string -> string.startsWith("ab"))
                .findFirst()
                .ifPresent(string -> System.out.println("W kolekcji znajduje się tekst: " + string));
    }

    private static void exercise1and2() {
        System.out.println("\n--------- Zadania 1 i 2 ------------");
        Collection<Integer> integers = List.of(57, 112, 32, 90, 150);
        Optional<Integer> optionalInteger = integers.stream()
                .filter(integer -> integer >= 100 && integer <= 115)
                .findFirst();
        if (optionalInteger.isPresent()) {
            System.out.println(optionalInteger.get());
        } else {
            System.out.println("brak wartości z przedziału 100 - 115");
        }
    }

    private static void exercise4() {
        System.out.println("\n------------ Zadanie 4 ---------");
        Optional<String> optionalString = Optional.empty();
        System.out.println(optionalString);

    }

    private static void exercise5() {
        System.out.println("\n--------- Zadanie 5 ---------");
        Optional<String> optionalString = Optional.of("aaa");
        System.out.println(optionalString);
    }
}
