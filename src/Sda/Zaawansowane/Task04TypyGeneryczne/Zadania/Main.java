package Sda.Zaawansowane.Task04TypyGeneryczne.Zadania;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- Zadanie 1 ----------");

        Pair<Boolean, String> pair1 = new Pair<>(true, "Aaaaaaaa");
        System.out.println("Lewy element: " + pair1.getLeft());
        System.out.println("Prawy element: " + pair1.getRight());


        //zadanie 2.1

        List<String> stringList = new List<>("Gliwice,", "Opole", "Zielona Góra");


        System.out.println("\n---------- Zadanie 2.2 ----------");

        System.out.println("Pierwszy element listy: " + stringList.getFirst());
        System.out.println("Ostatni element listy: " + stringList.getLast());


        System.out.println("\n---------- Zadanie 2.3 ----------");

        System.out.println("Zastępujemy pierwszy (o indeksie 0) element listy elementem \"Zabrze\"");
        stringList.set(0, "Zabrze");
        System.out.println("Pierwszy element listy: " + stringList.getFirst());


        System.out.println("\n---------- Zadanie 2.4 ----------");

        System.out.println("Czy w liście występuje element: \"Szczecin\": " + stringList.contains("Szczecin"));
        System.out.println("Czy w liście występuje element: \"Opole\": " + stringList.contains("Opole"));


        System.out.println("\n---------- Dodatkowo: ----------");

        System.out.println("Element o indeksie 1: " + stringList.get(1));
        System.out.println("Liczba elementó listy: " + stringList.size());


        System.out.println("\n---------- Zadanie 2.5 - toString ----------");
        System.out.println("Lista: " + stringList);

        System.out.println("\n---------- Zadanie 2.5 - add ----------");
        System.out.println("Dodajemy elemnt \"Gniezno\"");
        stringList.add("Gniezno");
        System.out.println("Lista po dodaniu elementu: " + stringList);




    }
}
