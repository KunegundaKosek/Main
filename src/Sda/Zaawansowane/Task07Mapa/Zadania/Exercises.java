package Sda.Zaawansowane.Task07Mapa.Zadania;

import java.util.*;

public class Exercises {

    public static void main(String[] args) {

        System.out.println("-------- Zadanie 1 --------");
        
        excercise1();

        System.out.println("\n-------- Zadanie 2 --------");
        
        excercise2();

        System.out.println("\n-------- Zadanie 3 --------");
        
        List<String> stringList = Arrays.asList("aaa", "bbb", "ccc");
        System.out.println(excercise3(stringList));

        System.out.println("\n-------- Zadanie 4 --------");
        
        Map<String, String> plToEngDictionary = new HashMap<>();
        plToEngDictionary.put("dom", "house");
        plToEngDictionary.put("kot", "cat");
        plToEngDictionary.put("pies", "dog");
        System.out.println(excercise4(plToEngDictionary));
    }

    private static void excercise1() {
        Map<String, String> capitalByCountry = new HashMap<>();
        capitalByCountry.put("Polska", "Warszawa");
        capitalByCountry.put("Niemcy", "Berlin");
        capitalByCountry.put("Francja", "Paryż");

        //Wersja 1:
        System.out.println("Klucze: " + capitalByCountry.keySet());
        System.out.println("Wartości: " + capitalByCountry.values());

        //Wersja 2:
        System.out.println("\nKlucze: ");
        for (String key : capitalByCountry.keySet()) {
            System.out.println(key);
        }
        System.out.println("\nWartości: ");
        for (String value : capitalByCountry.values()) {
            System.out.println(value);
        }
    }

    private static void excercise2() {
        Map<String, Double> avgGradeByFullName = new HashMap<>();
        avgGradeByFullName.put("Jan Kowalski", 4.);
        avgGradeByFullName.put("Anna Nowak", 3.5);
        avgGradeByFullName.put("Piotr Nowak", 2.5);

        //Wersja 1:
        for (Map.Entry<String, Double> entry : avgGradeByFullName.entrySet()) {
            String fullName = entry.getKey();
            double avgGrade = entry.getValue();
            System.out.println("średnia osoby " + fullName + ": " + avgGrade);
        }

        //Wersja 2
        System.out.println("-------");
        for (String fullName : avgGradeByFullName.keySet()) {
            double avgGrade = avgGradeByFullName.get(fullName);
            System.out.println("średnia osoby " + fullName + ": " + avgGrade);
        }

        System.out.println("\nImiona i nazwisko osób, których średnia jest większa niż 3");
        for (Map.Entry<String, Double> entry : avgGradeByFullName.entrySet()) {
            double avgGrade = entry.getValue();
            if (avgGrade > 3) {
                String fullName = entry.getKey();
                System.out.println(fullName);
            }
        }
    }

    private static Map<Integer, String> excercise3(List<String> list) {
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            result.put(i, list.get(i));
        }
        return result;
    }

    private static Map<String, List<String>> excercise4(Map<String, String> map) {
        Map<String, List<String>> result = new HashMap<>();
        List<String> keys = new ArrayList<>(map.keySet());
        result.put("klucze", keys);
        List<String> values = new ArrayList<>(map.values());
        result.put("wartości", values);
        return result;
    }
}
