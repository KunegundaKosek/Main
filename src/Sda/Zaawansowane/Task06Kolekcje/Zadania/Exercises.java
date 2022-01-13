package Sda.Zaawansowane.Task06Kolekcje.Zadania;

import java.util.ArrayList;
import java.util.List;

public class Exercises {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(5);
        integerList.add(83);

        System.out.println("--------- Zadanie 1 ----------");
        exercise1(integerList);

        System.out.println("--------- Zadanie 3 ----------");
        System.out.println(exercise3(integerList));


    }

    private static void exercise1(List<Integer> list) {
        for (Integer element : list) {
            System.out.println(element);
        }
    }

    private static double exercise3(List<Integer> list) {
        double sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum / list.size();

    }

}
