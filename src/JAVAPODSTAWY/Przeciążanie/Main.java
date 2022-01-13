package JAVAPODSTAWY.Przeciążanie;

public class Main {

    public static void main(String[] args) {

        Adder adder = new Adder();
        adder.add("5","5");
        adder.add(100,100);

        System.out.println(adder.add("5","5"));
        System.out.println(adder.add(100,100));
    }
}
