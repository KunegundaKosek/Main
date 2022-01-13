package Sda.Zaawansowane.Task07Mapa.Omówienie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String, String> plToEngDictionary = new HashMap<>();

        plToEngDictionary.put("dom", "house");
        plToEngDictionary.put("kot", "cat");
        plToEngDictionary.put("pies", "dog");

        System.out.println(plToEngDictionary);

        plToEngDictionary.put("dom", "home");
        System.out.println("Mapa po modyfikacji wartości dla klucza \"dom\": " + plToEngDictionary);

        System.out.println(plToEngDictionary.get("kot"));

        System.out.println(plToEngDictionary.containsKey("pies"));

        plToEngDictionary.remove("kot");
        System.out.println("Mapa po usunięciu pary dla klucza \"kot\"\n: " + plToEngDictionary);

        Set<String> keySet = plToEngDictionary.keySet();
        System.out.println(keySet);

        Collection<String> values = plToEngDictionary.values();
        System.out.println(values);

        System.out.println("\nPrzebiegnięcie w pętli przez pary klucz -> wartość: ");
        Set<Map.Entry<String, String>> entries = plToEngDictionary.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
