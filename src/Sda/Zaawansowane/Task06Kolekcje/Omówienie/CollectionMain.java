package Sda.Zaawansowane.Task06Kolekcje.Omówienie;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMain {

    public static void main(String[] args) {

        Collection<String> collection1 = new ArrayList<>();

        collection1.add("aaa");
        collection1.add("bbb");
        collection1.add("ccc");
        collection1.add("ccc");
        System.out.println(collection1);
        System.out.println("Liczba elementów kolekcji: " + collection1.size());

        for (String element : collection1) {
            System.out.println(element);
        }
    }
}
