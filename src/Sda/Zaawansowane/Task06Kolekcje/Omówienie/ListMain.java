package Sda.Zaawansowane.Task06Kolekcje.Omówienie;

import java.util.LinkedList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>();
        list1.add("Wrocław");
        list1.add("Poznań");
        list1.add("Gdańsk");
        list1.add("Warszawa");
        list1.add("Kraków");

        System.out.println(list1);
        System.out.println("Wartość elementu o indeksie 2: " + list1.get(2));
        System.out.println("Liczba elementów listy: " + list1.size());
        System.out.println("Czy lista zawiera element Gdańsk: " + list1.contains("Gdańsk"));
        System.out.println("Usuwamy element o indeksie 1.");
        list1.remove(1);
        System.out.println("Lista po usunięciu drugiego elementu (o indeksie 1): " + list1);
        list1.remove("Warszawa");
        System.out.println("Lista po usunięciu elementu Warszawa: " + list1);

        //szablon IntelliJ, z którego można skorzystać list.fori
        System.out.println("\nPętla fori");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Index: " + i + ", wartość elementu: " + list1.get(i));
        }

        System.out.println("\nPętla for-each");
        for (String element : list1) {
            System.out.println("Wartość elementu: " + element);
        }

        System.out.println("\nWywoływanie metody printEvenIndexElements");
        printEvenIndexElements(list1);

    }

    private static void printEvenIndexElements(List<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
    }
}
