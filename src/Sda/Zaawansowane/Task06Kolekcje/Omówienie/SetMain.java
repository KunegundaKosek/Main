package Sda.Zaawansowane.Task06Kolekcje.Omówienie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Dariusz");
        set1.add("Bartosz");
        set1.add("Andrzej");
        set1.add("Celina");
        System.out.println(set1);

        set1.add("Celina");
        System.out.println(set1);

        set1.remove("Dariusz");
        System.out.println("Zbiór po usunięciu elementu \"Dariusz\": " + set1);
        System.out.println("Liczba elementów zbioru: " + set1.size());
        System.out.println(set1.contains("Dariusz"));

        System.out.println("Wywołanie elementów przy użyciu pętrli for-each: ");
        for (String element : set1) {
            System.out.println("Wartość elemntu: " + element);
        }

        System.out.println("\nWywyołanie metody printEvenIndexElements");

    }
}
