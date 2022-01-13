package Sda.Zaawansowane.Task08ComparableTreeSetTreeMap;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("abc".compareTo("xyz"));
        System.out.println("abc".compareTo("abc"));
        System.out.println("xyz".compareTo("abc"));

        Car car1 = new Car(123, "Fiat Panda");
        Car car2 = new Car(50, "Ferrari F40");

        System.out.println(car1.compareTo(car2));

        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("jakieś");
        stringTreeSet.add("elementy");
        stringTreeSet.add("zbioru");
        stringTreeSet.add("typu");
        stringTreeSet.add("drzewiastego");
        System.out.println(stringTreeSet);

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("ccc", "333");
        treeMap.put("aaa", "111");
        treeMap.put("bbb", "222");
        System.out.println(treeMap);
    }
}
